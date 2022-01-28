package com.nyx.multiplicationtable

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(), OnMultiplierClickListener {
    private lateinit var recycler: RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        recycler = findViewById(R.id.recycler)
        recycler.layoutManager = LinearLayoutManager(this)
        val adapter = Adapter(
            listOf<Multiplier>(
                Multiplier(1),
                Multiplier(2),
                Multiplier(3),
                Multiplier(4),
                Multiplier(5),
                Multiplier(6),
                Multiplier(7),
                Multiplier(8),
                Multiplier(9),
            ),
            this
        )
        recycler.adapter = adapter
    }


    override fun onMultiplierClick(multiplier: Int) {
        val intent = Intent(this, MultiplicationActivity::class.java)
        startActivityForResult(intent, 0)
    }
}


