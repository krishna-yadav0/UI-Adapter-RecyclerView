package com.krishna.newuiapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyRoomsAdapter(val room: List<Rooms>) : RecyclerView.Adapter<MyRoomsAdapter.MyRoomsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyRoomsViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.rooms_item, parent, false)
        return MyRoomsViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyRoomsViewHolder, position: Int) {
        holder.textView1.text = room[position].room
        holder.textView2.text = room[position].devices
        holder.imageView.setImageResource(room[position].image)
    }

    override fun getItemCount(): Int {
        return room.size
    }

    class MyRoomsViewHolder(RoomsItem: View) : RecyclerView.ViewHolder(RoomsItem) {
        var textView1 = RoomsItem.findViewById<TextView>(R.id.txtViewRoom)
        var textView2 = RoomsItem.findViewById<TextView>(R.id.txtViewDevices)
        var imageView = RoomsItem.findViewById<ImageView>(R.id.imagesView)

    }
}