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
import com.example.muchofood.view.adapter.platosAdapter
import com.example.muchofood.view.adapter.sopasAdapter
import com.google.android.material.bottomnavigation.BottomNavigationView


class PlatosFragment : Fragment() {
    lateinit var recyclerPlatos: RecyclerView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view= inflater.inflate(R.layout.fragment_platos, container, false)
        recyclerPlatos=view.findViewById(R.id.recyclerPlatosView)
        val adapter= platosAdapter()
        recyclerPlatos.layoutManager= LinearLayoutManager(context)
        recyclerPlatos.adapter=adapter
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val botonVarPlatos=view.findViewById<BottomNavigationView>(R.id.bottom_navigation)
        botonVarPlatos.setOnNavigationItemReselectedListener {
            when (it.itemId) {
                R.id.homeBarNav -> findNavController().navigate(R.id.action_platosFragment_to_homeFragment)
                R.id.comprasBarNav -> findNavController().navigate(R.id.action_platosFragment_to_comprasFragment)
                R.id.mapaBarNav -> findNavController().navigate(R.id.action_platosFragment_to_mapFragment)
                R.id.perfilBarNav -> findNavController().navigate(R.id.action_platosFragment_to_perfilFragment)

            }
        }
    }
}
