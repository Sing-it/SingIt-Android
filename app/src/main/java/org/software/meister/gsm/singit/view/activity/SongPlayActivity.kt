package org.software.meister.gsm.singit.view.activity

import android.widget.SeekBar
import android.widget.SeekBar.OnSeekBarChangeListener
import com.bumptech.glide.Glide
import jp.wasabeef.glide.transformations.BlurTransformation
import org.koin.androidx.viewmodel.ext.android.getViewModel
import org.software.meister.gsm.singit.R
import org.software.meister.gsm.singit.base.BaseActivity
import org.software.meister.gsm.singit.databinding.ActivitySongPlayBinding
import org.software.meister.gsm.singit.viewmodel.activity.SongPlayViewModel


class SongPlayActivity : BaseActivity<SongPlayViewModel, ActivitySongPlayBinding>(R.layout.activity_song_play){
    override val viewModel: SongPlayViewModel
        get() = getViewModel(SongPlayViewModel::class)

    override fun init() {
        Glide.with(this).load(R.drawable.test_image).transform(BlurTransformation(20, 10)).into(binding.imageView9)
        binding.imageView18.setImageResource(R.drawable.like)
    }

    override fun observerViewModel() {

    }

}