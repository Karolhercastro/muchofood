package com.example.muchofood.view.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.muchofood.R

class ensaladasAdapter : RecyclerView.Adapter<ensaladasAdapter.ViewHolder> (){
    override fun onCreateViewHolder(viewGroup: ViewGroup, i:Int):ViewHolder{
        val vistaEnsaladas= LayoutInflater.from(viewGroup.context).inflate(R.layout.card_view_ensaladas, viewGroup, false)
        return ViewHolder(vistaEnsaladas)
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var itemImagenEnsaladas: ImageView
        var itemTituloEnsaladas: TextView
        var itemPrecioEnsaladas: TextView

        init{
            itemImagenEnsaladas=itemView.findViewById (R.id.imagenEnsaladas)
            itemTituloEnsaladas=itemView.findViewById(R.id.tituloEnsaladas)
            itemPrecioEnsaladas=itemView.findViewById(R.id.precioEnsaladas)
        }
    }

    val titulosEnsaladas= arrayOf("Ensalada de Brocolo", "Ensalada verde")
    val preciosEnsaladas= arrayOf("$12.000", "$13.000" )
    val imagenesEnsaladas= arrayOf(R.drawable.ensaladabrocoli, R.drawable.ensaladaaguacate )

    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {

        viewHolder.itemTituloEnsaladas.text=titulosEnsaladas[i]
        viewHolder.itemPrecioEnsaladas.text=preciosEnsaladas[i]
        viewHolder.itemImagenEnsaladas.setImageResource(imagenesEnsaladas[i])
    }

    override fun getItemCount(): Int {
        return titulosEnsaladas.size
    }
}