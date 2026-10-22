package com.example.savestateapp


import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val nom = findViewById<EditText>(R.id.editnom)
        val button = findViewById<Button>(R.id.afficher)
        val textView = findViewById<TextView>(R.id.Bienvenue)

        button.setOnClickListener {
            val nom = nom.text.toString()
            textView.text = "Bienvenue ${nom}!!!"
        }

        }
    }
