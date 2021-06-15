package org.software.meister.gsm.singit.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.koin.androidx.viewmodel.ext.android.getViewModel
import org.software.meister.gsm.singit.R
import org.software.meister.gsm.singit.base.BaseActivity
import org.software.meister.gsm.singit.base.BaseViewModel
import org.software.meister.gsm.singit.databinding.ActivityMainBinding
import org.software.meister.gsm.singit.viewmodel.activity.MainViewModel

class MainActivity : BaseActivity<MainViewModel, ActivityMainBinding>(R.layout.activity_main) {
    override val viewModel: MainViewModel
        get() = getViewModel(MainViewModel::class)

    override fun init() {

    }

    override fun observerViewModel() {

    }

}