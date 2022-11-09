package com.example.muchofood.view.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.muchofood.R

class bebidasAdapter: RecyclerView.Adapter<bebidasAdapter.ViewHolder> (){
    override fun onCreateViewHolder(viewGroup: ViewGroup, i:Int):ViewHolder{
        val vistaBebidas= LayoutInflater.from(viewGroup.context).inflate(R.layout.card_view_bebidas, viewGroup, false)
        return ViewHolder(vistaBebidas)
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var itemImagenBebidas: ImageView
        var itemTituloBebidas: TextView
        var itemPrecioBebidas: TextView

        init{
            itemImagenBebidas=itemView.findViewById (R.id.imagenBebidas)
            itemTituloBebidas=itemView.findViewById(R.id.tituloBebidas)
            itemPrecioBebidas=itemView.findViewById(R.id.precioBebidas)
        }
    }

    val titulosBebidas= arrayOf("Jugo de frutoss rojos", "Jugo de piña")
    val preciosBebidas= arrayOf("$3.000", "$3.000" )
    val imagenesBebidas= arrayOf(R.drawable.jugofrutos, R.drawable.jugopina)

    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {

        viewHolder.itemTituloBebidas.text=titulosBebidas[i]
        viewHolder.itemPrecioBebidas.text=preciosBebidas[i]
        viewHolder.itemImagenBebidas.setImageResource(imagenesBebidas[i])
    }

    override fun getItemCount(): Int {
        return titulosBebidas.size
    }
}