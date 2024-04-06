package ru.netology.statsview

import android.animation.ObjectAnimator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.view.animation.LinearInterpolator
import android.widget.TextView
import ru.netology.nmedia.ui.StatsView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val view = findViewById<StatsView>(R.id.stats)
        view.data = listOf(
            500F,
            500F,
            500F,
            500F,
        )
//        ObjectAnimator.ofFloat(view, View.ROTATION, 360F).apply {
//            duration = 3000
//            interpolator = LinearInterpolator()
//        }.start()
//        val viewAnim = AnimationUtils.loadAnimation(
//            this, R.anim.animation
//        )
//
//        view.startAnimation(viewAnim)


        val textView = findViewById<TextView>(R.id.label)
        view.startAnimation(
            AnimationUtils.loadAnimation(this,R.anim.animation).apply {
                setAnimationListener(object : Animation.AnimationListener{
                    override fun onAnimationStart(animation: Animation?) {
                        textView.text = "onAimationStart"
                    }

                    override fun onAnimationEnd(animation: Animation?) {
                        textView.text = "onAimationEnd"
                    }

                    override fun onAnimationRepeat(animation: Animation?) {
                        textView.text = "onAimationRepeat"
                    }

                })
            }
        )
    }
}