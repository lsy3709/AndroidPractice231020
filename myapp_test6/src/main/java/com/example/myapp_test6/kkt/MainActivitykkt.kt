package com.example.myapp_test6.kkt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import com.example.myapp_test6.kkt.JoinActivitykkt
import com.example.myapp_test6.LoginFormActivity
import com.example.myapp_test6.R
import com.example.myapp_test6.databinding.ActivityMainActivitykktBinding


class MainActivitykkt : AppCompatActivity() {

    lateinit var imgCheck: String
    lateinit var TAG: String
    lateinit var binding: ActivityMainActivitykktBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // 뷰 바인딩 순서2
        // binding 인스턴스에 모든 뷰를 담았다,
        binding = ActivityMainActivitykktBinding.inflate(layoutInflater)
        //뷰 바인딩 설정순서 3
        setContentView(binding.root)

        // 변수 초기화
        imgCheck = "Y"
        TAG = ""

        //기본 findViewById를 이용해서, 로그인 버튼 클릭시 , 해당 화면으로 이동하기
        // 기본 뷰 선택방법1
        val loginBtn: Button = findViewById(R.id.loginBtn)

        //뷰 바인딩 선택방법 2
        //회원가입폼으로 이동하는 화면
        val joinBtn: Button = findViewById(R.id.joinBtn)
        binding.joinBtn.setOnClickListener {
            //intent 는 시스템에 메세지를 전달하는 용도로 사용도 하지만
            //일단 액티비티간 화면 이동으로 잠시 사용한다
            val intent = Intent(this@MainActivitykkt, JoinActivitykkt::class.java)
            //이 함수 사용해서 2번째 화면으로 이동
            startActivity(intent)
        }

        // 버튼으로, 뷰 show/hide 해보기
        val testBtn: Button = findViewById(R.id.testBtn)
        testBtn.setOnClickListener {
            Log.d(TAG, "버튼을 클릭시 확인.")
            if (imgCheck.equals("Y")) {
                val imgView: ImageView = findViewById(R.id.imageView)
                imgView.visibility = View.VISIBLE
                imgCheck = "N"
            } else {
                val imgView: ImageView = findViewById(R.id.imageView)
                imgView.visibility = View.INVISIBLE
                imgCheck = "Y"
            }
        }

        // 클릭시 이벤트 리스너 이용해서, 해당 화면으로 이동.
        loginBtn.setOnClickListener {
            val intent = Intent(this@MainActivitykkt, LoginFormActivity::class.java)
            startActivity(intent)
        }
    }
}