package com.polarindustries.accescontrol

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import kotlinx.android.synthetic.main.activity_configurar.*

class ConfigurarActivity : AppCompatActivity() {
    private var circuitos: List<String> = listOf(
        "Ciruito 1", "Ciruito 2","Ciruito 3","Ciruito 4", "Ciruito 5","Ciruito 6"
    )

    private var areas: List<String> = listOf(
        "Área 1", "Área 2", "Área 3", "Área 4", "Área 5", "Área 6", "Área 7", "Área 8",
        "Área 9", "Área 10", "Área 11", "Área 12", "Área 13", "Área 14", "Área 15", "Área 16",
    )

    private var tipo: List<String> = listOf(
        "Salida", "Entrada"
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_configurar)

        title = "Configurar circuito"


        val adapter = ArrayAdapter(this, R.layout.custom_spinner_item, circuitos)
        (textInputLayoutDispositivosConectar.editText as? AutoCompleteTextView)?.setAdapter(adapter)

        val adapter2 = ArrayAdapter(this, R.layout.custom_spinner_item, areas)
        (textInputLayoutAreaRecreativa.editText as? AutoCompleteTextView)?.setAdapter(adapter2)

        val adapter3 = ArrayAdapter(this, R.layout.custom_spinner_item, tipo)
        (textInputLayoutTipoDispositivos.editText as? AutoCompleteTextView)?.setAdapter(adapter3)

    }
}