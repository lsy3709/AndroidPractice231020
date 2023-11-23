package com.example.myapp_test_7_8_9_10_11_12.ch19_Test_Firebase

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapp_test_7_8_9_10_11_12.databinding.ActivityFireBaseBinding

class FireBaseActivity : AppCompatActivity() {
    lateinit var binding : ActivityFireBaseBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFireBaseBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}