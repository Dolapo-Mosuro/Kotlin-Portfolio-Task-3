package com.example.dportfolio

import android.os.Bundle
import android.widget.AdapterView
import android.widget.GridView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private var recyclerView:RecyclerView ? = null
    private var gridLayoutManager:GridLayoutManager ? = null
    private var arrayList:ArrayList<DeeList> ? = null
    private var deeListAdapter:DeeListAdapter ? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recycler_view_item)
        gridLayoutManager =
            GridLayoutManager(applicationContext, 3, LinearLayoutManager.VERTICAL, false)
        recyclerView?.layoutManager = gridLayoutManager
        recyclerView?.setHasFixedSize(true)


        charItem = ArrayList()
        charItem = setAlphas()

        deeListAdapter= DeeListAdapter(applicationContext, charItem!!)
        recyclerView?.adapter = deeListAdapter
    }

    private fun setAlphas(): ArrayList<DeeList.CharItem> {

        var arrayList: ArrayList<CharItem> = ArrayList()

        arrayList.add(CharItem(R.drawable.twitter, "Twitter", "Follow me @oluwadolamipoh"))
        arrayList.add(CharItem(R.drawable.facebook,"Facebook", "Like my page"))
        arrayList.add(CharItem(R.drawable.linkedin,"LinkedIn", "Follow my profile"))
        arrayList.add(CharItem(R.drawable.github,"github", "Follow me"))
        arrayList.add(CharItem(R.drawable.skype,"Skype", "Let's Chat"))





