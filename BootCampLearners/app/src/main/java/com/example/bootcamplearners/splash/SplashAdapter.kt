package com.example.bootcamplearners.splash

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.bootcamplearners.R

class SplashAdapter(private val splashSlide: List<SplashSlide>):RecyclerView.Adapter<SplashAdapter.SplashViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SplashViewHolder {
        return SplashViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.slide_item_container,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: SplashViewHolder, position: Int) {
        holder.bind(splashSlide[position])
    }

    override fun getItemCount(): Int {
         return splashSlide.size
    }

    class SplashViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val textTitle = view.findViewById<TextView>(R.id.textTitle)
        private val textDescription = view.findViewById<TextView>(R.id.textDescription)
        // private val imageIcon = view.findViewById<ImageView>(R.id.imageSlideIcon)


        fun bind(introSlide: SplashSlide) {
            textTitle.text = introSlide.title
            textDescription.text = introSlide.descriptor
            //imageIcon.setImageResource(introSlide.icon)
        }


    }
}