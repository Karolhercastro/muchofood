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
import com.example.muchofood.view.adapter.comidaAdapter
import com.google.android.material.bottomnavigation.BottomNavigationView


class ComidasFragment : Fragment() {
    lateinit var recyclerPizzas:RecyclerView


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       val view= inflater.inflate(R.layout.fragment_comidas, container, false)
        recyclerPizzas=view.findViewById(R.id.recyclerPizzasView)
        val adapter=comidaAdapter()
        recyclerPizzas.layoutManager=LinearLayoutManager(context)
        recyclerPizzas.adapter=adapter
        return view
    }




}