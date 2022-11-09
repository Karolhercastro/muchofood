package com.example.muchofood.view.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.muchofood.R
import com.example.muchofood.view.adapter.bebidasAdapter
import com.example.muchofood.view.adapter.postresAdapter


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
}