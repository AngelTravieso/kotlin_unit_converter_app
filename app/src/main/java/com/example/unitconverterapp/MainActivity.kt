package com.example.unitconverterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edt = findViewById<EditText>(R.id.kilo_edt)
        val btn = findViewById<Button>(R.id.button)
        val resultText = findViewById<TextView>(R.id.result_text)

        btn.setOnClickListener() {
            if(edt.text.isNotEmpty()) {
                val kilos: Double = edt.text.toString().toDouble()
                resultText.text = ("${converToPounds(kilos)} \n Pounds")
            } else {
                Toast.makeText(
                    this@MainActivity,
                    "Please enter valid data",
                    Toast.LENGTH_LONG).show()
            }

        }

    }

    fun converToPounds(kilos: Double): Double {
        var pounds = kilos * 2.20462
        return pounds
    }

}