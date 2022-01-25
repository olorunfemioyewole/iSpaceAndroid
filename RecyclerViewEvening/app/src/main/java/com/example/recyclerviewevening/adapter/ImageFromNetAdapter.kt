package com.example.recyclerviewevening.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.recyclerviewevening.Model.ImageFromNet
import com.example.recyclerviewevening.R
import java.math.MathContext

class ImageFromNetAdapter(private val context: Context, private val imgList: List<ImageFromNet>) :RecyclerView.Adapter<ImageFromNetAdapter.ImageViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        val rootView = LayoutInflater.from(context).inflate(R.layout.card_view_lay,parent,false)
        return ImageViewHolder(rootView)
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        val imgPosition = imgList[position]
        holder.imgName.text = imgPosition.name
        holder.description.text = imgPosition.description

        Glide
            .with(context)
            .load(imgPosition.img)
            .centerCrop()
            .placeholder(R.drawable.ic_launcher_background)
            .into(holder.imgUrl);
    }

    override fun getItemCount(): Int {
        return imgList.size
    }

    class ImageViewHolder(ImageItem:View):RecyclerView.ViewHolder(ImageItem){
        val imgUrl:ImageView = ImageItem.findViewById(R.id.imageview)
        val imgName:TextView = ImageItem.findViewById(R.id.textView)
        val description: TextView = ImageItem.findViewById(R.id.description)
    }
}