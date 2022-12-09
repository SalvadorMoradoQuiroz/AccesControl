package com.polarindustries.accescontrol.adaptadores

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.polarindustries.accescontrol.R
import com.polarindustries.accescontrol.modelos.Feedback

class AdaptadorUsuarioEspacio(private val context: Context, private val listadoFeed: ArrayList<Feedback>, private val activity: Activity): RecyclerView.Adapter<AdaptadorUsuarioEspacio.HolderUsuarioEspacio>() {


    inner class HolderUsuarioEspacio(itemView: View): RecyclerView.ViewHolder(itemView){
        val textViewUsuarioFeed: TextView = itemView.findViewById(R.id.textViewListadoUsuario)
        val textViewOpinioFeed: TextView = itemView.findViewById(R.id.textViewListadoEspacio)
        val cardViewOpinion: CardView = itemView.findViewById(R.id.cardViewUsuarioArea)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HolderUsuarioEspacio {
        val itemView: View = LayoutInflater.from(parent.context).inflate(R.layout.item_usuario_area_dino, parent, false)
        return HolderUsuarioEspacio(itemView)
    }

    override fun onBindViewHolder(holder: HolderUsuarioEspacio, position: Int) {
        val feedbackActual: Feedback = listadoFeed[position]

        holder.textViewUsuarioFeed.text = feedbackActual.usuario
        holder.textViewOpinioFeed.text = "Estadio Venustiano Carranza"

        holder.cardViewOpinion.setOnClickListener {
            //Cambiar actividad
        }
    }

    override fun getItemCount(): Int {
        return listadoFeed.size
    }
}