package com.sailegnik.datawithcoroutinewithoutviewmodel.data

import android.app.Application
import android.content.Context
import android.net.ConnectivityManager
import androidx.annotation.WorkerThread
import androidx.lifecycle.MutableLiveData
import com.sailegnik.datawithcoroutinewithoutviewmodel.WEB_SERVICE_URL
import com.sailegnik.datawithcoroutinewithoutviewmodel.service.MonsterDataInterface
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

class MonsterRepository(val app:Application) {

    val monsterData = MutableLiveData<List<MonsterData>>()



    init {
       CoroutineScope(Dispatchers.IO).launch {
           callWebService()
       }
    }

    @WorkerThread
    suspend fun callWebService() {
        if (networkAvailable()) {
            val retrofit = Retrofit.Builder()
                .baseUrl(WEB_SERVICE_URL)
                .addConverterFactory(MoshiConverterFactory.create())
                .build()
            val service = retrofit.create(MonsterDataInterface::class.java)
            val serviceData = service.getMonsterData().body() ?: emptyList()

            monsterData.postValue(serviceData)
        }
    }


    @Suppress("DEPRECATION")
    private fun networkAvailable(): Boolean {
        val connectivityManager = app.getSystemService(Context.CONNECTIVITY_SERVICE)
                as ConnectivityManager
        val networkInfo = connectivityManager.activeNetworkInfo
        return networkInfo?.isConnectedOrConnecting ?: false
    }
}