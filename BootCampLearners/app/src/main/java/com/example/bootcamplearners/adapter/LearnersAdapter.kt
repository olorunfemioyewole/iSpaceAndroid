package com.example.bootcamplearners.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.bootcamplearners.R
import com.example.bootcamplearners.data.LearnersData

class LearnersAdapter(
    private val context:Context,
    private val learnersList:ArrayList<LearnersData>,
    private val handleLearnerClick: HandleLearnerClick
): RecyclerView.Adapter<LearnersAdapter.LearnersViewHolder>() {
//recycler view.adapter is used to extend learnersadapter to make it an adapter

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LearnersViewHolder {
        val rootView = LayoutInflater.from(context).inflate(R.layout.learner_item_row,parent,false)
        return LearnersViewHolder(rootView)
    }
    interface HandleLearnerClick{
        fun onLearnerClick(position: Int)
    }

    override fun onBindViewHolder(holder: LearnersViewHolder, position: Int) {
        val dataPosition = learnersList[position]

        holder.name.text = dataPosition.name
        holder.learnersClick.setOnClickListener{
            handleLearnerClick.onLearnerClick(position
            )
        }

        Glide
            .with(context)
            .load(dataPosition.image)
            .centerCrop()
            .placeholder(R.drawable.ic_launcher_foreground)
            .into(holder.imgUrl);
    }

    override fun getItemCount(): Int {
        return learnersList.size
    }

    class LearnersViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
        val imgUrl: ImageView = itemView.findViewById(R.id.imageView)
        val name: TextView = itemView.findViewById(R.id.textView)
        val learnersClick: CardView = itemView.findViewById(R.id.relativeLayout)
    }

}