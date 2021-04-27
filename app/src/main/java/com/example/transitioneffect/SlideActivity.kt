package com.example.transitioneffect

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.Fade
import android.transition.Slide

class SlideActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_slide)
        //进入退出效果
        window.enterTransition = Slide().setDuration(2000);
        window.exitTransition = Slide().setDuration(2000);
    }
}