package dev.sanjaygangwar.tempproject.ui.fragment.home

import android.content.pm.ActivityInfo
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.annotation.OptIn
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.media3.common.C
import androidx.media3.common.MediaItem
import androidx.media3.common.MimeTypes
import androidx.media3.common.Player
import androidx.media3.common.util.UnstableApi
import androidx.media3.datasource.DefaultDataSource
import androidx.media3.exoplayer.ExoPlayer
import androidx.media3.exoplayer.source.DefaultMediaSourceFactory
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector
import androidx.media3.ui.AspectRatioFrameLayout
import androidx.media3.ui.PlayerControlView
import androidx.media3.ui.PlayerView
import dagger.hilt.android.AndroidEntryPoint
import dev.sanjaygangwar.tempproject.R
import dev.sanjaygangwar.tempproject.databinding.HomeBinding
import dev.sanjaygangwar.tempproject.models.data.Resolution
import dev.sanjaygangwar.tempproject.models.data.VideoModelData
import dev.sanjaygangwar.tempproject.ui.base.BaseFragment
import dev.sanjaygangwar.tempproject.utils.ToastUtil.mLog
import dev.sanjaygangwar.tempproject.utils.ToastUtil.mToast
import dev.sanjaygangwar.tempproject.utils.extenstionfuntions.ImageExtensions.hide
import dev.sanjaygangwar.tempproject.utils.extenstionfuntions.ImageExtensions.show
import dev.sanjaygangwar.tempproject.utils.network.retrofit.Resource
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.io.ByteArrayInputStream
import java.net.URL
import javax.xml.parsers.DocumentBuilderFactory


@UnstableApi
@AndroidEntryPoint
class Home : BaseFragment<HomeBinding>(HomeBinding::inflate) {

    private lateinit var player: ExoPlayer
    private lateinit var trackSelector: DefaultTrackSelector
    private val viewModel: HomeViewModel by viewModels()
    private var isZoomed = false


    override suspend fun getDataFromTheServer() {
        viewModel.fetchVideoData()
    }

    override fun initAllComponents() {
        clickableViews = listOf(bind?.btnZoom)
    }

    override fun initAllObserver() {
        viewModel.videoData.observe(viewLifecycleOwner) { value ->
            when (value.status) {
                Resource.Status.LOADING -> {
                    bind?.progressBar?.show()
                }

                Resource.Status.SUCCESS -> {
                    handleVideoData(value)
                }

                Resource.Status.ERROR -> {
                    bind?.progressBar?.hide()
                }
            }

        }
    }

