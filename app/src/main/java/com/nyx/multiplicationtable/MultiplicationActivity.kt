package com.nyx.multiplicationtable

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class MultiplicationActivity : AppCompatActivity() {
    private lateinit var statistics: ImageButton
    private lateinit var onwards: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_multiplication)

        statistics = findViewById(R.id.statistics)
        onwards = findViewById(R.id.onwards)
        statistics.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivityForResult(intent, 0)
        }
        onwards.setOnClickListener {
            val intent = Intent(this, PracticeActivity::class.java)
            startActivityForResult(intent, 0)
        }
    }
}