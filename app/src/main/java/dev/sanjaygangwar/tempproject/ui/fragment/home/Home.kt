package dev.sanjaygangwar.tempproject.ui.fragment.home

import android.content.pm.ActivityInfo
import android.view.View
import androidx.fragment.app.viewModels
import androidx.media3.common.C
import androidx.media3.common.MediaItem
import androidx.media3.common.MimeTypes
import androidx.media3.datasource.DefaultDataSource
import androidx.media3.exoplayer.ExoPlayer
import androidx.media3.exoplayer.source.DefaultMediaSourceFactory
import dagger.hilt.android.AndroidEntryPoint
import dev.sanjaygangwar.tempproject.databinding.HomeBinding
import dev.sanjaygangwar.tempproject.models.entity.Characters
import dev.sanjaygangwar.tempproject.ui.base.BaseFragment
import dev.sanjaygangwar.tempproject.ui.fragment.home.adapter.HomeRecyclerAdapter
import dev.sanjaygangwar.tempproject.utils.extenstionfuntions.ImageExtensions.hide
import dev.sanjaygangwar.tempproject.utils.extenstionfuntions.ImageExtensions.show
import dev.sanjaygangwar.tempproject.utils.network.retrofit.Resource

@AndroidEntryPoint
class Home : BaseFragment<HomeBinding>(HomeBinding::inflate), HomeRecyclerAdapter.onClickListner {

    private lateinit var player: ExoPlayer
    private val licenseUri = "https://cwip-shaka-proxy.appspot.com/no_auth"
    private val mediaUrl = "https://bitmovin-a.akamaihd.net/content/art-of-motion_drm/mpds/11331.mpd"
    private val viewModel: HomeViewModel by viewModels()

    private val adapter by lazy {
        HomeRecyclerAdapter(requireContext(), this, true)
    }

    override suspend fun getDataFromTheServer() {

    }

    override fun initAllComponents() {

    }

    override fun initAllObserver() {
        viewModel.data.observe(viewLifecycleOwner) { value ->
            when (value.status) {
                Resource.Status.LOADING -> {
                    bind?.progressBar?.show()
                }

                Resource.Status.SUCCESS -> {
                    bind?.progressBar?.hide()
                    value.data?.let { adapter.setItems(it as ArrayList) }
                }

                Resource.Status.ERROR -> {
                    bind?.progressBar?.hide()
                }
            }

        }
        val playerView = bind?.playerView

        val drmConfiguration = MediaItem.DrmConfiguration.Builder(C.WIDEVINE_UUID).setLicenseUri(licenseUri).build()

        val mediaItem = MediaItem.Builder().setUri(mediaUrl).setDrmConfiguration(drmConfiguration).setMimeType(MimeTypes.APPLICATION_MPD).build()

        context?.let { context ->
            val dataSourceFactory = DefaultDataSource.Factory(context)
            val mediaSourceFactory = DefaultMediaSourceFactory(dataSourceFactory)

            player = ExoPlayer.Builder(context).setMediaSourceFactory(mediaSourceFactory).build().also {
                    it.setMediaItem(mediaItem)
                    it.prepare()
                    it.playWhenReady = true
                    playerView?.player = it // 👈 Move this inside .also block to guarantee binding
                    requireActivity().requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE
                }
        }
    }


    override fun initOnClickListener() {}
    override fun onViewClicker(p0: View?) {}
    override fun onItemCLicked(id: Characters) {}

    override fun onStop() {
        super.onStop()
        player.release()
    }

}