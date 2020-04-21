package com.example.dportfolio

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder as RecyclerViewViewHolder

class DeeListAdapter(var context: Context , var arrayList: ArrayList<DeeList>): RecyclerView.Adapter<DeeListAdapter.ItemHolders>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolders {

        val itemHolder = LayoutInflater.from(parent.context).inflate(R.layout.custom_list , parent, false)
        return ItemHolders(itemHolder)
    }

    override fun getItemCount(): Int {
       return arrayList.size
    }

    override fun onBindViewHolder(holder: ItemHolders, position: Int) {
        val charItem: DeeList = arrayList.get(position)

        holder.icons.setImageResource(charItem.icons!!)
        holder.titles.text = charItem.alpha.toString()

        holder.titles.setOnClickListener {
            Toast.makeText(context, charItem.alpha, Toast.LENGTH_LONG).show()
        }


    }

    class ItemHolders(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var icons = itemView.findViewById<ImageView>(R.id.image)
        var alpha = itemView.findViewById<TextView>(R.id.text1)
        var titles2 = itemView.findViewById<TextView>(R.id.text2)
    }

}

