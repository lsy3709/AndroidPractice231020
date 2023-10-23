package com.example.myapp_test6.kjh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapp_test6.R
import com.example.myapp_test6.databinding.ActivityJoinKjhBinding
import com.example.myapp_test6.databinding.ActivityMainKjhBinding

class JoinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        lateinit var binding: ActivityJoinKjhBinding
        binding = ActivityJoinKjhBinding.inflate(layoutInflater)

        binding.backPage.setOnClickListener {
            val intent = Intent(this@JoinActivity, MainKjhActivity::class.java)
            startActivity(intent)
        }
        setContentView(binding.root)
    }
}