package com.example.muchofood.view.ui.fragment

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Bitmap
import android.os.Bundle
import android.preference.PreferenceManager.OnActivityResultListener
import android.provider.MediaStore
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import com.example.muchofood.R

class PerfilFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view =inflater.inflate(R.layout.fragment_perfil, container, false)

        val bottonCamara= view.findViewById<Button>(R.id.botonCamara)
        bottonCamara.setOnClickListener {
            val intent=Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(intent,123)
        }


        val bottonGaleria= view.findViewById<Button>(R.id.botonGaleria)
        bottonGaleria.setOnClickListener {
            val intent=Intent(Intent.ACTION_PICK)
            intent.type="image/*"
            startActivityForResult(intent,456)
        }

        return view

    }

    @SuppressLint("SuspiciousIndentation")
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        val imageView=view?.findViewById<ImageView>(R.id.fotoPerfil)
        if (requestCode==123){
            var bitmap=data?.extras?.get("data") as Bitmap
                imageView?.setImageBitmap(bitmap)
            }else if (requestCode==456){
                imageView?.setImageURI(data?.data)
        }
    }
}