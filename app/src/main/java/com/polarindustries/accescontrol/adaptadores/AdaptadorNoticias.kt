package com.polarindustries.accescontrol.adaptadores

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.polarindustries.accescontrol.R
import com.polarindustries.accescontrol.modelos.Noticia

class AdaptadorNoticias(private val context: Context, private val listadoNoticias: ArrayList<Noticia>, private val activity: Activity): RecyclerView.Adapter<AdaptadorNoticias.HolderNoticia>() {


    inner class HolderNoticia(itemView: View): RecyclerView.ViewHolder(itemView){
        val textViewItemTituloNoticia: TextView = itemView.findViewById(R.id.textViewItemTituloNoticia)
        val textViewResumenNoticia: TextView = itemView.findViewById(R.id.textViewResumenNoticia)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HolderNoticia {
        val itemView: View = LayoutInflater.from(parent.context).inflate(R.layout.item_news, parent, false)
        return HolderNoticia(itemView)
    }

    override fun onBindViewHolder(holder: HolderNoticia, position: Int) {
        val noticiaActual: Noticia = listadoNoticias[position]

        holder.textViewItemTituloNoticia.text = noticiaActual.titulo
        holder.textViewResumenNoticia.text = noticiaActual.resumen
    }

    override fun getItemCount(): Int {
        return listadoNoticias.size
    }
}