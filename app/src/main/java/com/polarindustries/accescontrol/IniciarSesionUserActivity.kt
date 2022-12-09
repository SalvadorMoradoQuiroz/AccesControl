package com.polarindustries.accescontrol

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class IniciarSesionUserActivity : AppCompatActivity() {

    private lateinit var editText_CorreoLoginUsuario:EditText
    private lateinit var editText_PassLoginUsuario:EditText
    private lateinit var buttonIniciarSesionLoginUsuario:Button
    private lateinit var buttonOlvidastePassLoginUsuario:Button
    private lateinit var buttonNoTienesCuenta: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_iniciar_sesion_user)
        supportActionBar!!.hide()

        editText_CorreoLoginUsuario = findViewById(R.id.editText_CorreoLoginUsuario)
        editText_PassLoginUsuario = findViewById(R.id.editText_PassLoginUsuario)
        buttonIniciarSesionLoginUsuario = findViewById(R.id.buttonIniciarSesionLoginUsuario)
        buttonOlvidastePassLoginUsuario = findViewById(R.id.buttonOlvidastePassLoginUsuario)
        buttonNoTienesCuenta = findViewById(R.id.buttonNoTienesCuenta)

        actionButtons()

    }

    private fun actionButtons() {
        buttonIniciarSesionLoginUsuario.setOnClickListener {
            val intent: Intent = Intent(this@IniciarSesionUserActivity, PrincipalUsuarioActivity::class.java)
            startActivity(intent)
        }

        buttonNoTienesCuenta.setOnClickListener {
            val intent: Intent = Intent(this@IniciarSesionUserActivity, RegistrarUsuarioActivity::class.java)
            startActivity(intent)
        }
    }
}