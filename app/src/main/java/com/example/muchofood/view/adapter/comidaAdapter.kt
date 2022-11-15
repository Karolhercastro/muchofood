package com.example.muchofood.view.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.muchofood.R

class comidaAdapter: RecyclerView.Adapter<comidaAdapter.ViewHolder> (){
    override fun onCreateViewHolder(viewGroup: ViewGroup, i:Int):ViewHolder{
        val vistaPizzas=LayoutInflater.from(viewGroup.context).inflate(R.layout.card_view_comidas, viewGroup, false)
        return ViewHolder(vistaPizzas)
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var itemImagen: ImageView
        var itemTitulo:TextView
        var itemPrecio:TextView

        init{
            itemImagen=itemView.findViewById (R.id.imagenPizzaCampo)
            itemTitulo=itemView.findViewById(R.id.tituloPizzaCampo)
            itemPrecio=itemView.findViewById(R.id.precioPizzaCampo)
        }
    }

    val titulosPizzas= arrayOf("Pizza de campo", "Pizza vegetariana")
    val preciosPizzas= arrayOf("$6.000", "$6.000")
    val imagenesPizzas= arrayOf(R.drawable.pizzacampo, R.drawable.pizzavegetariana)

    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {

        viewHolder.itemTitulo.text=titulosPizzas[i]
        viewHolder.itemPrecio.text=preciosPizzas[i]
        viewHolder.itemImagen.setImageResource(imagenesPizzas[i])
    }

    override fun getItemCount(): Int {
        return titulosPizzas.size
    }
}