package com.example.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//        findViewById<Button>(R.id.button)
//                .setOnClickListener {
//                    println("testButton")
//            findViewById<TextView>(R.id.idtestajouttextview).setText("text changed")
//            }
//        findViewById<Button>(R.id.button2)
//            .setOnClickListener {
//                println("testButton")
//                findViewById<TextView>(R.id.testText2).setText("Test text 2 changed !")
//            }




//        setContentView(R.layout.test_1)
//        val button = findViewById<Button>(R.id.button3)
//        button.setOnClickListener {
//            println("Changement effectué")
//            val textTop = findViewById<TextView>(R.id.textTop)
//            val textBottom = findViewById<TextView>(R.id.textBottom)
//
//            val tempText = textTop.text.toString()
//            textTop.setText(textBottom.text.toString())
//            textBottom.setText(tempText)
//        }

        setContentView(R.layout.test_jeudedes)
        val btnRollDice = findViewById<Button>(R.id.btn_roll_dice)
        val tvResult = findViewById<TextView>(R.id.tv_result) // Assurez-vous d'avoir un TextView avec cet ID dans votre layout

        btnRollDice.setOnClickListener {
            val randomNumber = Random.nextInt(1, 7) // Génère un nombre aléatoire entre 1 et 6
            tvResult.text = randomNumber.toString() // Affiche le résultat dans le TextView
        }

    }
}