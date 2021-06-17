package org.software.meister.gsm.singit.di

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import org.software.meister.gsm.singit.viewmodel.activity.LoginViewModel
import org.software.meister.gsm.singit.viewmodel.activity.MainViewModel
import org.software.meister.gsm.singit.viewmodel.dialog.EmailCheckViewModel
import org.software.meister.gsm.singit.viewmodel.fragment.MainFragmentViewModel

val viewModelModules = module{
    viewModel { MainViewModel() }
    viewModel { LoginViewModel() }
    viewModel { EmailCheckViewModel() }
    viewModel { MainFragmentViewModel() }
}