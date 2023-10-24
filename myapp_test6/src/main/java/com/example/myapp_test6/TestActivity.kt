package com.example.myapp_test6

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.myapp_test6.databinding.ActivityMainBinding
import com.example.myapp_test6.databinding.ActivityTestBinding

class TestActivity : AppCompatActivity() {
    // 뷰바인딩 순서1
    // 이름은 고정 : 예를 들어 , 레이아웃 이름 :activity_test
    // 이름 이 자동으로 생성 : ActivityTestBinding . 캐멀케이스 표기법에 뒤에 + binding 추가.
    lateinit var activityTestBinding: ActivityTestBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // R.layout 버전으로 출력을 하는 형식.
        setContentView(R.layout.activity_test)
        // 뷰바인딩 순서2
        activityTestBinding = ActivityTestBinding.inflate(layoutInflater)
        // // 뷰바인딩 순서3 , 전체 레이아웃, 바인딩으로 출력을 해야함.
        //setContentView(activityMainBinding.root)

        //showBtn -> 클릭시 , 프로필 이미지 profileImg , 보이게
        // 특정 뷰를 선택하는 방법 2가지.
        // 1) findViewById<>() 를 이용하는 방법
        val showBtn:Button = findViewById(R.id.showBtn)
        // 2) viewBinding 를 이용하는 방법
        val showBtn = activityMainBinding.

        // hideBtn -> 클릭시 , 프로필 이미지 profileImg , 사라짐.
    }
}