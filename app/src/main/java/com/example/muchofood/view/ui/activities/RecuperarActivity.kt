package com.example.muchofood.view.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.muchofood.R
import android.widget.Button

class RecuperarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recuperar)
        val botonrecuperarcontra=findViewById<Button>(R.id.recuperarBoton)
        botonrecuperarcontra.setOnClickListener{
            startActivity((Intent(this,LoginActivity::class.java)))
        }
    }
}


