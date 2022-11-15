package com.example.muchofood.view.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.muchofood.R
import com.google.android.gms.tasks.Task
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class LoginActivity : AppCompatActivity() {
    lateinit var inicioboton:Button
    lateinit var registroboton:Button
    lateinit var recuperarcontra: TextView
    lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        firebaseAuth=Firebase.auth
        val correos= findViewById<EditText>(R.id.correo)
        val contrasenregis=findViewById<EditText>(R.id.contrasena)


        inicioboton = findViewById(R.id.recuperarBoton)
        registroboton= findViewById(R.id.registroLogin)
        recuperarcontra= findViewById(R.id.recuperarContra)

        inicioboton.setOnClickListener {
            user_login (correos.text.toString(),contrasenregis.text.toString())
        }

        registroboton.setOnClickListener {
            startActivity(Intent(this,RegistroActivity::class.java))
        }

        recuperarcontra.setOnClickListener {
            startActivity(Intent(this, RecuperarActivity::class.java))
        }
    }
    private fun user_login(correos:String, contrasenregis:String){
        firebaseAuth.signInWithEmailAndPassword(correos, contrasenregis)
            .addOnCompleteListener(this){
                    Task-> if(Task.isSuccessful){
                        val useres=firebaseAuth.currentUser
                        Toast.makeText(baseContext,useres?.uid.toString(), Toast.LENGTH_LONG).show()
                startActivity(Intent(this,HomeActivity::class.java))
            }else{
                Toast.makeText(baseContext,"ERROR DATOS INCORRECTOS",Toast.LENGTH_LONG).show()
            }
            }
    }

}