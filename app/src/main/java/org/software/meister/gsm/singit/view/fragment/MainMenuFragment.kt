package org.software.meister.gsm.singit.view.fragment

import org.koin.androidx.viewmodel.ext.android.getViewModel
import org.software.meister.gsm.singit.R
import org.software.meister.gsm.singit.base.BaseFragment
import org.software.meister.gsm.singit.databinding.FragmentMainMenuBinding
import org.software.meister.gsm.singit.viewmodel.fragment.MainMenuViewModel


class MainMenuFragment : BaseFragment<FragmentMainMenuBinding, MainMenuViewModel>(R.layout.fragment_main_menu) {
    override val viewModel: MainMenuViewModel
        get() = getViewModel(MainMenuViewModel::class)

    override fun init() {

    }

    override fun observerViewModel() {
        TODO("Not yet implemented")
    }
}