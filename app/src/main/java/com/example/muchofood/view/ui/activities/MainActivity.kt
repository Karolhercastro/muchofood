package com.example.muchofood.view.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.muchofood.R
import com.example.muchofood.databinding.ActivityMainBinding
import android.os.Handler
import android.os.Looper
import android.content.Intent

class MainActivity : AppCompatActivity() {
    lateinit var  binding: ActivityMainBinding
    lateinit var handler: Handler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.animationView.setAnimation(R.raw.openlocal)
        binding.animationView.playAnimation()

        handler= Handler(Looper.myLooper()!!)
        handler.postDelayed(
            {
                val intent = Intent(this,LoginActivity::class.java)
                startActivity(intent)
                finish()
            }, 4000)
    }
}