package com.example.tpseminariosofiaasan

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class ActorAdapter(var actores: MutableList<Actor>, var context: Context):
RecyclerView.Adapter<ActorAdapter.ActorViewHolder>(){

    override fun onBindViewHolder(holder: ActorViewHolder, position: Int) {
        val item = actores.get(position)
        holder.txtActor.text = item.nombre
        holder.txtFechaNac.text = item.fechaNac
        holder.itemView.setOnClickListener ( View.OnClickListener {
            Toast.makeText(context, item.nombre, Toast.LENGTH_SHORT).show()
        } )
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ActorViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_actor, parent, false)

        return ActorViewHolder(view)
    }

    override fun getItemCount() = actores.size

    class ActorViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val txtActor: TextView
        val txtFechaNac: TextView

        init {
            txtActor = view.findViewById(R.id.tvNombreActor)
            txtFechaNac = view.findViewById(R.id.tvFechaNacimientoActor)
        }
    }
}