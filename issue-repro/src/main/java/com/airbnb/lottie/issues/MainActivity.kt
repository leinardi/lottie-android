package com.airbnb.lottie.issues

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.airbnb.lottie.LottieCompositionFactory
import com.airbnb.lottie.LottieDrawable
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Reproduce any issues here.

        val lottieDrawable = LottieDrawable()

        LottieCompositionFactory.fromRawRes(this, R.raw.heart).addListener { lottieComposition ->
            lottieDrawable.composition = lottieComposition
            lottieDrawable.repeatCount = LottieDrawable.INFINITE
            lottieDrawable.scale = 0.5f
            lottieDrawable.playAnimation()
        }


        findViewById<MaterialButton>(R.id.button).apply {
            icon = lottieDrawable
        }
    }
}
