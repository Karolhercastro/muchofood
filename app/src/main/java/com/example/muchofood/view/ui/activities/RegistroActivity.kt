package com.example.muchofood.view.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.muchofood.R
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase


class RegistroActivity : AppCompatActivity() {
    lateinit var registrohomeboton: Button
    private lateinit var firebaseAuth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)


        firebaseAuth=Firebase.auth
        val nombres = findViewById<EditText>(R.id.nombreRegistro)
        val apellidos= findViewById<EditText>(R.id.apellidosRegistro2)
        val correoReg= findViewById<EditText>(R.id.correoRegistro2)
        val celulares= findViewById<EditText>(R.id.celularRegistro2)
        val direccion= findViewById<EditText>(R.id.direccionRegistro2)
        val observacion= findViewById<EditText>(R.id.observacionesRegistro)
        val contrasenaregis= findViewById<EditText>(R.id.contrasenaRegistro2)
        val contrasenaConfirmar= findViewById<EditText>(R.id.contrasenaConfirmarRegistro)

        registrohomeboton = findViewById(R.id.ingresarRegistro2)

        registrohomeboton.setOnClickListener {
            createUser(correoReg.text.toString(),contrasenaregis.text.toString())
        }
    }

    fun createUser(correoReg:String,contrasenaregis:String){
        firebaseAuth.createUserWithEmailAndPassword(correoReg, contrasenaregis)
            .addOnCompleteListener(this){
                Task->if(Task.isSuccessful){
                Toast.makeText(baseContext,"Cuenta creada",Toast.LENGTH_LONG).show()
                startActivity(Intent(this,LoginActivity::class.java))
                }else{
                    Toast.makeText(baseContext,"Intente de nuevo",Toast.LENGTH_LONG).show()
            }
            }
    }
}