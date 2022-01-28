package com.nyx.multiplicationtable

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel

class PracticeActivity : AppCompatActivity() {
    private lateinit var button0: Button
    private lateinit var button1: Button
    private lateinit var button2: Button
    private lateinit var button3: Button
    private lateinit var button4: Button
    private lateinit var button5: Button
    private lateinit var button6: Button
    private lateinit var button7: Button
    private lateinit var button8: Button
    private lateinit var button9: Button
    private lateinit var deleteButton: Button
    private lateinit var textView: TextView

    val viewModel: PracticeViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_practice)

        button0 = findViewById(R.id.button_0)
        button1 = findViewById(R.id.button_1)
        button2 = findViewById(R.id.button_2)
        button3 = findViewById(R.id.button_3)
        button4 = findViewById(R.id.button_4)
        button5 = findViewById(R.id.button_5)
        button6 = findViewById(R.id.button_6)
        button7 = findViewById(R.id.button_7)
        button8 = findViewById(R.id.button_8)
        button9 = findViewById(R.id.button_9)
        deleteButton = findViewById(R.id.delete_button)
        textView = findViewById(R.id.text_view)

        button0.setOnClickListener {
            viewModel.input += "0"
            textView.text = viewModel.input
        }
        button1.setOnClickListener {
            viewModel.input += "1"
            textView.text = viewModel.input
        }
        button2.setOnClickListener {
            textView.text = "2"
        }
        button3.setOnClickListener {
            textView.text = "3"
        }
        button4.setOnClickListener {
            textView.text = "4"
        }
        button5.setOnClickListener {
            textView.text = "5"
        }
        button6.setOnClickListener {
            textView.text = "6"
        }
        button7.setOnClickListener {
            textView.text = "7"
        }
        button8.setOnClickListener {
            textView.text = "8"
        }
        button9.setOnClickListener {
            textView.text = "9"
        }
        deleteButton.setOnClickListener {
            val input = viewModel.input
            viewModel.input = input.substring(0, input.length - 1)
            textView.text = viewModel.input
        }
    }
}