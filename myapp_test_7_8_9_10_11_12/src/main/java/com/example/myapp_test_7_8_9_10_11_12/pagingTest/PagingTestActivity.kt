package com.example.myapp_test_7_8_9_10_11_12.pagingTest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapp_test_7_8_9_10_11_12.R
import com.example.myapp_test_7_8_9_10_11_12.ch11_12_Test.recycler.MyAdapter
import com.example.myapp_test_7_8_9_10_11_12.databinding.ActivityPagingTestBinding

class PagingTestActivity : AppCompatActivity() {
    lateinit var binding : ActivityPagingTestBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPagingTestBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // 더미 데이터로 텍스트만 임시로 사용하지만,
        // 공공데이터, 사용자 정의한 데이터를 가지고 와서,
        // 원하는 뷰에 데이터를 넣는 , 바인딩 작업을 함.
        val datas = mutableListOf<String>()
        for(i in 1..20) {
            datas.add("라바 $i")
        }
        // 기본 값으로 세로 방향 출력.
//        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        // 가로 방향으로 출력 해보기.
        val layoutManager = LinearLayoutManager(this)
//        layoutManager.orientation = LinearLayoutManager.HORIZONTAL
        binding.pagingRecyclerView.layoutManager = layoutManager

        // 액티비티 -> 리사이클러뷰 -> 실제 데이터를 연결하는 부분. 중요함.!!!!!!!!!!!!
        binding.pagingRecyclerView.adapter = MyAdapter(datas)
        // 구분선 넣기, 나중에 옵션으로 배경이미지도 넣기 가능.
        binding.pagingRecyclerView.addItemDecoration(
            DividerItemDecoration(this,
                LinearLayoutManager.VERTICAL)
        )
    } // onCreate

    // 스크롤뷰 관련 함수
    // computeVerticalScrollOffset() 메소드는
    // 현재 리사이클러뷰의 지나간 영역을 알려주는 메소드입니다
    //
    // computeVerticalScrollRange() 메소드는
    // 현재 리사이클러뷰에서 할당된 값(리사이클러뷰를 스크롤할 수 있는 총 값)을 반환해주는 메소드입니다.

    //computeVerticalScrollExtent() 메소드는
    // 현재 휴대폰으로 보여지고 있는 리사이클러뷰의 영역을 의미합니다

    // offset + extend = range
    // offset/(range - extend) = 1 로 만든 후, 양 변에 100을 곱해 100%를 만들어주는 것



}

fun scrollPercent(recyclerView: RecyclerView): Double {
    return (recyclerView.computeVerticalScrollOffset() * 1.0 / (recyclerView.computeVerticalScrollRange() - recyclerView.computeVerticalScrollExtent())) * 100.0
}

fun RecyclerView.scrollPercent() : Double {
    return (this.computeVerticalScrollOffset() * 1.0 / (this.computeVerticalScrollRange() - this.computeVerticalScrollExtent())) * 100.0
}
//    출처: https://no-dev-nk.tistory.com/59 [좀 모자란 개발 블로그:티스토리]