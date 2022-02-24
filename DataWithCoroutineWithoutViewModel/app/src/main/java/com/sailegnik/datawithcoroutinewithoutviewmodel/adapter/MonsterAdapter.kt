package com.sailegnik.datawithcoroutinewithoutviewmodel.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.sailegnik.datawithcoroutinewithoutviewmodel.R
import com.sailegnik.datawithcoroutinewithoutviewmodel.data.MonsterData

class MonsterAdapter(
    val context: Context,
    val monsterList:List<MonsterData>,
    val handledMonsterItem: HandledMonsterItem
) :RecyclerView.Adapter<MonsterAdapter.ViewHolder>(){



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.monster_grid_item,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       val monster = monsterList[position]
        holder.monsterName.text = monster.monsterName
        holder.ratingBar.rating = monster.scariness.toFloat()

        Glide.with(context)
            .load(monster.imageUrl)
            .into(holder.monsterImage)

        holder.itemView.setOnClickListener {
              handledMonsterItem.monsterClicked(monster)
        }
    }

    override fun getItemCount(): Int {
       return monsterList.size
    }

    inner class ViewHolder(ItemView:View):RecyclerView.ViewHolder(ItemView) {

        val monsterName:TextView = ItemView.findViewById(R.id.nameText)
        val monsterImage:ImageView = ItemView.findViewById(R.id.monsterImage)
        val ratingBar :RatingBar = ItemView.findViewById(R.id.ratingBar)
    }

    interface HandledMonsterItem{
        fun monsterClicked(monster: MonsterData)
    }
}
