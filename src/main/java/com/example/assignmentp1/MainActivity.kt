package com.example.assignmentp1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val ageNumber = findViewById<EditText>(R.id.ageNumber)
        val btnGenerate = findViewById<Button>(R.id.btnGenerate)
        val btnClear = findViewById<Button>(R.id.btnClear)
        val txtResults = findViewById<TextView>(R.id.txtResults)
        btnGenerate.setOnClickListener {
            val age = ageNumber.text.toString().toIntOrNull()
            if (age != null) {
                val results = when (age) {
                    in 20..30 -> "Juice WRLD"
                    in 30..49 -> "AKA"
                    in 50..59 -> "Teddy Pendergrass"
                    in 60..79 -> "Anthony Bourdain"
                    in 80..90 -> "Colonel Sanders"
                    else -> "Senior"
                }
                txtResults.text = "Age: $age\n${
                    when (results) {
                        "Juice WRLD" -> "You are still Young."
                        "AKA" -> "You are a Teenager"
                        "Teddy Pendergrass" -> "You are old"
                        "Anthony Bourdain" -> "You are elderly"
                        "Colonel Sanders" -> "You are a fossil"
                        else -> "Please enter age between 20 to 90 to validate."
                    }
                }"
            } else {
                txtResults.text = "Please enter valid age."
            }
        }
        btnClear.setOnClickListener {
            ageNumber.text.clear()
        }
    }
}