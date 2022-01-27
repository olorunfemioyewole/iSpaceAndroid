package com.example.multipleactivityapp.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.example.multipleactivityapp.R

class Quote6 : AppCompatActivity() {
    private lateinit var btnn: Button
    private lateinit var btnp: Button
    private lateinit var btnh: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quote6)

        val viewQuoteP = Intent(this, Quote5::class.java)
        val viewQuoteN = Intent(this, Quote7::class.java)
        val viewQuoteH = Intent(this, MainActivity::class.java)

        btnh = findViewById(R.id.home)
        btnh.setOnClickListener(){
            startActivity(viewQuoteH)
        }

        btnn = findViewById(R.id.next6)
        btnn.setOnClickListener(){
            startActivity(viewQuoteN)
        }

        btnp = findViewById(R.id.prev6)
        btnp.setOnClickListener(){
            startActivity(viewQuoteP)
        }

    }
}