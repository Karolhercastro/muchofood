package com.example.muchofood.view.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.muchofood.R
import com.example.muchofood.view.adapter.platosAdapter
import com.example.muchofood.view.adapter.sopasAdapter


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
}
