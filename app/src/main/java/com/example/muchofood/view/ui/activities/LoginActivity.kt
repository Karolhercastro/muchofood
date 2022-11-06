package com.example.muchofood.view.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.muchofood.R

class LoginActivity : AppCompatActivity() {
    lateinit var inicioboton:Button
    lateinit var registroboton:Button
    lateinit var recuperarcontra: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        inicioboton = findViewById(R.id.recuperarBoton)
        registroboton= findViewById(R.id.registroLogin)
        recuperarcontra= findViewById(R.id.recuperarContra)

        inicioboton.setOnClickListener {
            startActivity(Intent(this,HomeActivity::class.java))
        }

        registroboton.setOnClickListener {
            startActivity(Intent(this,RegistroActivity::class.java))
        }

        recuperarcontra.setOnClickListener {
            startActivity(Intent(this, RecuperarActivity::class.java))
        }
    }
}