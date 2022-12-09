package com.polarindustries.accescontrol

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.getbase.floatingactionbutton.FloatingActionButton
import com.polarindustries.accescontrol.adaptadores.AdaptadorNoticias
import com.polarindustries.accescontrol.modelos.Noticia

class PrincipalUsuarioActivity : AppCompatActivity() {
    private  var listadoNoticias: ArrayList<Noticia> = arrayListOf(
        Noticia("Noticia 1", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. " +
                "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley " +
                "of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into " +
                "electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release."),
        Noticia("Noticia 2", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. " +
                "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley " +
                "of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into " +
                "electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release."),
        Noticia("Noticia 3", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. " +
                "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley " +
                "of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into " +
                "electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release."),
        Noticia("Noticia 4", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. " +
                "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley " +
                "of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into " +
                "electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release."),
        Noticia("Noticia 5", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. " +
                "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley " +
                "of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into " +
                "electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release."),
        Noticia("Noticia 6", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. " +
                "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley " +
                "of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into " +
                "electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release."),
        Noticia("Noticia 7", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. " +
                "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley " +
                "of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into " +
                "electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release."),
    )
    private lateinit var recyclerViewNoticias: RecyclerView
    private lateinit var floatingQR: FloatingActionButton
    private lateinit var floatingFeedBack: FloatingActionButton


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal_usuario)
        supportActionBar!!.hide()

        recyclerViewNoticias = findViewById(R.id.recyclerViewNoticias)
        floatingFeedBack = findViewById(R.id.floatingFeedBack)
        floatingQR = findViewById(R.id.floatingQR)


        recyclerViewNoticias.layoutManager = LinearLayoutManager(this)
        recyclerViewNoticias.adapter = AdaptadorNoticias(this, listadoNoticias, this)

        actionButtons()
    }

    private fun actionButtons() {
        floatingQR.setOnClickListener {
            val intent: Intent = Intent(this, VerQRActivity::class.java)
            startActivity(intent)
        }

        floatingFeedBack.setOnClickListener {
            val intent: Intent = Intent(this, AreasRecreativasActivity::class.java).apply {
                putExtra("variableControl", "shi")
            }
            startActivity(intent)
        }
    }
}