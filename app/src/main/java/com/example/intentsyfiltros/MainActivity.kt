package com.example.intentsyfiltros

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    companion object {
        const val EJ1 = "VARIABLE1"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val boton1 = findViewById<Button>(R.id.button)
        val boton2 = findViewById<Button>(R.id.button2)
        val edText1 = findViewById<EditText>(R.id.et1)
        val boton3 = findViewById<Button>(R.id.button3)

        boton1.setOnClickListener {
            val intent =  Intent ( this, Activity2 :: class .java)
            intent.putExtra(EJ1,1)
            startActivity (intent)
        }

        boton2.setOnClickListener {
            val intent =  Intent ( this, Activity3 :: class .java)
            intent.putExtra(EJ1,("El edit text de la activity anterior tenía una longitud de "+edText1.text.toString().length+" caracteres"))
            startActivity (intent)
        }

        boton3.setOnClickListener {
            val random = Random.nextInt(0,10)
            if (random<5){
                val intent =  Intent ( this, Activity2 :: class .java)
                intent.putExtra(EJ1,random)
                startActivity (intent)
            }else{
                val intent =  Intent ( this, Activity3 :: class .java)
                intent.putExtra(EJ1,("El edit text de la activity anterior contenía: "+edText1.text.toString().toUpperCase()))
                startActivity (intent)
            }
        }


    }
}