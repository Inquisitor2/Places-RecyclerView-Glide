package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        recyclerView = findViewById(R.id.recyclerView)

        val natureList = ArrayList<Nature>()


        natureList.add(Nature("https://www.meissl.com/media/images/8f24db1f/schweiz.jpg"))
        natureList.add(Nature("https://wallpaperaccess.com/full/343157.jpg"))
        natureList.add(Nature("https://wallpapercave.com/wp/DLLtaNO.jpg"))
        natureList.add(Nature("https://wallpaperaccess.com/full/267434.jpg"))
        natureList.add(Nature("https://wallpaperaccess.com/full/1204217.jpg"))
        natureList.add(Nature("https://assets.hongkiat.com/uploads/nature-photography/autumn-poolside.jpg"))
        natureList.add(Nature("https://media.cntraveler.com/photos/57fea9ec8584f8cd20e65f15/master/pass/Aerial-One&OnlyReethiRah-Maldives-CRHotel.jpg"))
        natureList.add(Nature("https://wallpaperaccess.com/full/149869.jpg"))
        natureList.add(Nature("https://i.pinimg.com/originals/18/e9/8c/18e98c0d3d6c3460685ffd8eb8dc9cca.jpg"))
        natureList.add(Nature("https://wallpapercave.com/wp/dy9Ctpk.jpg")





        val adapter = NatureAdapter(natureList, this)
        recyclerView.layoutManager = GridLayoutManager(this, 2)
        recyclerView.adapter = adapter

    }
    }
