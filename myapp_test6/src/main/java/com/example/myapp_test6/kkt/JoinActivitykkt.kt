package com.example.myapp_test6.kkt

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapp_test6.databinding.ActivityJoinkktBinding


class JoinActivitykkt : AppCompatActivity() {
    private lateinit var binding: ActivityJoinkktBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityJoinkktBinding.inflate(layoutInflater)
        setContentView(binding.root)
        }
    }