package com.example.muchofood.view.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.muchofood.R

class RegistroActivity : AppCompatActivity() {
    lateinit var registrohomeboton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)
        registrohomeboton = findViewById(R.id.ingresarRegistro2)

        registrohomeboton.setOnClickListener {
            startActivity(Intent(this,HomeActivity::class.java))
        }
    }
}