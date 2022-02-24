package com.sailegnik.datawithcoroutinewithoutviewmodel.service

import com.sailegnik.datawithcoroutinewithoutviewmodel.data.MonsterData
import retrofit2.Response
import retrofit2.http.GET

interface MonsterDataInterface {
    @GET("/feed/monster_data.json")
    suspend fun getMonsterData(): Response<List<MonsterData>>

}