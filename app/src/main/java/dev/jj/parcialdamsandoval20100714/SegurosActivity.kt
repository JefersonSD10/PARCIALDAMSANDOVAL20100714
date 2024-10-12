package com.example.smartapp.dev.jj.parcialdamsandoval20100714


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import dev.jj.parcialdamsandoval20100714.R


class SegurosActivity<ListAdapter> : AppCompatActivity() {


    var arrSeguros = arrayOf("GlobeGuard Insurance","SafeJourney Coverage","TravelShield Protection",
        "VoyageSecure", "WanderSure Travel Insurance")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_seguros)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val lsvSO: ListView = findViewById(R.id.segurosList)



    }
}