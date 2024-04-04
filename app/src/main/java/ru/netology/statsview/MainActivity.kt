package ru.netology.statsview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.netology.nmedia.ui.StatsView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<StatsView>(R.id.stats).data = listOf(
            500F,
            500F,
            500F,
            500F,
        )
    }
}