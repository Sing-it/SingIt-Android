package org.software.meister.gsm.singit.view.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import org.koin.androidx.viewmodel.ext.android.getViewModel
import org.software.meister.gsm.singit.R
import org.software.meister.gsm.singit.base.BaseFragment
import org.software.meister.gsm.singit.databinding.FragmentPlayListBinding
import org.software.meister.gsm.singit.viewmodel.fragment.PlayListFragmentViewModel


class PlayListFragment : BaseFragment<FragmentPlayListBinding, PlayListFragmentViewModel>(R.layout.fragment_play_list) {
    override val viewModel: PlayListFragmentViewModel
        get() = getViewModel(PlayListFragmentViewModel::class)

    override fun init() {

    }

    override fun observerViewModel() {

    }

}