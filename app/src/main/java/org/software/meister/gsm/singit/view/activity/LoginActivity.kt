package org.software.meister.gsm.singit.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.koin.androidx.viewmodel.ext.android.getViewModel
import org.software.meister.gsm.singit.R
import org.software.meister.gsm.singit.base.BaseActivity
import org.software.meister.gsm.singit.databinding.ActivityLoginBinding
import org.software.meister.gsm.singit.viewmodel.activity.LoginViewModel

class LoginActivity : BaseActivity<LoginViewModel, ActivityLoginBinding>(R.layout.activity_login) {
    override val viewModel: LoginViewModel
        get() = getViewModel(LoginViewModel::class)

    override fun init() {

    }

    override fun observerViewModel() {

    }

}