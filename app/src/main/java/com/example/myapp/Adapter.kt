package com.example.myapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter(val array: ArrayList<Person>):RecyclerView.Adapter<Adapter.DataHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataHolder {
val dataHolder = DataHolder(LayoutInflater.from(parent.context)
    .inflate(R.layout.custom_layoutone,parent,false))
        return dataHolder
     }

    override fun onBindViewHolder(holder: DataHolder, position: Int) {
val Index: Person = array.get(position)
        holder.imageView.setImageResource(Index.Img)
        holder.textView.setText(Index.titleImg)
     }

    override fun getItemCount(): Int {
return array.size

     }
    class DataHolder(viewOne:View):RecyclerView.ViewHolder(viewOne) {
        val imageView:ImageView= viewOne.findViewById(R.id.imageviewtoaq)
        val textView:TextView = viewOne.findViewById(R.id.textName)



    }
}