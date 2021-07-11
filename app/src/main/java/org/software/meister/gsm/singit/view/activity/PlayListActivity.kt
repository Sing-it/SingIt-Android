package org.software.meister.gsm.singit.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.koin.androidx.viewmodel.ext.android.getViewModel
import org.software.meister.gsm.singit.R
import org.software.meister.gsm.singit.base.BaseActivity
import org.software.meister.gsm.singit.databinding.ActivityPlayListBinding
import org.software.meister.gsm.singit.viewmodel.activity.PlayListViewModel

class PlayListActivity : BaseActivity<PlayListViewModel, ActivityPlayListBinding>(R.layout.activity_play_list) {
    override val viewModel: PlayListViewModel
        get() = getViewModel(PlayListViewModel::class)

    override fun init() {

    }

    override fun observerViewModel() {

    }
}