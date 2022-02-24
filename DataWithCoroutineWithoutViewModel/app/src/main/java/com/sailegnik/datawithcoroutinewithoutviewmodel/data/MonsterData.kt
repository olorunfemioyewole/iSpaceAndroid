package com.sailegnik.datawithcoroutinewithoutviewmodel.data

import com.sailegnik.datawithcoroutinewithoutviewmodel.IMAGE_BASE_URL
import com.sailegnik.datawithcoroutinewithoutviewmodel.IMAGE_BASE_URL

data class MonsterData(
    val imageFile:String,
     val monsterName:String,
     val caption:String,
     val description:String,
    val price:Double,
     val scariness:Int


){
    val imageUrl
        get() = "$IMAGE_BASE_URL/$imageFile.webp"
    val thumbnailUrl
        get() = "$IMAGE_BASE_URL/${imageFile}_tn.webp"
}
