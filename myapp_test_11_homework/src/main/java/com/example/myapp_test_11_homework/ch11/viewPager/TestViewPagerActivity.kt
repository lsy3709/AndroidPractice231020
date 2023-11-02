package com.example.myapp_test_11_homework.ch11.viewPager

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapp_test_11_homework.R
import com.example.myapp_test_11_homework.ch11.recycler.MyAdapter2
import com.example.myapp_test_11_homework.ch11.viewPager.adapter.MyFragmentPagerAdapter
import com.example.myapp_test_11_homework.databinding.ActivityTestViewPagerBinding
import com.example.myapp_test_11_homework.databinding.ItemPagerBinding

class TestViewPagerActivity : AppCompatActivity() {
    lateinit var binding: ActivityTestViewPagerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTestViewPagerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //더미데이터 재사용, 일단, 텍스트뷰
        //----- 테스트를 위한 더미 데이터 생성 --------------------
        val testDataSet = ArrayList<String>()
        for (i in 0..19) {
            testDataSet.add("TEST DATA$i")
        }
        //--------------------------------------------------------

        //외부기능이니 디펜던시 build.gradle 에 복사후 sync now 해서
        //뷰 페이저2 출력방식 2가지
        //방법 1)어댑터 사용법
        binding.viewPager1.adapter = MyAdapter2(testDataSet)

        // 방법 2) , 프래그먼트 형식으로 뷰페이저 구성.
        // 준비물, 1) 프래그먼트 형식의 어댑터 2) 요소로 사용이될 프래그먼트 3개정도 만들기.

        binding.viewPager2.adapter = MyFragmentPagerAdapter(this)
    }

    class MyPagerViewHolder(val binding: ItemPagerBinding): RecyclerView.ViewHolder(binding.root)
    class MyPagerAdapter(val datas: MutableList<String>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {
        override fun getItemCount(): Int {
            return datas.size
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder =
            MyPagerViewHolder(
                ItemPagerBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
            )

        override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
            val binding = (holder as MyPagerViewHolder).binding
            //뷰에 데이터 출력
            binding.itemPagerTextView.text = datas[position]
            when (position % 3) {
                0 -> binding.itemPagerTextView.setBackgroundColor(Color.RED)
                1 -> binding.itemPagerTextView.setBackgroundColor(Color.BLUE)
                2 -> binding.itemPagerTextView.setBackgroundColor(Color.GREEN)
            }
        }
    }
}