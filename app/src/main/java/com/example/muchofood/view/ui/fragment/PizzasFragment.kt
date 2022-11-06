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


class PizzasFragment : Fragment() {
    lateinit var recyclerPizzas:RecyclerView


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       val view= inflater.inflate(R.layout.fragment_pizzas, container, false)
        recyclerPizzas=view.findViewById(R.id.recyclerPizzasView)
        val adapter=pizzasAdapter()
        recyclerPizzas.layoutManager=LinearLayoutManager(context)
        recyclerPizzas.adapter=adapter
        return view
    }


}