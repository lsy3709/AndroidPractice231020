package com.example.myapp_test_11_homework.ch11.recycler

import android.text.Layout
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import com.example.myapp_test_11_homework.databinding.ItemRecyclerBinding

//뷰를 모아둔 박스 -> 목록 요소의 뷰
class MyViewHolder(val binding: ItemRecyclerBinding) : RecyclerView.ViewHolder(binding.root)


//뷰와 데이터를 연결한다.
//리사이클러뷰에서, 뷰페이저2에서도 같은 패턴으로 사용할 예정
class MyAdapter(val datas:MutableList<String>) : RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    //리싸이클러 뷰의 어댑터를 상속 받으면, 필수적으로 재정의 해야하는 함수들 3개.
    // 자동완성으로 생성.

    // 뷰 생성해주는 역할
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder =
        MyViewHolder(ItemRecyclerBinding.inflate(LayoutInflater.from(parent.context), parent, false))


    //출력할 목록 아이템의 크기 (사이즈), 더미 데이터를 사용할 예정
    override fun getItemCount(): Int {
        Log.d("kkt","getItemCount : ${datas.size}")
        return datas.size
    }


    //뷰에 데이터를 연동(바인딩) 해주는 작업.
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        Log.d("kkt","onBindViewHolder : $position")
        val binding = (holder as MyViewHolder).binding
        // 뷰 데이터 출력
        binding.testText.text = datas[position]
        binding.itemRoot.setOnClickListener {
            Log.d("kkt","item clicked : $position")
        }
    }
}


//목록 아이템의 요소 뷰를 만든다