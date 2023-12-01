package com.example.mp_pr.login;

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.mp_pr.R
import com.example.mp_pr.databinding.ActivityLogInBinding


class LogInActivity : AppCompatActivity() {
    private lateinit var loginViewModel: LoginViewModel
    private lateinit var binding: ActivityLogInBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityLogInBinding.inflate(layoutInflater)
        setContentView(binding.root)

        loginViewModel=ViewModelProvider(this)[LoginViewModel::class.java]
        binding.viewModel = loginViewModel
        binding.activity = this
        binding.lifecycleOwner = this

    }
}

