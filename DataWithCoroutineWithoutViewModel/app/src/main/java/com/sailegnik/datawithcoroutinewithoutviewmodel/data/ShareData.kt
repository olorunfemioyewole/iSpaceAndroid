package com.sailegnik.datawithcoroutinewithoutviewmodel.data

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData

class ShareData(app:Application):AndroidViewModel(app) {//siiikee! we still used a jank view model
    val datarepo = MonsterRepository(app)
    val monsterData = datarepo.monsterData

    val selectedMonster = MutableLiveData<List<MonsterData>>()
}