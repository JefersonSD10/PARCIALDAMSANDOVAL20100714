package com.example.smartapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.smartapp.dev.jj.parcialdamsandoval20100714.HotelesActivity
import com.example.smartapp.dev.jj.parcialdamsandoval20100714.PresupuestoActivity
import com.example.smartapp.dev.jj.parcialdamsandoval20100714.SegurosActivity
import dev.jj.parcialdamsandoval20100714.LoginActivity
import dev.jj.parcialdamsandoval20100714.R
import dev.jj.parcialdamsandoval20100714.R.*


class MenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_menu)

        val btnPresupuesto = findViewById<Button>(id.btnPresupuesto)
        val btnSeguros = findViewById<Button>(id.btnSeguros)
        val btnHoteles = findViewById<Button>(id.btnHoteles)
        val btnRegresar = findViewById<Button>(id.btnRegresar)

        btnPresupuesto.setOnClickListener {
            val intent = Intent(this, PresupuestoActivity::class.java)
            startActivity(intent)
        }


        btnSeguros.setOnClickListener {
            val intent = Intent(this, SegurosActivity::class.java)
            startActivity(intent)
        }

        btnHoteles.setOnClickListener {
            val intent = Intent(this, HotelesActivity::class.java)
            startActivity(intent)
        }

        btnRegresar.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}