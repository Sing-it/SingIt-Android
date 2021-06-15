package org.software.meister.gsm.singit.view.activity

import org.koin.androidx.viewmodel.ext.android.getViewModel
import org.software.meister.gsm.singit.R
import org.software.meister.gsm.singit.base.BaseActivity
import org.software.meister.gsm.singit.databinding.ActivitySignUpBinding
import org.software.meister.gsm.singit.viewmodel.activity.SignUpViewModel

class SignUpActivity : BaseActivity<SignUpViewModel, ActivitySignUpBinding>(R.layout.activity_sign_up) {
    override val viewModel: SignUpViewModel
        get() = getViewModel(SignUpViewModel::class)

    override fun init() {

    }

    override fun observerViewModel() {

    }

}