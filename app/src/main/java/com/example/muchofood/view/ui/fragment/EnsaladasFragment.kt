package com.example.muchofood.view.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.muchofood.R
import com.example.muchofood.view.adapter.ensaladasAdapter
import com.example.muchofood.view.adapter.platosAdapter


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
}
