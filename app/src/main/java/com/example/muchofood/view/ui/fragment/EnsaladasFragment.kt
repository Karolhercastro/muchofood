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
import com.example.muchofood.view.adapter.ensaladasAdapter
import com.example.muchofood.view.adapter.platosAdapter
import com.google.android.material.bottomnavigation.BottomNavigationView


class EnsaladasFragment : Fragment() {
    lateinit var recyclerEnsaladas: RecyclerView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view= inflater.inflate(R.layout.fragment_ensaladas, container, false)
        recyclerEnsaladas=view.findViewById(R.id.recyclerEnsaladasView)
        val adapter= ensaladasAdapter()
        recyclerEnsaladas.layoutManager= LinearLayoutManager(context)
        recyclerEnsaladas.adapter=adapter
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val botonVarEnsaladas=view.findViewById<BottomNavigationView>(R.id.bottom_navigation)
        botonVarEnsaladas.setOnNavigationItemReselectedListener {
            when (it.itemId) {
                R.id.homeBarNav -> findNavController().navigate(R.id.action_ensaladasFragment_to_homeFragment)
                R.id.comprasBarNav -> findNavController().navigate(R.id.action_ensaladasFragment_to_comprasFragment)
                R.id.mapaBarNav -> findNavController().navigate(R.id.action_ensaladasFragment_to_mapFragment)
                R.id.perfilBarNav -> findNavController().navigate(R.id.action_ensaladasFragment_to_perfilFragment)

            }
        }
    }
}
