package com.example.muchofood.view.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.muchofood.R
import com.example.muchofood.view.adapter.pizzasAdapter
import com.example.muchofood.view.adapter.sopasAdapter


class SopasFragment : Fragment() {
    lateinit var recyclerSopas: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view= inflater.inflate(R.layout.fragment_sopas, container, false)
        recyclerSopas=view.findViewById(R.id.recyclerSopasView)
        val adapter=sopasAdapter()
        recyclerSopas.layoutManager= LinearLayoutManager(context)
        recyclerSopas.adapter=adapter
        return view
    }


}