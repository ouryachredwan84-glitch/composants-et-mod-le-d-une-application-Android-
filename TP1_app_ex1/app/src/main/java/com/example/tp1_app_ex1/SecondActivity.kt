package com.example.tp1_app_ex1

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.secondactivity)

        val nom = intent.getStringExtra("nom_utilisateur")

        val textNom = findViewById<TextView>(R.id.bienvenue)
        textNom.text = "Bienvenue!!!\n $nom"
    }
}