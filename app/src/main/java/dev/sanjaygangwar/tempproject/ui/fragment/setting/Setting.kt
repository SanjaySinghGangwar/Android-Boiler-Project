package dev.sanjaygangwar.tempproject.ui.fragment.setting

import android.view.View
import androidx.navigation.fragment.navArgs
import dev.sanjaygangwar.tempproject.databinding.SettingBinding
import dev.sanjaygangwar.tempproject.ui.base.BaseFragment
import dev.sanjaygangwar.tempproject.utils.ToastUtil.mLog

class Setting : BaseFragment<SettingBinding>(SettingBinding::inflate) {

    val args: SettingArgs by navArgs()

    override suspend fun getDataFromTheServer() {
        mLog("DEEPLINK VLAUE IS :: " + args.userID)
    }

    override fun initAllComponents() {
        bind?.name?.text = args.userID
    }

    override fun initAllObserver() {}

    override fun initOnClickListener() {}

    override fun onViewClicker(p0: View?) {}

}