    private fun handleVideoData(value: Resource<VideoModelData>?) {

        bind?.progressBar?.hide()
        val data = value?.data?.data
        if (data?.mediaUrl.isNullOrEmpty() || data?.licenseUri?.isEmpty()!!) {
            bind?.playerView?.hide()
            context?.mToast("No video available")
            return
        } else {
            bind?.playerView?.show()
        }

        lifecycleScope.launch {
            fetchVideoData(data.mediaUrl, { resolutionList ->
                // Update your Spinner or Resolution Selector UI
                val adapter = ArrayAdapter(requireContext(), android.R.layout.simple_spinner_item, resolutionList.map { it.label })
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
                bind?.resolutionSpinner?.adapter = adapter

                // Set the initial selection to the first resolution
                bind?.resolutionSpinner?.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                    override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                        val selected = resolutionList[position]
                        if (this@Home::player.isInitialized && this@Home::trackSelector.isInitialized) {
                            // Update the track selector parameters to set the selected resolution
                            val parameters = trackSelector.buildUponParameters().setMaxVideoSize(selected.width, selected.height).setMinVideoSize(selected.width, selected.height).build()
                            trackSelector.parameters = parameters
                        }
                    }

                    override fun onNothingSelected(parent: AdapterView<*>) {}
                }
            })
        }
        // Set up the ExoPlayer with the fetched video data
        setupExoplayer(data.licenseUri, data.mediaUrl, bind?.playerView)
    }

    suspend fun fetchVideoData(
        mediaUrl: String,
        onResolutionsParsed: (List<Resolution>) -> Unit,
        ioDispatcher: CoroutineDispatcher = Dispatchers.IO,
        defaultDispatcher: CoroutineDispatcher = Dispatchers.Default
    ) {
        try {
            // Fetch the MPD XML from the media URL
            val xmlString = withContext(ioDispatcher) {
                URL(mediaUrl).openStream().bufferedReader().use { it.readText() }
            }
            val resolutions = withContext(defaultDispatcher) {
                parseResolutionsFromMPD(xmlString)
            }
            onResolutionsParsed(resolutions)

        } catch (e: Exception) {
            e.printStackTrace()
            mLog("Error fetching video data: ${e.message}")
        }
    }


    fun parseResolutionsFromMPD(mpdXml: String): List<Resolution> {
        // Parse the MPD XML to extract resolutions
        val resolutions = mutableListOf<Resolution>()
        val factory = DocumentBuilderFactory.newInstance()
        val builder = factory.newDocumentBuilder()
        val inputStream = ByteArrayInputStream(mpdXml.toByteArray())
        val doc = builder.parse(inputStream)

        // Normalize the document to avoid issues with whitespace
        val representations = doc.getElementsByTagName("Representation")
        for (i in 0 until representations.length) {
            val node = representations.item(i)
            val attrs = node.attributes
            val width = attrs.getNamedItem("width")?.nodeValue?.toIntOrNull() ?: continue
            val height = attrs.getNamedItem("height")?.nodeValue?.toIntOrNull() ?: continue
            val id = attrs.getNamedItem("id")?.nodeValue ?: continue
            val bandwidth = attrs.getNamedItem("bandwidth")?.nodeValue?.toIntOrNull() ?: 0

            val label = "${height}p"
            // Create a Resolution object and add it to the list
            resolutions.add(Resolution(label, width, height, id, bandwidth))
        }

        return resolutions.sortedBy { it.height } // Optional: sort ascending
    }

    @OptIn(UnstableApi::class)
    private fun setupExoplayer(licenseUri: String?, mediaUrl: String?, playerView: PlayerView?) {
        // Release existing player if any
        if (this::player.isInitialized) {
            player.release()
        }

        context?.let { trackSelector = DefaultTrackSelector(it) }

        // Check if licenseUri and mediaUrl are not null or empty
        if (licenseUri.isNullOrEmpty() || mediaUrl.isNullOrEmpty()) {
            context?.mToast("License URI or Media URL is empty")
            return
        }

        // Create MediaItem with DRM configuration
        val drmConfiguration = MediaItem.DrmConfiguration.Builder(C.WIDEVINE_UUID).setLicenseUri(licenseUri).build()
        val mediaItem = MediaItem.Builder().setUri(mediaUrl).setDrmConfiguration(drmConfiguration).setMimeType(MimeTypes.APPLICATION_MPD).build()

        // Initialize ExoPlayer with the MediaItem
        context?.let { context ->
            val dataSourceFactory = DefaultDataSource.Factory(context)
            val mediaSourceFactory = DefaultMediaSourceFactory(dataSourceFactory)

            // Create and configure the ExoPlayer instance
            player = ExoPlayer.Builder(context).setMediaSourceFactory(mediaSourceFactory).setTrackSelector(trackSelector).build().also { exoPlayer ->

                exoPlayer.setMediaItem(mediaItem)
                exoPlayer.prepare()
                exoPlayer.playWhenReady = true

                playerView?.player = exoPlayer
                playerView?.resizeMode = AspectRatioFrameLayout.RESIZE_MODE_FIT

                // Set the player view's resize mode to fit
                playerView?.setControllerVisibilityListener(
                    PlayerControlView.VisibilityListener { visibility ->
                        bind?.resolutionSpinner?.visibility = if (visibility == View.VISIBLE) View.VISIBLE else View.GONE
                        bind?.btnZoom?.visibility = if (visibility == View.VISIBLE) View.VISIBLE else View.GONE
                    })

                // Add a listener to handle playback state changes
                exoPlayer.addListener(object : Player.Listener {
                    override fun onPlaybackStateChanged(state: Int) {
                        super.onPlaybackStateChanged(state)
                        when (state) {
                            Player.STATE_BUFFERING -> {
                                bind?.progressBar?.visibility = View.VISIBLE
                            }

                            Player.STATE_READY, Player.STATE_ENDED, Player.STATE_IDLE -> {
                                bind?.progressBar?.visibility = View.GONE
                            }
                        }
                    }
                })
            }
            // Set the initial resize mode to fit
            toggleImmersiveMode()
        }
    }

    override fun initOnClickListener() {}

    override fun onViewClicker(p0: View?) {
        // Handle click events for the zoom button
        when (p0?.id) {
            bind?.btnZoom?.id -> {
                toggleZoom()
            }
        }
    }

    @OptIn(UnstableApi::class)
    private fun toggleZoom() {
        // Toggle zoom state and update the player view's resize mode
        isZoomed = !isZoomed
        bind?.playerView?.resizeMode = if (isZoomed) {
            AspectRatioFrameLayout.RESIZE_MODE_ZOOM
        } else {
            AspectRatioFrameLayout.RESIZE_MODE_FIT
        }

        // Update the zoom button icon based on the zoom state
        val newIconRes = if (isZoomed) R.drawable.exit_zoom_icon else R.drawable.zoom_icon
        bind?.btnZoom?.setImageResource(newIconRes)
    }

    override fun onPause() {
        super.onPause()
        // Pause playback when the fragment is paused to save resources
        if (this::player.isInitialized) {
            player.playWhenReady = false
            player.pause()
        }
    }

    override fun onResume() {
        super.onResume()
        // Resume playback if the player is initialized
        if (this::player.isInitialized) {
            player.playWhenReady = true
            player.play()
        }
    }


    override fun onDestroy() {
        super.onDestroy()
        // Release the player when the fragment is destroyed to free up resources
        player.release()
    }
}


@OptIn(UnstableApi::class)
private fun Home.toggleImmersiveMode() {
    // Set the window to not fit system windows, allowing for immersive mode
    WindowCompat.setDecorFitsSystemWindows(requireActivity().window, false)
    WindowInsetsControllerCompat(requireActivity().window, requireView()).apply {
        hide(WindowInsetsCompat.Type.systemBars())
        systemBarsBehavior = WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
    }
    requireActivity().requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE
}