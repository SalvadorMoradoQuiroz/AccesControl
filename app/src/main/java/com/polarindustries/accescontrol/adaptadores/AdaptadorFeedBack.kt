package com.polarindustries.accescontrol.adaptadores

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.polarindustries.accescontrol.ConsultaFeedBackActivity
import com.polarindustries.accescontrol.R
import com.polarindustries.accescontrol.modelos.Feedback

class AdaptadorFeedBack(private val context: Context, private val listadoFeed: ArrayList<Feedback>, private val activity: Activity): RecyclerView.Adapter<AdaptadorFeedBack.HolderFeedback>() {


    inner class HolderFeedback(itemView: View): RecyclerView.ViewHolder(itemView){
        val textViewUsuarioFeed: TextView = itemView.findViewById(R.id.textViewUsuarioFeed)
        val textViewOpinioFeed: TextView = itemView.findViewById(R.id.textViewOpinioFeed)
        val cardViewOpinion: CardView = itemView.findViewById(R.id.cardViewOpinion)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HolderFeedback {
        val itemView: View = LayoutInflater.from(parent.context).inflate(R.layout.item_feedback, parent, false)
        return HolderFeedback(itemView)
    }

    override fun onBindViewHolder(holder: HolderFeedback, position: Int) {
        val feedbackActual: Feedback = listadoFeed[position]

        holder.textViewUsuarioFeed.text = feedbackActual.usuario
        holder.textViewOpinioFeed.text = feedbackActual.opinion

        holder.cardViewOpinion.setOnClickListener {
            val intent = Intent(context, ConsultaFeedBackActivity::class.java)
            context.startActivity(intent)
        }
    }



    override fun getItemCount(): Int {
        return listadoFeed.size
    }
}