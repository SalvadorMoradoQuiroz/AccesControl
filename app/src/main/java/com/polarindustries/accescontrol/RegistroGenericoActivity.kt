package com.polarindustries.accescontrol

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class RegistroGenericoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro_generico)
        title = "Registrar visitante"
    }
}