package com.example.muchofood.view.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.fragment.findNavController
import com.example.muchofood.R


class HomeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view=inflater.inflate(R.layout.fragment_home, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val cardPizza = view.findViewById<ImageView>(R.id.cardPizzas)
        cardPizza.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_pizzasFragment)
        }

        val cardSopa = view.findViewById<ImageView>(R.id.cardSopas)
        cardSopa.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_sopasFragment)
        }

        val cardPlato = view.findViewById<ImageView>(R.id.cardPlatos)
        cardPlato.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_platosFragment)
        }


        val cardEnsalada = view.findViewById<ImageView>(R.id.cardEnsaladas)
        cardEnsalada.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_ensaladasFragment)
        }


        val cardPostre = view.findViewById<ImageView>(R.id.cardPostres)
        cardPostre.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_postresFragment)
        }


        val cardBebida = view.findViewById<ImageView>(R.id.cardBebidas)
        cardBebida.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_bebidasFragment)
        }


    }

}