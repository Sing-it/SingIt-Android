package org.software.meister.gsm.singit.di

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import org.software.meister.gsm.singit.viewmodel.activity.*
import org.software.meister.gsm.singit.viewmodel.dialog.EmailCheckViewModel
import org.software.meister.gsm.singit.viewmodel.fragment.MainFragmentViewModel
import org.software.meister.gsm.singit.viewmodel.fragment.MainMenuViewModel
import org.software.meister.gsm.singit.viewmodel.fragment.MenuViewModel

val viewModelModules = module{
    viewModel { MainViewModel() }
    viewModel { LoginViewModel() }
    viewModel { EmailCheckViewModel() }
    viewModel { MainFragmentViewModel() }
    viewModel { MenuViewModel() }
    viewModel { SongPlayViewModel() }
    viewModel { MainMenuViewModel() }
    viewModel { PlayListViewModel() }
    viewModel { ChangePasswordViewModel() }
}