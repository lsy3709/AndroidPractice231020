package com.example.myapp_test6

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //기본 뷰 선택 방법1
        // findViewById 를 이용해서, 로그인 버튼 클릭시, 해당 화면으로 이동하기.
        val loginBtn: Button = findViewById(R.id.loginBtn)

        // 뷰 바인딩 선택 방법2

        // 클릭시 이벤트 리스너 이용해서, 해당 화면으로 이동.
        loginBtn.setOnClickListener {
            val intent = Intent(this@MainActivity, LoginFormActivity::class.java)
            startActivity(intent)
        }

        // viewBinding 기술을 이용해서, 좀더 쉽게 뷰를 선택하는 방법 이용해서, 해당 화면으로 이동하기.
    }
}