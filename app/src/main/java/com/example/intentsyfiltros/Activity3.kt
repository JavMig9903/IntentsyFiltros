package com.example.intentsyfiltros

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.intentsyfiltros.MainActivity.Companion.EJ1

class Activity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout3)

        val textv = findViewById<TextView>(R.id.textView)
        val str = intent.getStringExtra(EJ1)

        str?.let {
            textv.text = str.toString()
        }
    }
}