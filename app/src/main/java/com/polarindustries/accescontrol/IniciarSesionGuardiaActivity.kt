package com.polarindustries.accescontrol

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.zxing.integration.android.IntentIntegrator
import com.google.zxing.integration.android.IntentResult
import kotlinx.android.synthetic.main.activity_scan_qractivity.*

class IniciarSesionGuardiaActivity : AppCompatActivity() {
    private lateinit var buttonIniciarSesionGuardia: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_iniciar_sesion_guardia)

        supportActionBar!!.hide()

        buttonIniciarSesionGuardia = findViewById(R.id.buttonIniciarSesionGuardia)


        buttonIniciarSesionGuardia.setOnClickListener {
            val intent = Intent(this, ScanQRActivity::class.java)
            startActivity(intent)
        }


    }
}