package com.polarindustries.accescontrol.adaptadores

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.polarindustries.accescontrol.AgregarFeedBackActivity
import com.polarindustries.accescontrol.R
import com.polarindustries.accescontrol.modelos.AreaRecreativa
import com.polarindustries.accescontrol.EstadisticasAreaRecreativaActivity

class AdaptadorAreaRecreativa(private val context: Context, private val areasRecreativasList: ArrayList<AreaRecreativa>, private val activity: Activity, private val validacion: String): RecyclerView.Adapter<AdaptadorAreaRecreativa.AreaRecreativaHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AreaRecreativaHolder {
        val itemView: View = LayoutInflater.from(parent.context).inflate(R.layout.item_area_recreativa, parent, false)
        return AreaRecreativaHolder(itemView)
    }

    override fun onBindViewHolder(holder: AreaRecreativaHolder, position: Int) {
        val areaRecreativa: AreaRecreativa = areasRecreativasList[position]

        holder.textView_NombreArea.text = areaRecreativa.nombre
        holder.textViewUbicacion.text = areaRecreativa.ubicacion

        holder.textView_NombreArea.isSelected = true
        holder.textViewUbicacion.isSelected = true

        //holder.textView_NombreArea.setHorizontallyScrolling(true)
        //holder.textViewUbicacion.setHorizontallyScrolling(true)

        //Se debe cambiar por la uri
        holder.imageView_FotoArea.setImageResource(R.drawable.estadio)

        if(validacion.equals("shi")){
            holder.cardViewItemPlantilla.setOnClickListener {
                moveToActivityFeedBack()
            }
        } else{
            moveToActivityEstadisticas()
        }
    }

    private fun moveToActivityEstadisticas() {
        val intent = Intent(context, EstadisticasAreaRecreativaActivity::class.java)
        context.startActivity(intent)
    }

    private fun moveToActivityFeedBack() {
        val intent = Intent(context, AgregarFeedBackActivity::class.java)
        context.startActivity(intent)
    }

    override fun getItemCount(): Int {
        return areasRecreativasList.size
    }

    inner class AreaRecreativaHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val cardViewItemPlantilla:CardView = itemView.findViewById(R.id.cardViewItemPlantilla)
        val imageView_FotoArea: ImageView = itemView.findViewById(R.id.imageView_FotoArea)
        val textView_NombreArea:TextView = itemView.findViewById(R.id.textView_NombreArea)
        val textViewUbicacion:TextView = itemView.findViewById(R.id.textViewUbicacion)
    }
}