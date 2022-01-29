package com.example.bootcamplearners.pmLearners

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

class PmLearnerList : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pm_learner_list)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setTitle("PM Learners")

        recyclerView = findViewById(R.id.recyclerPm)

        recyclerView.layoutManager = LinearLayoutManager(this)

        val learnerList = ArrayList<LearnersData>()

        learnerList.add(
            LearnersData(
                "Claudia Mintogo", "claudiamintogo@gmail.com","Female",
                "Student","0269384159", "Awoshie", Constants.CLAUDIA
            )
        )

        learnerList.add(
            LearnersData(
                "Albert Osei","oseialbert072@gmail.com","Male",
                "Software developer","0542291420","Labadi", Constants.ALBERT
            )
        )

        learnerList.add(
            LearnersData(
                "Linus Sebastian","idkexample@gmail.com","Male",
                "Business Man","0452291420","Canada", Constants.LINUS
            )
        )

        learnerList.add(
            LearnersData(
                "Shadrack Odametey","shadrack@gmail.com","Male",
                "Programmer","0452416420","Aplaku", Constants.SHAD
            )
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

                val intent = Intent(this@PmLearnerList, LearnerProfile::class.java)
                intent.putExtra("name",name)
                intent.putExtra("email",email)
                intent.putExtra("gender",gender)
                intent.putExtra("phone",phoneNumb)
                intent.putExtra("profession",profession)
                intent.putExtra("learnerImg", learnerImg)
                intent.putExtra("PM","PM")
                startActivity(intent)
            }
        })
        recyclerView.adapter = adapter
    }
}