package com.example.intentsyfiltros

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import com.example.intentsyfiltros.MainActivity.Companion.EJ1

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout2)

        val eleccion = 0
        val imageV = findViewById<ImageView>(R.id.im2)
        val img = intent.getIntExtra(EJ1,eleccion)
        img?.let {
            if(img==1){
                imageV.setImageResource(R.mipmap.ibai_foreground)
            }else{
                imageV.setImageResource(R.mipmap.g2house_foreground)
            }
        }
    }
}