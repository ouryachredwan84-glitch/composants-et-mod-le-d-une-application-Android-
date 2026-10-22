package com.example.tp1_app_ex1

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edittextnom = findViewById<EditText>(R.id.editnom)
        val editetextage = findViewById<EditText>(R.id.editage)
        val bouton = findViewById<Button>(R.id.valider)

        bouton.setOnClickListener {
            val nom = edittextnom.text.toString() // .text pour récupérer le texte saisi par l'utilisateur
            val age = editetextage.text.toString().toInt()
            val intent = Intent(this, SecondActivity::class.java)
            val bundle = Bundle() //bundel katjma3 lina bzf dyl les valeurs  okansiftoha f intent wahed

            bundle.putString("nom_utilisateur", nom)
            bundle.putInt("age_utilisateur", age)

            intent.putExtras(bundle)

            startActivity(intent)

        }
    }
}