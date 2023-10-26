package com.example.myapp_test_7_8_9_10_11_12.ch11_Test

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapp_test_7_8_9_10_11_12.databinding.ActivityTest11ToolBarBinding

class Test11_ToolBarActivity : AppCompatActivity() {
    lateinit var binding : ActivityTest11ToolBarBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTest11ToolBarBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // 툴바 붙이기 작업.
        setSupportActionBar(binding.toolbar)

    }
}