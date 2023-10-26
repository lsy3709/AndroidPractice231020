package com.example.myapp_test_7_8_9_10_11_12.ch11_Test

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapp_test_7_8_9_10_11_12.ch11_Test.recycler.MyAdapter
import com.example.myapp_test_7_8_9_10_11_12.databinding.ActivityTest11RecyclerViewBinding

class Test11_RecyclerViewActivity : AppCompatActivity() {
    lateinit var binding : ActivityTest11RecyclerViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTest11RecyclerViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val datas = mutableListOf<String>()
        for(i in 1..10) {
            datas.add("라바 $i")
        }
        // 기본 값으로 세로 방향 출력.
//        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        // 가로 방향으로 출력 해보기.
        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.HORIZONTAL
        binding.recyclerView.layoutManager = layoutManager

        binding.recyclerView.adapter = MyAdapter(datas)
        // 구분선 넣기, 나중에 옵션으로 배경이미지도 넣기 가능.
        binding.recyclerView.addItemDecoration(DividerItemDecoration(this,LinearLayoutManager.VERTICAL))

    }
}