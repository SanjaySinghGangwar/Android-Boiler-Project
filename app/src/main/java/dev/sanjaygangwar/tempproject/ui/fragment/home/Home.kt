package dev.sanjaygangwar.tempproject.ui.fragment.home

import android.content.pm.ActivityInfo
import android.view.View
import androidx.annotation.OptIn
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import androidx.fragment.app.viewModels
import androidx.media3.common.C
import androidx.media3.common.MediaItem
import androidx.media3.common.MimeTypes
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
import dev.sanjaygangwar.tempproject.utils.extenstionfuntions.ImageExtensions.hide
import dev.sanjaygangwar.tempproject.utils.extenstionfuntions.ImageExtensions.show
import dev.sanjaygangwar.tempproject.utils.network.retrofit.Resource


@AndroidEntryPoint
class Home : BaseFragment<HomeBinding>(HomeBinding::inflate) {

    private lateinit var player: ExoPlayer
    private val licenseUri = "https://cwip-shaka-proxy.appspot.com/no_auth"
    private val mediaUrl = "https://bitmovin-a.akamaihd.net/content/art-of-motion_drm/mpds/11331.mpd"
    private val viewModel: HomeViewModel by viewModels()
    private var isZoomed = false


    override suspend fun getDataFromTheServer() {}
    override fun initAllComponents() {
        clickableViews = listOf(bind?.btnZoom)
    }

    override fun initAllObserver() {
        viewModel.data.observe(viewLifecycleOwner) { value ->
            when (value.status) {
                Resource.Status.LOADING -> {
                    bind?.progressBar?.show()
                }

                Resource.Status.SUCCESS -> {
                    bind?.progressBar?.hide()
                    setupExoplayer(mediaUrl, bind?.playerView)
                }

                Resource.Status.ERROR -> {
                    bind?.progressBar?.hide()
                }
            }

        }
    }

    @OptIn(UnstableApi::class)
    private fun setupExoplayer(mediaUrl: String, playerView: PlayerView?) {
        // Release existing player if any
        if (this::player.isInitialized) {
            player.release()
        }

        val drmConfiguration = MediaItem.DrmConfiguration.Builder(C.WIDEVINE_UUID)
            .setLicenseUri(licenseUri)
            .build()

        val mediaItem = MediaItem.Builder()
            .setUri(mediaUrl)
            .setDrmConfiguration(drmConfiguration)
            .setMimeType(MimeTypes.APPLICATION_MPD)
            .build()

        context?.let { context ->
            val dataSourceFactory = DefaultDataSource.Factory(context)
            val mediaSourceFactory = DefaultMediaSourceFactory(dataSourceFactory)

            player = ExoPlayer.Builder(context)
                .setMediaSourceFactory(mediaSourceFactory)
                .build()
                .also {
                    it.setMediaItem(mediaItem)
                    it.prepare()
                    it.playWhenReady = true
                    playerView?.player = it
                    toggleImmersiveMode()

                    playerView?.setControllerVisibilityListener(
                        PlayerControlView.VisibilityListener { visibility ->
                            // Example: Show or hide a custom button with the controls
                            bind?.btnZoom?.visibility = if (visibility == View.VISIBLE) View.VISIBLE else View.GONE
                        }
                    )


                }
        }
    }


    @UnstableApi
    override fun initOnClickListener() {
    }

    override fun onViewClicker(p0: View?) {
        when (p0?.id) {
            bind?.btnZoom?.id -> {
                toggleZoom()
            }
        }
    }

    @OptIn(UnstableApi::class)
    private fun toggleZoom() {
        isZoomed = !isZoomed
        bind?.playerView?.resizeMode = if (isZoomed) {
            AspectRatioFrameLayout.RESIZE_MODE_ZOOM
        } else {
            AspectRatioFrameLayout.RESIZE_MODE_FIT
        }
        val newIconRes = if (isZoomed) R.drawable.exit_zoom_icon else R.drawable.zoom_icon
        bind?.btnZoom?.setImageResource(newIconRes)
    }

    override fun onStop() {
        super.onStop()
        player.release()
    }

}

private fun Home.toggleImmersiveMode() {
    WindowCompat.setDecorFitsSystemWindows(requireActivity().window, false)
    WindowInsetsControllerCompat(requireActivity().window, requireView()).apply {
        hide(WindowInsetsCompat.Type.systemBars())
        systemBarsBehavior = WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
    }
    requireActivity().requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE
}