package org.software.meister.gsm.singit.view.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import org.koin.androidx.viewmodel.ext.android.getViewModel
import org.software.meister.gsm.singit.R
import org.software.meister.gsm.singit.base.BaseFragment
import org.software.meister.gsm.singit.databinding.FragmentSearchListBinding
import org.software.meister.gsm.singit.viewmodel.fragment.SearchListViewModel


class SearchListFragment : BaseFragment<FragmentSearchListBinding, SearchListViewModel>(R.layout.fragment_search_list) {
    override val viewModel: SearchListViewModel
        get() = getViewModel(SearchListViewModel::class)

    override fun init() {

    }

    override fun observerViewModel() {

    }

}