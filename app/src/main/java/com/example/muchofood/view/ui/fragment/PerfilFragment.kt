package com.example.muchofood.view.ui.fragment

import android.content.Intent
import android.graphics.Bitmap
import android.os.Bundle
import android.provider.MediaStore
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.muchofood.R
import com.google.android.material.bottomnavigation.BottomNavigationView


class PerfilFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view= inflater.inflate(R.layout.fragment_perfil, container, false)

        val botonCamaraPerfil= view.findViewById<Button>(R.id.buttonCamara)
        botonCamaraPerfil.setOnClickListener {
            val intent= Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(intent,123)
        }

        val botonGaleriaPerfil=view.findViewById<Button>(R.id.buttonGaleria)
        botonGaleriaPerfil.setOnClickListener {
            val intent=Intent(Intent.ACTION_PICK)
            intent.type="image/*"
            startActivityForResult(intent,456)
        }
        return view

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        val imageView=view?.findViewById<ImageView>(R.id.imagenPerfil)
        if (requestCode==123){
            var bitmap=data?.extras?.get("data")as Bitmap
            imageView?.setImageBitmap(bitmap)
        }else if (requestCode==456){
            imageView?.setImageURI(data?.data)
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val btm=view.findViewById<BottomNavigationView>(R.id.bottom_navigation)
        btm.setOnNavigationItemReselectedListener {
            when(it.itemId){
                R.id.homeBarNav -> findNavController().navigate(R.id.action_perfilFragment_to_homeFragment)
                R.id.comprasBarNav -> findNavController().navigate(R.id.action_perfilFragment_to_comprasFragment)
                R.id.mapaBarNav -> findNavController().navigate(R.id.action_perfilFragment_to_localizacionFragment)
            }
        }
    }
}
