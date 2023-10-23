package com.example.myapp_test6.kjh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapp_test6.R
import com.example.myapp_test6.databinding.ActivityJoinKjhBinding
import com.example.myapp_test6.databinding.ActivityLoginKjhBinding

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        lateinit var binding: ActivityLoginKjhBinding
        binding = ActivityLoginKjhBinding.inflate(layoutInflater)

        binding.backPage1.setOnClickListener {
            val intent = Intent(this@LoginActivity, MainKjhActivity::class.java)
            startActivity(intent)
        }
        setContentView(binding.root)
    }
}