package com.example.muchofood.view.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.fragment.findNavController
import com.example.muchofood.R
import com.google.android.material.bottomnavigation.BottomNavigationView


class HomeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view= inflater.inflate(R.layout.fragment_home, container, false)
        return view
            }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val cardComidas =view.findViewById<ImageView>(R.id.cardComida)
        cardComidas.setOnClickListener{
            findNavController().navigate(R.id.action_homeFragment_to_comidasFragment)}

        val cardCompr =view.findViewById<ImageView>(R.id.cardCompras)
            cardCompr.setOnClickListener{
                findNavController().navigate(R.id.action_homeFragment_to_comprasFragment)}

        val cardperfiles =view.findViewById<ImageView>(R.id.cardPerfil)
                cardperfiles.setOnClickListener{
                    findNavController().navigate(R.id.action_homeFragment_to_perfilFragment)}

        val cardLocalizaciones =view.findViewById<ImageView>(R.id.cardLocalizacion)
                    cardLocalizaciones.setOnClickListener{
                        findNavController().navigate(R.id.action_homeFragment_to_localizacionFragment) }
    }

}