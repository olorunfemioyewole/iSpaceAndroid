package com.example.bootcamplearners.amLearners

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.bootcamplearners.R
import com.example.bootcamplearners.adapter.LearnersAdapter
import com.example.bootcamplearners.data.LearnersData
import com.example.bootcamplearners.learnerProfile.LearnerProfile
import com.example.bootcamplearners.utils.Constants

class AmLearnerList : AppCompatActivity() {
    private lateinit var recyclerView:RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_am_learner_list)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setTitle("AM Learners")

        recyclerView = findViewById(R.id.recyclerAm)

        recyclerView.layoutManager = LinearLayoutManager(this)

        val learnerList = ArrayList<LearnersData>()

        learnerList.add(
            LearnersData("KWADWO Busumtwi","kwadwobusumtwi@gmail.com","Male",
                "Backend Developer","0545644173","Accra", Constants.KWADWO)
        )
        learnerList.add(
            LearnersData("Olorunfemi Oyewole","eliasikechi14@gmail.com","Male",
                "Programmer/Graphic Designer","0545565901","Accra", Constants.FEMI)
        )
        learnerList.add(
            LearnersData("Hephzibah Emereole","hephzibahemereole@gmail.com","Female",
                "Student","0279542753","Berekuso", Constants.ZIBAH)
        )
        learnerList.add(
            LearnersData("Fatimah Adam","adamfatima2557@gmail.com","Female",
                "Student of the  University for development Studies(UDS)","0201112557","Tema", Constants.FATIMA)
        )

        val adapter = LearnersAdapter(this,learnerList, object : LearnersAdapter.HandleLearnerClick {
            override fun onLearnerClick(position: Int) {
                val learner = learnerList[position]
                val name:String = learner.name
                val email: String = learner.email
                val gender: String = learner.gender
                val profession :String = learner.profession
                val learnerImg :Int = learner.image
                val phoneNumb: String = learner.phone

                val intent = Intent(this@AmLearnerList, LearnerProfile::class.java)
                intent.putExtra("name",name)
                intent.putExtra("email",email)
                intent.putExtra("gender",gender)
                intent.putExtra("phone",phoneNumb)
                intent.putExtra("profession",profession)
                intent.putExtra("learnerImg", learnerImg)
                intent.putExtra("AM","AM")
                startActivity(intent)
            }
        })

        recyclerView.adapter = adapter
    }
}