package com.example.muchofood.view.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.muchofood.R

class sopasAdapter: RecyclerView.Adapter<sopasAdapter.ViewHolder> (){
    override fun onCreateViewHolder(viewGroup: ViewGroup, i:Int): ViewHolder {
        val vistaSopas=LayoutInflater.from(viewGroup.context).inflate(R.layout.card_view_sopas, viewGroup, false)
        return ViewHolder(vistaSopas)
    }

    inner class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView) {
        var itemImagenS: ImageView
        var itemTituloS: TextView
        var itemPrecioS: TextView

        init {
            itemImagenS = itemView.findViewById(R.id.imagenSopaVerduras)
            itemTituloS = itemView.findViewById(R.id.tituloSopaVerduras)
            itemPrecioS = itemView.findViewById(R.id.precioSopaVerduras)
        }
    }
    val tituloSopas= arrayOf("Sopa de verduras", "Ramen tradicional")
    val precioSopas= arrayOf("$8.500", "13.500")
    val imagenSopas= arrayOf(R.drawable.sopaverduras, R.drawable.sopas)

    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {
        viewHolder.itemTituloS.text=tituloSopas[i]
        viewHolder.itemPrecioS.text=precioSopas[i]
        viewHolder.itemImagenS.setImageResource(imagenSopas[i])
    }

    override fun getItemCount(): Int {
        return tituloSopas.size
    }
}