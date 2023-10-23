package com.example.myapp_test6.kjh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapp_test6.JoinActivity
import com.example.myapp_test6.R
import com.example.myapp_test6.databinding.ActivityMainBinding
import com.example.myapp_test6.databinding.ActivityMainKjhBinding

class MainKjhActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        lateinit var binding: ActivityMainKjhBinding
        binding = ActivityMainKjhBinding.inflate(layoutInflater)

        binding.loginBtn.setOnClickListener {
            val intent = Intent(this@MainKjhActivity, LoginActivity::class.java)
            startActivity(intent)
        }
        binding.joinBtn.setOnClickListener {
            val intent = Intent(this@MainKjhActivity, com.example.myapp_test6.kjh.JoinActivity::class.java)
            startActivity(intent)
        }
        setContentView(binding.root)
    }
}