package dev.sanjaygangwar.tempproject.ui.fragment.home

import android.content.pm.ActivityInfo
import android.view.View
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
import androidx.media3.ui.AspectRatioFrameLayout
import androidx.media3.ui.PlayerControlView
import androidx.media3.ui.PlayerView
import dagger.hilt.android.AndroidEntryPoint
import dev.sanjaygangwar.tempproject.R
import dev.sanjaygangwar.tempproject.databinding.HomeBinding
import dev.sanjaygangwar.tempproject.ui.base.BaseFragment
import dev.sanjaygangwar.tempproject.utils.ToastUtil.mLog
import dev.sanjaygangwar.tempproject.utils.ToastUtil.mToast
import dev.sanjaygangwar.tempproject.utils.extenstionfuntions.ImageExtensions.hide
import dev.sanjaygangwar.tempproject.utils.extenstionfuntions.ImageExtensions.show
import dev.sanjaygangwar.tempproject.utils.network.retrofit.Resource
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.net.HttpURLConnection
import java.net.URL


@AndroidEntryPoint
class Home : BaseFragment<HomeBinding>(HomeBinding::inflate) {

    private lateinit var player: ExoPlayer
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
                    bind?.progressBar?.hide()
                    val data = value.data?.data
                    if (data?.mediaUrl.isNullOrEmpty() || data?.licenseUri?.isEmpty()!!) {
                        bind?.playerView?.hide()
                        context?.mToast("No video available")
                        return@observe
                    } else {
                        bind?.playerView?.show()
                    }

                    lifecycleScope.launch {
                        fetchVideoData(data.mediaUrl)
                    }
                    setupExoplayer(data.licenseUri, data.mediaUrl, bind?.playerView)
                }

                Resource.Status.ERROR -> {
                    bind?.progressBar?.hide()
                }
            }

        }
    }

    suspend fun fetchVideoData(mediaUrl: String) {
        try {
            val xmlString = withContext(Dispatchers.IO) {
                val connection = URL(mediaUrl).openConnection() as HttpURLConnection
                val inputStream = connection.inputStream
                inputStream.bufferedReader().use { it.readText() }
            }
            mLog("XML Data: $xmlString")
        } catch (e: Exception) {
            e.printStackTrace()
            mLog("Error fetching video data: ${e.message}")
        }
    }

    @OptIn(UnstableApi::class)
    private fun setupExoplayer(licenseUri: String?, mediaUrl: String?, playerView: PlayerView?) {
        // Release existing player if any
        if (this::player.isInitialized) {
            player.release()
        }

        // Check if licenseUri and mediaUrl are not null or empty
        if (licenseUri.isNullOrEmpty() || mediaUrl.isNullOrEmpty()) {
            context?.mToast("License URI or Media URL is empty")
            return
        }

        // Create MediaItem with DRM configuration
        val drmConfiguration = MediaItem.DrmConfiguration.Builder(C.WIDEVINE_UUID).setLicenseUri(licenseUri).build()
        val mediaItem = MediaItem.Builder()
            .setUri(mediaUrl)
            .setDrmConfiguration(drmConfiguration)
            .setMimeType(MimeTypes.APPLICATION_MPD)
            .build()

        // Initialize ExoPlayer with the MediaItem
        context?.let { context ->
            val dataSourceFactory = DefaultDataSource.Factory(context)
            val mediaSourceFactory = DefaultMediaSourceFactory(dataSourceFactory)

            // Create and configure the ExoPlayer instance
            player = ExoPlayer.Builder(context)
                .setMediaSourceFactory(mediaSourceFactory)
                .build()
                .also { exoPlayer ->

                    exoPlayer.setMediaItem(mediaItem)
                    exoPlayer.prepare()
                    exoPlayer.playWhenReady = true

                    playerView?.player = exoPlayer
                    toggleImmersiveMode()
                    playerView?.resizeMode = AspectRatioFrameLayout.RESIZE_MODE_FIT

                    playerView?.setControllerVisibilityListener(
                        PlayerControlView.VisibilityListener { visibility ->
                            bind?.btnZoom?.visibility = if (visibility == View.VISIBLE) View.VISIBLE else View.GONE
                        }
                    )

                    // --- Add listener to show/hide loader ---
                    exoPlayer.addListener(object : Player.Listener {
                        override fun onPlaybackStateChanged(state: Int) {
                            super.onPlaybackStateChanged(state)
                            when (state) {
                                Player.STATE_BUFFERING -> {
                                    bind?.progressBar?.visibility = View.VISIBLE
                                }

                                Player.STATE_READY,
                                Player.STATE_ENDED,
                                Player.STATE_IDLE -> {
                                    bind?.progressBar?.visibility = View.GONE
                                }
                            }
                        }
                    })
                }
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

    override fun onStop() {
        super.onStop()
        // Release the ExoPlayer when the fragment is stopped to free up resources
        player.release()
    }

}

private fun Home.toggleImmersiveMode() {
    // Set the window to not fit system windows, allowing for immersive mode
    WindowCompat.setDecorFitsSystemWindows(requireActivity().window, false)
    WindowInsetsControllerCompat(requireActivity().window, requireView()).apply {
        hide(WindowInsetsCompat.Type.systemBars())
        systemBarsBehavior = WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
    }
    requireActivity().requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE
}