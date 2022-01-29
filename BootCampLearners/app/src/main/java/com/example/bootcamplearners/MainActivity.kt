package com.example.bootcamplearners

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import com.example.bootcamplearners.amLearners.AmLearnerList
import com.example.bootcamplearners.data.LearnersData
import com.example.bootcamplearners.pmLearners.PmLearnerList

class MainActivity : AppCompatActivity() {
    private lateinit var am:Button
    private lateinit var pm:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        am = findViewById(R.id.am_bn)
        pm = findViewById(R.id.pm_bn)

        am.setOnClickListener{
         val intent = Intent(this, AmLearnerList::class.java)
            startActivity(intent)
        }
        pm.setOnClickListener{
         val intent = Intent(this, PmLearnerList::class.java)
            startActivity(intent)
        }

    }
}