package com.example.smartapp.dev.jj.parcialdamsandoval20100714

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.content.Intent
import dev.jj.parcialdamsandoval20100714.R


class PresupuestoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_presupuesto)

        val costoVueloInput = findViewById<EditText>(R.id.costoVueloInput)
        val costoAlojamientoInput = findViewById<EditText>(R.id.costoAlojamientoInput)
        val cantidadNochesInput = findViewById<EditText>(R.id.cantidadNochesInput)
        val costoComidasInput = findViewById<EditText>(R.id.costoComidasInput)
        val calculateButton = findViewById<Button>(R.id.calculateButton)
        val resultText = findViewById<TextView>(R.id.resultText)

        calculateButton.setOnClickListener {
            val costoVuelo = costoVueloInput.text.toString().toFloatOrNull()
            val costoAlojamiento = costoAlojamientoInput.text.toString().toFloatOrNull()
            val cantidadNoches = cantidadNochesInput.text.toString().toFloatOrNull()
            val costoComidas = costoComidasInput.text.toString().toFloatOrNull()

            if (costoVuelo != null && costoAlojamiento != null && cantidadNoches != null && costoComidas != null) {
                val presupuesto = costoVuelo + (costoAlojamiento*cantidadNoches)+(costoComidas*cantidadNoches)
                resultText.text = "Resultado: $presupuesto"

            } else {
                resultText.text = "Por favor, ingrese valores válidos"
            }
        }

    }
}