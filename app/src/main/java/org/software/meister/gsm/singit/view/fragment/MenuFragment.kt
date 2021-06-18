package org.software.meister.gsm.singit.view.fragment

import org.koin.androidx.viewmodel.ext.android.getViewModel
import org.software.meister.gsm.singit.R
import org.software.meister.gsm.singit.base.BaseFragment
import org.software.meister.gsm.singit.databinding.FragmentMenuBinding
import org.software.meister.gsm.singit.viewmodel.fragment.MenuViewModel


class MenuFragment : BaseFragment<FragmentMenuBinding, MenuViewModel>(R.layout.fragment_menu) {
    override val viewModel: MenuViewModel
        get() = getViewModel(MenuViewModel::class)

    override fun init() {

    }

    override fun observerViewModel() {

    }

}