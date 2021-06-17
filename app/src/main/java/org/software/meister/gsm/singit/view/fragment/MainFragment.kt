package org.software.meister.gsm.singit.view.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import org.koin.androidx.viewmodel.ext.android.getViewModel
import org.software.meister.gsm.singit.R
import org.software.meister.gsm.singit.base.BaseFragment
import org.software.meister.gsm.singit.databinding.FragmentMainBinding
import org.software.meister.gsm.singit.viewmodel.fragment.MainFragmentViewModel

class MainFragment : BaseFragment<FragmentMainBinding, MainFragmentViewModel>(R.layout.fragment_main) {
    override val viewModel: MainFragmentViewModel
        get() = getViewModel(MainFragmentViewModel::class)

    override fun init() {

    }

    override fun observerViewModel() {

    }

}