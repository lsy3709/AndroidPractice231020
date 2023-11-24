package com.example.myapp_test_7_8_9_10_11_12.glideSliderTest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapp_test_7_8_9_10_11_12.databinding.ActivityGildeSliderTestBinding

class GildeSliderTestActivity : AppCompatActivity() {
    lateinit var binding: ActivityGildeSliderTestBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGildeSliderTestBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}