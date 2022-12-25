package com.krishna.newuiapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val rooms = ArrayList<Rooms>()
        rooms.add(Rooms("Living Room", "7 Devices", R.drawable.living_room))
        rooms.add(Rooms("Bed Room", "5 Devices", R.drawable.bed_room))
        rooms.add(Rooms("Bath Room", "2 Devices", R.drawable.bath_room))
        rooms.add(Rooms("Living Room", "7 Devices", R.drawable.living_room))
        rooms.add(Rooms("Bed Room", "5 Devices", R.drawable.bed_room))
        rooms.add(Rooms("Bath Room", "2 Devices", R.drawable.bath_room))
        rooms.add(Rooms("Living Room", "7 Devices", R.drawable.living_room))
        rooms.add(Rooms("Bed Room", "5 Devices", R.drawable.bed_room))
        rooms.add(Rooms("Bath Room", "2 Devices", R.drawable.bath_room))
        rooms.add(Rooms("Living Room", "7 Devices", R.drawable.living_room))
        rooms.add(Rooms("Bed Room", "5 Devices", R.drawable.bed_room))
        rooms.add(Rooms("Bath Room", "2 Devices", R.drawable.bath_room))


        val roomList = findViewById<RecyclerView>(R.id.roomsList)
        roomList.adapter = MyRoomsAdapter(rooms)
        roomList.layoutManager = LinearLayoutManager(this)

    }
}