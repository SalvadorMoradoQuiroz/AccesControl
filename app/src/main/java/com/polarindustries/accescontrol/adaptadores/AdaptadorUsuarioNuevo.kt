package com.polarindustries.accescontrol.adaptadores

import android.app.Activity
import android.app.AlertDialog
import android.app.Dialog
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.polarindustries.accescontrol.R
import com.polarindustries.accescontrol.modelos.UsuarioActivo

class AdaptadorUsuarioNuevo(private val context: Context, private val listadoUsuariosEnLugar: ArrayList<UsuarioActivo>, private val activity: Activity): RecyclerView.Adapter<AdaptadorUsuarioNuevo.HolderUsuarioNuevo>() {


    inner class HolderUsuarioNuevo(itemView: View): RecyclerView.ViewHolder(itemView){
        val textViewCorreoVisitanteActivo: TextView = itemView.findViewById(R.id.textViewCorreoVisitanteActivo)
        val textViewHoraDeEntradaVisitanteActivo: TextView = itemView.findViewById(R.id.textViewHoraDeEntradaVisitanteActivo)
        val cardViewUsuarioActivo: CardView = itemView.findViewById(R.id.cardViewUsuarioActivo)
        val imageViewFlag: ImageView = itemView.findViewById(R.id.imageViewFlag)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HolderUsuarioNuevo {
        val itemView: View = LayoutInflater.from(parent.context).inflate(R.layout.card_visitante_activo, parent, false)
        return HolderUsuarioNuevo(itemView)
    }

    override fun onBindViewHolder(holder: HolderUsuarioNuevo, position: Int) {
        val usuarioActivoActual: UsuarioActivo = listadoUsuariosEnLugar[position]

        holder.textViewCorreoVisitanteActivo.text = usuarioActivoActual.usuario
        holder.textViewHoraDeEntradaVisitanteActivo.text = usuarioActivoActual.horaLlegada

        if (usuarioActivoActual.generico!!){
            holder.imageViewFlag.setImageResource(R.drawable.ic_twotone_person_add_24)
            holder.cardViewUsuarioActivo.setOnClickListener {
                //dialog

                showDialogMarcarSalida()
            }
        }
    }

    private fun showDialogMarcarSalida() {
        val builder: AlertDialog.Builder = AlertDialog.Builder(context)
        val view: View = activity.layoutInflater.inflate(R.layout.dialog_salida_generica, null)
        builder.setView(view)

        val dialog: Dialog = builder.create()
        dialog.setCancelable(true)
        dialog.show()
    }



    override fun getItemCount(): Int {
        return listadoUsuariosEnLugar.size
    }
}