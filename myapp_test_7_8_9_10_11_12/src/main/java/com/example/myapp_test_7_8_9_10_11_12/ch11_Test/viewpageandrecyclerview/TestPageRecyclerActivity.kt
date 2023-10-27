package com.example.myapp_test_7_8_9_10_11_12.ch11_Test.viewpageandrecyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapp_test_7_8_9_10_11_12.ch11_Test.viewpageandrecyclerview.adapter.ViewPageAdapterTest
import com.example.myapp_test_7_8_9_10_11_12.databinding.ActivityTestPageRecyclerBinding

class TestPageRecyclerActivity : AppCompatActivity() {
    lateinit var binding: ActivityTestPageRecyclerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTestPageRecyclerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // 뷰페이저2 프래그먼트 어댑터 이용해서 출력 해보기.
        // 현재 액티비티 도화지 , 캔버스 , 기본 화면.
        // 여기에 뷰페이저와, 리사이클러뷰 2개를 붙이 예정.

        //뷰페이저2 준비물 1)프래그먼트 어댑터 2) 목록요소 , 프래그먼트 3개 필요. 3) 더미 데이터(=자기자신)
        binding.viewPager1.adapter =ViewPageAdapterTest(this)




    }

}






