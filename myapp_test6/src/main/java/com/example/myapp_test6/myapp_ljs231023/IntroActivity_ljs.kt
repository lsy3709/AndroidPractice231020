package com.example.myapp_test6.myapp_ljs231023

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.myapp_test6.MainActivity
import com.example.myapp_test6.R

class IntroActivity_ljs : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val handler = Handler()
        handler.postDelayed(Runnable {
            val intent = Intent(applicationContext, MainActivity_ljs::class.java)
            startActivity(intent)
            finish()
        }, 3000) // 3초 있다 메인액티비티로


        setContentView(R.layout.activity_intro)

    }
}