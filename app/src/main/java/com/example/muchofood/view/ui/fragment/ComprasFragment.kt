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
import com.google.android.material.bottomnavigation.BottomNavigationView


class ComprasFragment : Fragment() {
    lateinit var recyclerSopas: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view= inflater.inflate(R.layout.fragment_sopas, container, false)
        recyclerSopas=view.findViewById(R.id.recyclerSopasView)
        val adapter=comprasAdapter()
        recyclerSopas.layoutManager= LinearLayoutManager(context)
        recyclerSopas.adapter=adapter
        return view
    }




}