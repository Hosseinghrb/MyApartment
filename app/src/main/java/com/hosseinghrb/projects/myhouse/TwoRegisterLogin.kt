package com.hosseinghrb.projects.myhouse

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hosseinghrb.projects.myhouse.databinding.ActivityTwoRegisterLoginBinding


class TwoRegisterLogin : AppCompatActivity() {
    lateinit var binding: ActivityTwoRegisterLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTwoRegisterLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.UserRegisterActivity.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }

        binding.UserCrewActivity.setOnClickListener {
            val intent = Intent(this, RegisterCrewActivity::class.java)
            startActivity(intent)
        }
    }
}