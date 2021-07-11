package org.software.meister.gsm.singit.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.koin.androidx.viewmodel.ext.android.getViewModel
import org.software.meister.gsm.singit.R
import org.software.meister.gsm.singit.base.BaseActivity
import org.software.meister.gsm.singit.databinding.ActivityChangePasswordBinding
import org.software.meister.gsm.singit.viewmodel.activity.ChangePasswordViewModel

class ChangePasswordActivity : BaseActivity<ChangePasswordViewModel, ActivityChangePasswordBinding>(R.layout.activity_change_password) {
    override val viewModel: ChangePasswordViewModel
        get() = getViewModel(ChangePasswordViewModel::class)

    override fun init() {

    }

    override fun observerViewModel() {

    }

}