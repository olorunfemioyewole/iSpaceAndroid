package com.example.bootcamplearners.learnerProfile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import com.example.bootcamplearners.R

class LearnerProfile : AppCompatActivity() {
    private lateinit var profileImg: ImageView
    private lateinit var name_field: TextView
    private lateinit var email_field : TextView
    private lateinit var phone_number: TextView
    private lateinit var gender_field: TextView
    private lateinit var profession_field: TextView
    private lateinit var imag_bg: RelativeLayout
    private lateinit var imag_pro_two: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_learner_profile)


        profileImg = findViewById(R.id.profileImg)
        name_field = findViewById(R.id.name_field)
        email_field = findViewById(R.id.email_field)
        phone_number = findViewById(R.id.phone_number)
        gender_field = findViewById(R.id.gender_field)
        profession_field = findViewById(R.id.profession_field)
        imag_bg = findViewById(R.id.img_bg)
        imag_pro_two = findViewById(R.id.profileImagTwo)



        val intent = getIntent();
        val name = intent.getStringExtra("name")
        val email = intent.getStringExtra("email")
        val gender = intent.getStringExtra("gender")
        val profession = intent.getStringExtra("profession")
        val phoneNumb = intent.getStringExtra("phone")
        val learnerImg = intent.getIntExtra("learnerImg",0)
        val pm: String? = intent.getStringExtra("PM")
        val am: String? = intent.getStringExtra("AM")

        if (pm.equals("PM")) {
            supportActionBar?.setTitle("PM $name")
        }else if(am.equals("AM")){
            supportActionBar?.setTitle("AM $name")
        }

        name_field.text ="$name"
        email_field.text =email
        gender_field.text = gender
        profession_field.text = profession
        profileImg.setImageResource(learnerImg)
        imag_pro_two.setImageResource(learnerImg)

        if (name.equals("Olorunfemi Oyewole")){
            imag_bg.setBackgroundResource(R.drawable.femi_two)
        }else{
            imag_bg.setBackgroundResource(learnerImg)
        }

        phone_number.text =phoneNumb
    }
    }
