package dev.sanjaygangwar.tempproject.ui.fragment.home

import android.view.View
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import dev.sanjaygangwar.tempproject.databinding.HomeBinding
import dev.sanjaygangwar.tempproject.utils.baseclasses.BaseFragment
import dev.sanjaygangwar.tempproject.utils.extenstionfuntions.Extensions.hide
import dev.sanjaygangwar.tempproject.utils.extenstionfuntions.Extensions.show
import dev.sanjaygangwar.tempproject.utils.retrofit.Resource

@AndroidEntryPoint
class Home : BaseFragment<HomeBinding>(HomeBinding::inflate) {

    private val viewModel: HomeViewModel by viewModels()
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
                    //todo updated recycler view
                }

                Resource.Status.ERROR -> {
                    bind?.progressBar?.hide()
                }
            }

        }
    }
    override fun initOnClickListener() {}
    override fun onViewClicker(p0: View?) {}

}