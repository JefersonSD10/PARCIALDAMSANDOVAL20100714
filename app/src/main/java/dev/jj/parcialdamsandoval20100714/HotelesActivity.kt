package com.example.smartapp.dev.jj.parcialdamsandoval20100714

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import dev.jj.parcialdamsandoval20100714.R

class HotelesActivity : AppCompatActivity() {

    data class Hotel(val name: String, val Valoration: String, val Price: String, val Address: String, val ImageID: Int)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hoteles)

        val hoteles = listOf(
            Hotel("Skyline Haven Hotel", "4,5 de 5 (1955 opiniones)", "$ 98", "123 Horizon Avenue, New York, USA", R.drawable.icon1),
            Hotel("Oceanview Retreat", "4,2 de 5 (741 opiniones)", "$ 90", "456 Seanside Avenue, Miami, USA", R.drawable.icon2),
            Hotel("Golden Palm Resort", "3,9 de 5 (2500 opiniones)", "$ 88", "789 Paradise Road, Honolulu, USA", R.drawable.icon3),
            Hotel("Royal Horizon Suites", "3,5 de 5 (7844 opiniones)", "$ 60", "654 Royal Plaza, London, UK", R.drawable.icon4)
            )

        val listView = findViewById<ListView>(R.id.hotelesList)
        listView.adapter = HotelAdapter(this, hoteles)

    }

    private class HotelAdapter(context: AppCompatActivity, private val hoteles: List<Hotel>) :
        ArrayAdapter<Hotel>(context, 0, hoteles) {

        override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
            val view = convertView ?: LayoutInflater.from(context).inflate(
                R.layout.hotel_list_item, parent, false
            )

            val hotel = hoteles[position]

            val iconView = view.findViewById<ImageView>(R.id.hotelIcon)
            val nameView = view.findViewById<TextView>(R.id.hotelName)
            val valorationView = view.findViewById<TextView>(R.id.hotelValoration)
            val priceView = view.findViewById<TextView>(R.id.hotelPrice)
            val addressView = view.findViewById<TextView>(R.id.hotelAddress)

            iconView.setImageResource(hotel.ImageID)
            nameView.text = hotel.name
            valorationView.text = hotel.Valoration
            priceView.text = hotel.Price
            addressView.text = hotel.Address

            return view
        }
    }
}