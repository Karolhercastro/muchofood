package com.example.muchofood.view.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.muchofood.R
import com.example.muchofood.view.adapter.bebidasAdapter
import com.example.muchofood.view.adapter.postresAdapter
import com.google.android.material.bottomnavigation.BottomNavigationView


class BebidasFragment : Fragment() {
    lateinit var recyclerBebidas: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view= inflater.inflate(R.layout.fragment_bebidas, container, false)
        recyclerBebidas=view.findViewById(R.id.recyclerBebidasView)
        val adapter= bebidasAdapter()
        recyclerBebidas.layoutManager= LinearLayoutManager(context)
        recyclerBebidas.adapter=adapter
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val botonVarBebidas=view.findViewById<BottomNavigationView>(R.id.bottom_navigation)
        botonVarBebidas.setOnNavigationItemReselectedListener {
            when (it.itemId) {
                R.id.homeBarNav -> findNavController().navigate(R.id.action_bebidasFragment_to_homeFragment)
                R.id.comprasBarNav -> findNavController().navigate(R.id.action_bebidasFragment_to_comprasFragment)
                R.id.mapaBarNav -> findNavController().navigate(R.id.action_bebidasFragment_to_mapFragment)
                R.id.perfilBarNav -> findNavController().navigate(R.id.action_bebidasFragment_to_perfilFragment)

            }
        }
    }
}