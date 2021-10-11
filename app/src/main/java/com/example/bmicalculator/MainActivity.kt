package com.example.bmicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val calculate = findViewById<Button>(R.id.calculate_button)
        val weightText = findViewById<EditText>(R.id.weight_edit_view)
        val heightText = findViewById<EditText>(R.id.height_edit_view)
        val bmiText = findViewById<TextView>(R.id.bmi_text_view)
        val bmiView = findViewById<ImageView>(R.id.image_view)

        calculate.setOnClickListener{

            val weight = weightText.text.toString().toFloat()
            val height = heightText.text.toString().toFloat()

            val myBMI = weight / (height * height)

            bmiText.text =myBMI.toString()

            if (myBMI < 18.5){
                bmiView.setImageResource(R.drawable.underweight)
            }else if (myBMI >= 18.5 && myBMI < 24.9){
                bmiView.setImageResource(R.drawable.healthy)
            }else if (myBMI >= 24.9 && myBMI < 29.9){
                bmiView.setImageResource(R.drawable.overweight)
            }else if (myBMI >= 29.9){
                bmiView.setImageResource(R.drawable.obesity)
            }
        }
    }
}