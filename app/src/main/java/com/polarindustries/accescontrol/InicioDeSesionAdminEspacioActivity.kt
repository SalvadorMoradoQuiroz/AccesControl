package com.polarindustries.accescontrol

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_inicio_de_sesion_admin_espacio.*

class InicioDeSesionAdminEspacioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio_de_sesion_admin_espacio)
        supportActionBar!!.hide()

        buttonIniciarSesionAdminEspacio.setOnClickListener {
            val intent = Intent(this, ListaFeedBackActivity::class.java)
            startActivity(intent)
        }

    }
}