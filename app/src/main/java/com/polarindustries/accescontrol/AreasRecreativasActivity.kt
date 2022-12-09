package com.polarindustries.accescontrol

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.polarindustries.accescontrol.adaptadores.AdaptadorAreaRecreativa
import com.polarindustries.accescontrol.modelos.AreaRecreativa

class AreasRecreativasActivity : AppCompatActivity() {

    private var listaAreasRecreativas: ArrayList<AreaRecreativa> = arrayListOf(
        AreaRecreativa("1 Estadio Olímpico Venustiano Carranza", "1 Av. del Estudiante, Vasco de Quiroga, 58230 Morelia, Mich.", ""),
        AreaRecreativa("2 Estadio Olímpico Venustiano Carranza", "2 Av. del Estudiante, Vasco de Quiroga, 58230 Morelia, Mich.", ""),
        AreaRecreativa("3 Estadio Olímpico Venustiano Carranza", "3 Av. del Estudiante, Vasco de Quiroga, 58230 Morelia, Mich.", ""),
        AreaRecreativa("4 Estadio Olímpico Venustiano Carranza", "4 Av. del Estudiante, Vasco de Quiroga, 58230 Morelia, Mich.", ""),
        AreaRecreativa("5 Estadio Olímpico Venustiano Carranza", "5 Av. del Estudiante, Vasco de Quiroga, 58230 Morelia, Mich.", ""),
        AreaRecreativa("6 Estadio Olímpico Venustiano Carranza", "6 Av. del Estudiante, Vasco de Quiroga, 58230 Morelia, Mich.", "")
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_areas_recreativas)

        title = "Áreas recreativas"


        val validacion: String? =  intent.getStringExtra("variableControl")
        val recyclerView_AreasRecreativas = findViewById<RecyclerView>(R.id.recyclerView_AreasRecreativas)

        recyclerView_AreasRecreativas!!.layoutManager = LinearLayoutManager(this@AreasRecreativasActivity)
        recyclerView_AreasRecreativas!!.adapter = AdaptadorAreaRecreativa(this@AreasRecreativasActivity, listaAreasRecreativas, this@AreasRecreativasActivity, validacion!!)

        var floatingAddUsuariosAdminR: FloatingActionButton = findViewById(R.id.floatingAddUsuariosAdminR)

        if(validacion.equals("shi")){
            floatingAddUsuariosAdminR.visibility = View.GONE
        }
    }

}