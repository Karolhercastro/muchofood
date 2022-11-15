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
        val vistaComidas=LayoutInflater.from(viewGroup.context).inflate(R.layout.card_view_comidas, viewGroup, false)
        return ViewHolder(vistaComidas)
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var itemImagen: ImageView
        var itemTitulo:TextView
        var itemPrecio:TextView

        init{
            itemImagen=itemView.findViewById (R.id.image)
            itemTitulo=itemView.findViewById(R.id.titulo)
            itemPrecio=itemView.findViewById(R.id.precio)
        }
    }

    val titulosComidas= arrayOf("Pizza individual de campo", "Pizza individual vegetariana","Sopa de verduras", "Pollo relleno")
    val preciosComidas= arrayOf("$6.000", "$6.000" ,"$5.500", "$13.500")
    val imagenesComidas= arrayOf(R.drawable.pizzacampo, R.drawable.pizzavegetariana, R.drawable.sopaverduras, R.drawable.pollorelleno)

    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {

        viewHolder.itemTitulo.text=titulosComidas[i]
        viewHolder.itemPrecio.text=preciosComidas[i]
        viewHolder.itemImagen.setImageResource(imagenesComidas[i])
    }

    override fun getItemCount(): Int {
        return titulosComidas.size
    }
}