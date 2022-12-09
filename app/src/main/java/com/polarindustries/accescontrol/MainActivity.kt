package com.polarindustries.accescontrol

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "Acces Control"

        cardView_User.setOnClickListener{
            val intent: Intent = Intent(this@MainActivity, IniciarSesionUserActivity::class.java)
            startActivity(intent)
        }

        cardView_Security.setOnClickListener{
            val intent: Intent = Intent(this@MainActivity, IniciarSesionGuardiaActivity::class.java)
            startActivity(intent)
        }

        carView_Admin.setOnClickListener{
            val intent: Intent = Intent(this@MainActivity, InicioDeSesionAdminEspacioActivity::class.java)
            startActivity(intent)
        }
    }
}