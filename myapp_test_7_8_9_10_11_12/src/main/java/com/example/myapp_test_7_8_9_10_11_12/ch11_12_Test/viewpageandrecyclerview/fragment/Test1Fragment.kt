package com.example.myapp_test_7_8_9_10_11_12.ch11_12_Test.viewpageandrecyclerview.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapp_test_7_8_9_10_11_12.ch11_12_Test.recycler.MyAdapter3
import com.example.myapp_test_7_8_9_10_11_12.ch11_12_Test.tabTest.ItemData
//import com.example.myapp_test_7_8_9_10_11_12.ch11_12_Test.tabTest.MyFireAdapter
import com.example.myapp_test_7_8_9_10_11_12.databinding.FragmentTest1Binding


class Test1Fragment : Fragment() {
    lateinit var binding: FragmentTest1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentTest1Binding.inflate(layoutInflater)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTest1Binding.inflate(layoutInflater,container,false)
        val itemList = mutableListOf<String>()
        val itemData1 = ItemData()
        itemData1.email = "lsy1"
        val itemData2 = ItemData()
        itemData2.email = "lsy2"
        itemList.add(itemData1)
        itemList.add(itemData2)

//        리사이클러뷰 붙이기
        binding.tabRecyclerTest1.adapter = context?.let { MyAdapter3(it,itemList) }
        binding.tabRecyclerTest1.layoutManager = LinearLayoutManager(context)

        return binding.root
    }

}