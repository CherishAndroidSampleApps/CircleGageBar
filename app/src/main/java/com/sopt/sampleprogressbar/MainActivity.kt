package com.sopt.sampleprogressbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jackandphantom.circularprogressbar.CircleProgressbar

class MainActivity : AppCompatActivity() {
    private lateinit var circleProgressbar: CircleProgressbar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        circleProgressbar = findViewById(R.id.test)

        val animationDuration = 2500
        circleProgressbar.setProgressWithAnimation(65.0f,animationDuration)
    }
}