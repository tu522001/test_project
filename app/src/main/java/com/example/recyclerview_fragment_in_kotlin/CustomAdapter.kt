package com.example.recyclerview_fragment_in_kotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(private var itemsList: List<String>) : RecyclerView.Adapter<CustomAdapter.MyViewHolder>() {
    inner class MyViewHolder(view : View) : RecyclerView.ViewHolder(view) {
        var itemTextView: TextView = view.findViewById(R.id.itemTextView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item,parent,false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item = itemsList[position]
        holder.itemTextView.text = item
    }


    // getItemCount() : get số phần tử có trong adapter
    override fun getItemCount(): Int {
        return itemsList.size
    }
}