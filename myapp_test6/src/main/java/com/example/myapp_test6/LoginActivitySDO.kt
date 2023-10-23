package com.example.myapp_test6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapp_test6.databinding.ActivityJoinSdoBinding
import com.example.myapp_test6.databinding.ActivityLoginSdoBinding

class LoginActivitySDO : AppCompatActivity() {
    private lateinit var binding: ActivityLoginSdoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginSdoBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}