package com.example.multipleactivityapp.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.multipleactivityapp.R

class MainActivity : AppCompatActivity() {
    //late initialized button that belongs only to the class MainActivity
    private lateinit var btn:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //intent to switch activities
        val viewQuotes = Intent(this, Quote1::class.java)

        //assigning buttn in layout to late init btn variable
        btn = findViewById(R.id.viewQuotes)
        //on click listener to switch layout
        btn.setOnClickListener(){
            startActivity(viewQuotes)
        }
    }
}