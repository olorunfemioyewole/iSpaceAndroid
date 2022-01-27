package com.example.multipleactivityapp.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.example.multipleactivityapp.R

class Quote2 : AppCompatActivity() {
    private lateinit var btnn: Button
    private lateinit var btnp: Button
    private lateinit var btnh: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quote2)

        val viewQuoteP = Intent(this, Quote1::class.java)
        val viewQuoteN = Intent(this, Quote3::class.java)
        val viewQuoteH = Intent(this, MainActivity::class.java)

        btnh = findViewById(R.id.home)
        btnh.setOnClickListener(){
            startActivity(viewQuoteH)
        }

        btnn = findViewById(R.id.next2)
        btnn.setOnClickListener(){
            startActivity(viewQuoteN)
        }

        btnp = findViewById(R.id.prev2)
        btnp.setOnClickListener(){
            startActivity(viewQuoteP)
        }

    }
}