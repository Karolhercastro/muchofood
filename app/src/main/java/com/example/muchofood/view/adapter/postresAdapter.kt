package com.example.muchofood.view.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.muchofood.R

class postresAdapter : RecyclerView.Adapter<postresAdapter.ViewHolder> (){
    override fun onCreateViewHolder(viewGroup: ViewGroup, i:Int):ViewHolder{
        val vistaPostres= LayoutInflater.from(viewGroup.context).inflate(R.layout.card_view_postres, viewGroup, false)
        return ViewHolder(vistaPostres)
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var itemImagenPostres: ImageView
        var itemTituloPostres: TextView
        var itemPrecioPostres: TextView

        init{
            itemImagenPostres=itemView.findViewById (R.id.imagenPostres)
            itemTituloPostres=itemView.findViewById(R.id.tituloPostres)
            itemPrecioPostres=itemView.findViewById(R.id.precioPostres)
        }
    }

    val titulosPostres= arrayOf("Galleta de chocolate", "Mousse de fresa y pistachos", "Mousse de vainilla y caramelo")
    val preciosPostres= arrayOf("$5.000", "$7.000", "$7.000" )
    val imagenesPostres= arrayOf(R.drawable.chocogalleta, R.drawable.fresapistacho, R.drawable.vainillacaramelo)

    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {

        viewHolder.itemTituloPostres.text=titulosPostres[i]
        viewHolder.itemPrecioPostres.text=preciosPostres[i]
        viewHolder.itemImagenPostres.setImageResource(imagenesPostres[i])
    }

    override fun getItemCount(): Int {
        return titulosPostres.size
    }
}