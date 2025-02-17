package dev.sanjaygangwar.tempproject.ui.fragment.home

import android.view.View
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import dev.sanjaygangwar.tempproject.databinding.HomeBinding
import dev.sanjaygangwar.tempproject.models.dataclass.Characters
import dev.sanjaygangwar.tempproject.ui.fragment.home.recycler.HomeRecyclerAdapter
import dev.sanjaygangwar.tempproject.utils.baseclasses.BaseFragment
import dev.sanjaygangwar.tempproject.utils.extenstionfuntions.Extensions.hide
import dev.sanjaygangwar.tempproject.utils.extenstionfuntions.Extensions.show
import dev.sanjaygangwar.tempproject.utils.mUtils.mToast
import dev.sanjaygangwar.tempproject.utils.retrofit.Resource

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