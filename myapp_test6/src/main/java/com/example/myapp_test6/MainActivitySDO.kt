package com.example.myapp_test6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.myapp_test6.databinding.ActivityMainBinding
import com.example.myapp_test6.databinding.ActivityMainSdoBinding

class MainActivitySDO : AppCompatActivity() {
    lateinit var binding: ActivityMainSdoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainSdoBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.joinBtn.setOnClickListener {
            val intent = Intent(this@MainActivitySDO, JoinActivitySDO::class.java)
            startActivity(intent)
        }
        binding.loginBtn.setOnClickListener {
            val intent = Intent(this@MainActivitySDO, LoginActivitySDO::class.java)
            startActivity(intent)
        }
    }


}