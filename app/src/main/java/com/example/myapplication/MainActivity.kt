package com.example.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

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




        setContentView(R.layout.test_1)
        val button = findViewById<Button>(R.id.button3)
        button.setOnClickListener {
            println("Changement effectué")
            val textTop = findViewById<TextView>(R.id.textTop)
            val textBottom = findViewById<TextView>(R.id.textBottom)
            val tempText = textTop.text.toString()
            textTop.setText(textBottom.text.toString())
            textBottom.setText(tempText)
        }




//        var myButton : Button;
//        var messageTextView : TextView;
//
//        myButton = findViewById<Button>(R.id.button)
//        messageTextView = findViewById<TextView>(R.id.idtestajouttextview)
//
//        myButton.setOnClickListener(View.OnClickListener { // Set the text of the TextView to "Hello, World!"
//            messageTextView.setText("Hello, World!")
//        })
    }
}