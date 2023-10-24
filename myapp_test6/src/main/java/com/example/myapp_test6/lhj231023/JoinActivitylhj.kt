package com.example.myapp_test6.lhj231023

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapp_test6.R
import com.example.myapp_test6.databinding.ActivityJoinBinding

class JoinActivitylhj : AppCompatActivity() {
    private lateinit var binding: ActivityJoinBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityJoinBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}