package com.example.myapp_test_7_8_9_10_11_12.ch13_Test

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.myapp_test_7_8_9_10_11_12.databinding.ActivityTestIntent2DetailBinding

class TestIntent2DetailActivity : AppCompatActivity() {
    lateinit var binding :ActivityTestIntent2DetailBinding
    // 2번 화면
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTestIntent2DetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // 1번 화면에서 넘어온 데이터 받아서, 결과 뷰에 붙이기 작업.
        // 임시 저장소에 담기.
        val email = intent.getStringExtra("email")
        val password = intent.getStringExtra("password")
        val age = intent.getStringExtra("age")
//        val age = intent.getIntExtra("age",30)

        // 데이터 확인
        Log.d("lsy","데이터 확인 2번 화면 이메일: ${email} , " +
                "패스워드: ${password}, 나이: ${age}")

        binding.resultNameView.text = "이메일 : $email"
        binding.resultEmailView.text = "패스워드 : $password"
        binding.resultAgeView.text = "나이 : $age "

    }
}




