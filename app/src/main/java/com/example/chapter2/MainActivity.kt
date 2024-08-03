package com.example.chapter2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var number: Int = 0

        val numberTextView = findViewById<TextView>(R.id.numberTextView)
        val resetButton = findViewById<Button>(R.id.resetButton)
        val plusButton = findViewById<Button>(R.id.plusButton)


        resetButton.setOnClickListener {
            number = 0
            numberTextView.text = number.toString()
            Log.d("onClick", "did tap reset button")
        }

        plusButton.setOnClickListener {
            number += 1
            numberTextView.text = number.toString()
            Log.d("onClick", "did tap plus button")

        }

    }
}