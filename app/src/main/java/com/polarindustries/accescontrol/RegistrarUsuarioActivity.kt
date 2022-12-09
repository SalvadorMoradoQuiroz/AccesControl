package com.polarindustries.accescontrol

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RegistrarUsuarioActivity : AppCompatActivity() {
    private lateinit var buttonRegistrarAddUsuario: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrar_usuario)
        title = "Nuevo usuario"

        buttonRegistrarAddUsuario = findViewById(R.id.buttonRegistrarAddUsuario)

        actionButtons()
    }

    private fun actionButtons() {
       buttonRegistrarAddUsuario.setOnClickListener {
           val intent: Intent = Intent(this, PrincipalUsuarioActivity::class.java)
           startActivity(intent)
       }
    }


}