package com.example.myapp_test_11_homework.ch11.recyclerDataTest

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapp_test_11_homework.R
import com.example.myapp_test_11_homework.ch11.recycler.MyAdapter
import com.example.myapp_test_11_homework.databinding.ActivityTestRecyclerDataKktBinding
import com.example.myapp_test_11_homework2.ch11.recyclerDataTest.MyDecoration

class TestRecyclerDataKktActivity : AppCompatActivity() {
    lateinit var binding: ActivityTestRecyclerDataKktBinding
    var newDataNumber = 50
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTestRecyclerDataKktBinding.inflate(layoutInflater)
        setContentView(binding.root)


        //----- 테스트를 위한 더미 데이터 생성 --------------------
        //----- 테스트를 위한 더미 데이터 생성 --------------------
        val testDataSet = ArrayList<String>()
        for (i in 0..19) {
            testDataSet.add("TEST DATA$i")
        }
        //--------------------------------------------------------

        //--------------------------------------------------------
//        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        val recyclerView = binding.recyclerView

        //--- LayoutManager는 아래 3가지중 하나를 선택하여 사용 ----
        // 1) LinearLayoutManager()
        // 2) GridLayoutManager()
        // 3) StaggeredGridLayoutManager()
        //---------------------------------------------------------

        val linearLayoutManager = LinearLayoutManager(this as Context)
        // true하면역방향
//        val gridLayoutManager = GridLayoutManager(this,3,GridLayoutManager.HORIZONTAL,false)
        //HORIZONTAL 가능
//        val staggeredoutManager = StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)

        //리니어, 수직, 수평 방향으로 출력
        recyclerView.layoutManager = linearLayoutManager // LayoutManager 설정

        //그리드, 테이블 형식으로 출력하기
//        recyclerView.layoutManager = gridLayoutManager // gridLayoutManager 설정

        // 지그재그
//        recyclerView.layoutManager = staggeredoutManager // gridLayoutManager 설정

        //리사이클러 뷰의 꾸미기 담당 클래스를 붙이는 작업(적용)
        recyclerView.addItemDecoration(MyDecoration(this))


//        val customAdapter = CustomAdapter(testDataSet)
        // 만들어 둔 어댑터를 붙이는 작업.
        val customAdapter = MyAdapter(testDataSet)
        recyclerView.adapter = customAdapter // 어댑터 설정


        //===== [데이터 추가/삭제 기능을 위해 추가된 코드] ===========


        //===== [데이터 추가/삭제 기능을 위해 추가된 코드] ===========
//        val buttonAddItem = findViewById<Button>(R.id.buttonAddItem)
//        val buttonDeleteItem = findViewById<Button>(R.id.buttonDeleteItem)
        val buttonAddItem = binding.buttonAddItem
        val buttonDeleteItem = binding.buttonDeleteItem

        buttonAddItem.setOnClickListener {
            testDataSet.add("NEW DATA " + newDataNumber++)
            customAdapter.notifyItemInserted(testDataSet.size)
        }

        buttonDeleteItem.setOnClickListener {
            testDataSet.removeAt(testDataSet.size - 1)
            customAdapter.notifyDataSetChanged() // 만능, 되도록 사용x
        }

    }
}