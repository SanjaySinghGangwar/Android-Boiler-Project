package dev.sanjaygangwar.tempproject.ui.fragment.home

import android.view.View
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import dev.sanjaygangwar.tempproject.databinding.HomeBinding
import dev.sanjaygangwar.tempproject.models.entity.Characters
import dev.sanjaygangwar.tempproject.ui.fragment.home.adapter.HomeRecyclerAdapter
import dev.sanjaygangwar.tempproject.ui.base.BaseFragment
import dev.sanjaygangwar.tempproject.utils.extenstionfuntions.ImageExtensions.hide
import dev.sanjaygangwar.tempproject.utils.extenstionfuntions.ImageExtensions.show
import dev.sanjaygangwar.tempproject.utils.ToastUtil.mToast
import dev.sanjaygangwar.tempproject.utils.network.retrofit.Resource

@AndroidEntryPoint
class Home : BaseFragment<HomeBinding>(HomeBinding::inflate), HomeRecyclerAdapter.onClickListner {

    private val viewModel: HomeViewModel by viewModels()

    private val adapter by lazy {
        HomeRecyclerAdapter(requireContext(), this, true)
    }

    override suspend fun getDataFromTheServer() {

    }

    override fun initAllComponents() {
        bind?.recycler?.adapter = adapter
        bind?.recycler?.setHasFixedSize(true)

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
    }


    override fun initOnClickListener() {}
    override fun onViewClicker(p0: View?) {}

    override fun onItemCLicked(id: Characters) {
        context?.mToast(id.name)
        val action = HomeDirections.actionHome2ToSetting(id.name)
        action.navigate()
    }

}