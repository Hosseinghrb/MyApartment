package com.hosseinghrb.projects.myhouse

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hosseinghrb.projects.myhouse.databinding.ActivityLoginBinding


class LoginActivity : AppCompatActivity() {
    lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }
}