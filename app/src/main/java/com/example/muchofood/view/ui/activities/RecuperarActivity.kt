package com.example.muchofood.view.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.muchofood.R
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class RecuperarActivity : AppCompatActivity() {
    private lateinit var firebaseAuth: FirebaseAuth
    lateinit var recuperarButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recuperar)
        firebaseAuth=Firebase.auth
        recuperarButton=findViewById(R.id.recuperarBoton)
        val correo=findViewById<EditText>(R.id.correo)
        recuperarButton.setOnClickListener {
            cambioContra(correo.text.toString())
        }


    }
    private fun cambioContra(correo:String){
        firebaseAuth.sendPasswordResetEmail(correo)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    Toast.makeText(
                        baseContext,
                        "Correo cambio contraseña enviado",
                        Toast.LENGTH_SHORT
                    ).show()
                    startActivity(Intent(this, LoginActivity::class.java))
                }else{
                    Toast.makeText(baseContext, "Error, correo no existe", Toast.LENGTH_SHORT).show()
                }
            }
    }
}


