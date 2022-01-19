package com.example.rolltwodie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
lateinit var img1: ImageView
lateinit var img2: ImageView
class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        img1 = findViewById(R.id.diceOne)
        img2 = findViewById(R.id.diceTwo)

        val btnClick: Button = findViewById<Button>(R.id.castDie)
        btnClick.setOnClickListener(){
            castTheDice()
        }
    }

}

fun castTheDice(){
    val diceOne = (1..6).random()

    val image = when(diceOne){
        1-> R.drawable.dice_1
        2-> R.drawable.dice_2
        3-> R.drawable.dice_3
        4-> R.drawable.dice_4
        5-> R.drawable.dice_5
        6-> R.drawable.dice_6
        else->R.drawable.empty_dice
    }
    img1.setImageResource(image)

    val diceTwo= (1..6).random()

    val image2 = when(diceTwo){
        1-> R.drawable.dice_1
        2-> R.drawable.dice_2
        3-> R.drawable.dice_3
        4-> R.drawable.dice_4
        5-> R.drawable.dice_5
        6-> R.drawable.dice_6
        else->R.drawable.empty_dice
    }
    img2.setImageResource(image2)

}