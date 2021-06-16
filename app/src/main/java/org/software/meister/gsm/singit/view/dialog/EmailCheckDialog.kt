package org.software.meister.gsm.singit.view.dialog

import org.koin.androidx.viewmodel.ext.android.getViewModel
import org.software.meister.gsm.singit.R
import org.software.meister.gsm.singit.base.BaseDialog
import org.software.meister.gsm.singit.databinding.DialogEmailCheckBinding
import org.software.meister.gsm.singit.viewmodel.dialog.EmailCheckViewModel

class EmailCheckDialog : BaseDialog<DialogEmailCheckBinding, EmailCheckViewModel>(R.layout.dialog_email_check) {
    override val viewModel: EmailCheckViewModel
        get() = getViewModel(EmailCheckViewModel::class)

    override fun init() {

    }

    override fun observerViewModel() {

    }
}