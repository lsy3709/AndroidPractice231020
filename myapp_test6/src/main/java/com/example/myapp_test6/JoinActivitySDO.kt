package com.example.myapp_test6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapp_test6.databinding.ActivityJoinBinding
import com.example.myapp_test6.databinding.ActivityJoinSdoBinding

class JoinActivitySDO : AppCompatActivity() {
    private lateinit var binding: ActivityJoinSdoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityJoinSdoBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}