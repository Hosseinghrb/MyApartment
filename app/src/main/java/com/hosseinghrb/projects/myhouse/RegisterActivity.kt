package com.hosseinghrb.projects.myhouse

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.hosseinghrb.projects.myhouse.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {
    lateinit var binding: ActivityRegisterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonMainRegisterUserActivity.setOnClickListener {
            if (binding.UsernameInputRegisterActivity.text.toString().isEmpty()or
                binding.PhoneInputRegisterActivity.text.toString().isEmpty() or
                binding.PasswordInputRegisterActivity.text.toString().isEmpty() or
                binding.RPasswordInputRegisterActivity.text.toString().isEmpty()){
                Toast.makeText(this,"Fill in all the details",Toast.LENGTH_SHORT).show()
            }else{
                val intent = Intent(this,LoginActivity::class.java)
                startActivity(intent)
            }
        }
    }
}