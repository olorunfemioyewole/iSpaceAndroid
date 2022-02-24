package com.sailegnik.datawithcoroutinewithoutviewmodel

import android.content.Context
import android.net.ConnectivityManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.annotation.WorkerThread
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.sailegnik.datawithcoroutinewithoutviewmodel.adapter.MonsterAdapter
import com.sailegnik.datawithcoroutinewithoutviewmodel.data.MonsterData
import com.sailegnik.datawithcoroutinewithoutviewmodel.data.ShareData
import com.sailegnik.datawithcoroutinewithoutviewmodel.databinding.ActivityMainBinding
import com.sailegnik.datawithcoroutinewithoutviewmodel.service.MonsterDataInterface
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
//using an activity to get web service data instead of fragments with viewmodel
class MainActivity : AppCompatActivity(),MonsterAdapter.HandledMonsterItem {
    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: MonsterAdapter
    private lateinit var recycler: RecyclerView
    private lateinit var arrayList: ArrayList<List<MonsterData>>
    private lateinit var viewModel: ShareData

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this).get(ShareData::class.java)
        viewModel.monsterData.observe(this, Observer{data ->
            adapter = MonsterAdapter(this, data,this)
            binding.recView.layoutManager = GridLayoutManager(this,2)
            binding.recView.adapter = adapter
        })


        /*binding.recView.layoutManager = LinearLayoutManager(this)
        val monsters = ArrayList<MonsterData>()

        adapter = MonsterAdapter(this,monsters)
        binding.recView.adapter = adapter*/
    }

    override fun monsterClicked(monster: MonsterData) {
        val monsterName = monster.monsterName
        Log.i("DATA", monsterName)
    }

}