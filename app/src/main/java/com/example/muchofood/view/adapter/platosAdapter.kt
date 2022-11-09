package com.example.muchofood.view.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.muchofood.R

class platosAdapter :RecyclerView.Adapter<platosAdapter.ViewHolder> (){
    override fun onCreateViewHolder(viewGroup: ViewGroup, i:Int):ViewHolder{
        val vistaPlatos= LayoutInflater.from(viewGroup.context).inflate(R.layout.card_view_platos, viewGroup, false)
        return ViewHolder(vistaPlatos)
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var itemImagenPlatos: ImageView
        var itemTituloPlatos: TextView
        var itemPrecioPlatos: TextView

        init{
            itemImagenPlatos=itemView.findViewById (R.id.imagenPlatos)
            itemTituloPlatos=itemView.findViewById(R.id.tituloPlatos)
            itemPrecioPlatos=itemView.findViewById(R.id.precioPlatos)
        }
    }

    val titulosPlatos= arrayOf("Pollo relleno", "Picada de mar", "Lomo con vegetales")
    val preciosPlatos= arrayOf("$16.000", "$27.000","$18.000" )
    val imagenesPlatos= arrayOf(R.drawable.pollorelleno, R.drawable.picadamar,R.drawable.lomo )

    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {

        viewHolder.itemTituloPlatos.text=titulosPlatos[i]
        viewHolder.itemPrecioPlatos.text=preciosPlatos[i]
        viewHolder.itemImagenPlatos.setImageResource(imagenesPlatos[i])
    }

    override fun getItemCount(): Int {
        return titulosPlatos.size
    }
}