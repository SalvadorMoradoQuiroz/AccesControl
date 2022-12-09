package com.polarindustries.accescontrol

import android.app.AlertDialog
import android.app.Dialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.polarindustries.accescontrol.adaptadores.AdaptadorFeedBack
import com.polarindustries.accescontrol.modelos.Feedback
import kotlinx.android.synthetic.main.activity_lista_feed_back.*

class ListaFeedBackActivity : AppCompatActivity() {
    private val listaFeedBack: ArrayList<Feedback> = arrayListOf(
        Feedback("Antonio Pulido", "Sin observaciones"),
        Feedback("Antonio Pulido", "Sin observaciones"),
        Feedback("Antonio Pulido", "Sin observaciones"),
        Feedback("Antonio Pulido", "Sin observaciones"),
        Feedback("Antonio Pulido", "Sin observaciones"),
        Feedback("Antonio Pulido", "Sin observaciones"),
        Feedback("Antonio Pulido", "Sin observaciones"),
        Feedback("Antonio Pulido", "Sin observaciones"),
        Feedback("Antonio Pulido", "Sin observaciones"),
        Feedback("Antonio Pulido", "Sin observaciones"),
        Feedback("Antonio Pulido", "Sin observaciones"),
        Feedback("Antonio Pulido", "Sin observaciones"),
        Feedback("Antonio Pulido", "Sin observaciones"),
        Feedback("Antonio Pulido", "Sin observaciones"),
        Feedback("Antonio Pulido", "Sin observaciones"),
        Feedback("Antonio Pulido", "Sin observaciones"),
        Feedback("Antonio Pulido", "Sin observaciones"),
        Feedback("Antonio Pulido", "Sin observaciones"),
        Feedback("Antonio Pulido", "Sin observaciones"),
        Feedback("Antonio Pulido", "Sin observaciones"),
        Feedback("Antonio Pulido", "Sin observaciones"),
        Feedback("Antonio Pulido", "Sin observaciones"),
        Feedback("Antonio Pulido", "Sin observaciones"),
        Feedback("Antonio Pulido", "Sin observaciones"),
        Feedback("Antonio Pulido", "Sin observaciones"),
        Feedback("Antonio Pulido", "Sin observaciones"),
        Feedback("Antonio Pulido", "Sin observaciones"),
        Feedback("Antonio Pulido", "Sin observaciones"),
        Feedback("Antonio Pulido", "Sin observaciones"),
        Feedback("Antonio Pulido", "Sin observaciones"),
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_feed_back)
        title = "Opiniones de la gente"

        recyclerOpiniones!!.layoutManager = LinearLayoutManager(this@ListaFeedBackActivity)
        recyclerOpiniones!!.adapter = AdaptadorFeedBack(this@ListaFeedBackActivity, listaFeedBack, this@ListaFeedBackActivity)

        var floatingEstadisticas: FloatingActionButton = findViewById(R.id.floatingEstadisticas)

        floatingEstadisticas.setOnClickListener {
            val intent = Intent(this, EstadisticasAreaRecreativaActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.popup, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.item_id->{
                showDialgodID()
            }

            R.id.item_circuito->{
                val intent = Intent(this, ConfigurarActivity::class.java)
                startActivity(intent)
            }
        }

        return super.onOptionsItemSelected(item)
    }

    private fun showDialgodID() {
        val builder: AlertDialog.Builder = AlertDialog.Builder(this)
        val view: View = layoutInflater.inflate(R.layout.item_id_espacio, null)
        builder.setView(view)

        val dialog: Dialog = builder.create()
        dialog.setCancelable(true)
        dialog.show()

        val buttonCerrarDialog: Button = dialog.findViewById(R.id.buttonCerrarDialog)

        buttonCerrarDialog.setOnClickListener {
            dialog.dismiss()
        }

    }
}