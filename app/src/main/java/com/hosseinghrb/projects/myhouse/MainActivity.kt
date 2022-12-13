package com.hosseinghrb.projects.myhouse

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hosseinghrb.projects.myhouse.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.ButtonMainRegister.setOnClickListener {
            val intent = Intent(this,TwoRegisterLogin::class.java)
            startActivity(intent)
        }

        binding.ButtonMainLogin.setOnClickListener {
            val intent = Intent(this,LoginActivity::class.java)
            startActivity(intent)
        }
    }
}