package com.example.dportfolio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.GridView
import android.widget.Toast
import androidx.appcompat.app.AlertController

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val gridView = findViewById<GridView>(R.id.gridView) as GridView

        val mylist = ArrayList<DeeList>()

        mylist.add(DeeList(R.drawable.twit,"Twitter","Follow me on @oluwadolamipoh"))
        mylist.add(DeeList(R.drawable.facebook,"Facebook", "Like my page"))
        mylist.add(DeeList(R.drawable.linkedin,"LinkedIn", "Follow my profile"))
        mylist.add(DeeList(R.drawable.github,"github", "Follow me"))
        mylist.add(DeeList(R.drawable.skype,"Skype", "Let's Chat"))

        val custom_list : ArrayAdapter<String> = ArrayAdapter(this@MainActivity,android.R.custom_list,list)
        gridView.adapter = custom_list

        gridView.onitemClickListener = AdapterView.OnitemClickListener{ parent, _, position, id ->

            Toast.makeText(this@MainActivity, "Done:-$id", Toast.LENGTH_SHORT).show()
        }
    }

    class DeeList ( var mDeeListImage:Int,
                    var mDeeListTextOne:String,
                    var mDeeListTextTwo: String)
}
