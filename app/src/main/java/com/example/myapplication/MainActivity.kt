package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private val taux:Double = 1.2
    private var haut:Double = 0.0
    private var bas:Double = 0.0
    private lateinit var editTextHaut : TextView
    private lateinit var editTextBas : TextView
    private lateinit var buttonHaut : ImageButton
    private lateinit var buttonBas : ImageButton
    private lateinit var layoutLinearHaut: LinearLayout
    private lateinit var layoutLinearBas: LinearLayout



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editTextHaut = findViewById(R.id.editTextHaut)
        editTextBas = findViewById(R.id.editTextBas)
        buttonHaut = findViewById(R.id.buttonHaut)
        buttonBas = findViewById(R.id.buttonBas)
        layoutLinearHaut = findViewById(R.id.linearLayoutHaut)
        layoutLinearBas = findViewById(R.id.linearLayoutBas)


        buttonBas.setOnClickListener {
            if (editTextHaut.text.toString().isNotEmpty()) {
                haut = editTextHaut.text.toString().toDouble()
                if (haut != 0.0) {
                    bas = haut * taux
                    editTextBas.text = bas.toString()
                } else {
                    Toast.makeText(applicationContext, "Valeur ne doit pas etre 0", Toast.LENGTH_LONG).show()
                }
            } else {
                Toast.makeText(applicationContext, "Valeur ne doit pas etre vide", Toast.LENGTH_LONG).show()
            }
        }

        buttonHaut.setOnClickListener {
            if (editTextBas.text.toString().isNotEmpty()) {
                bas = editTextBas.text.toString().toDouble()
                if (bas != 0.0) {
                    haut = bas * taux
                    editTextHaut.text = haut.toString()
                } else {
                    Toast.makeText(applicationContext, "Valeur ne doit pas etre 0", Toast.LENGTH_LONG).show()
                }
            } else {
                Toast.makeText(applicationContext, "Valeur ne doit pas etre vide", Toast.LENGTH_LONG).show()
            }

        }
    }

}