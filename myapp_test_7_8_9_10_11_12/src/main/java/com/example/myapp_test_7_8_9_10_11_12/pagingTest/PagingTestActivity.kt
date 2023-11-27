package com.example.myapp_test_7_8_9_10_11_12.pagingTest

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapp_test_7_8_9_10_11_12.ch18_Test.retrofit.MyApplication4
import com.example.myapp_test_7_8_9_10_11_12.databinding.ActivityPagingTestBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class PagingTestActivity : AppCompatActivity() {
    lateinit var binding : ActivityPagingTestBinding
    lateinit var datas: MutableList<String>
    lateinit var datasSpring: MutableList<ItemModel2>
    lateinit var layoutManager : LinearLayoutManager
    var cnt : Int = 10;
    var page : Int = 0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPagingTestBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // 더미 데이터로 텍스트만 임시로 사용하지만,
        // 공공데이터, 사용자 정의한 데이터를 가지고 와서,
        // 원하는 뷰에 데이터를 넣는 , 바인딩 작업을 함.
        datas = mutableListOf<String>()

        datasSpring = mutableListOf<ItemModel2>()

        for(i in 1..10) {
            datas.add("라바 $i")
        }

        // 레트로핏 데이터 받아오기.
        // 변경1
        val networkService = (applicationContext as MyApplication4).networkServiceSpringShop

                val shopMainListCall = networkService.getList(page)

        //변경3
        // 실제 통신이 시작이 되는 부분, 이 함수를 통해서 데이터를 받아옴.
        shopMainListCall.enqueue(object : Callback<ItemListModel> {
            //익명 클래스가, Callback , 레트로핏2에서 제공하는 인터페이스를 구현했고,
            // 반드시 재정의해야하는 함수들이 있음.
            // 변경4
            override fun onResponse(call: Call<ItemListModel>, response: Response<ItemListModel>) {
                // 데이터를 성공적으로 받았을 때 수행되는 함수
                val shopMainList = response.body()
                // 변경8
                Log.d("lsy","shopMainList 값 : ${shopMainList?.items?.content}")

                // 데이터를 성공적으로 받았다면, 여기서 리사이클러 뷰 어댑터에 연결하면 됨.
                // 리사이클러뷰 의 레이아웃 정하는 부분, 기본인 LinearLayoutManager 이용했고,

                // 기본 값으로 세로 방향 출력.
//        binding.recyclerView.layoutManager = LinearLayoutManager(this)
                // 가로 방향으로 출력 해보기.
                layoutManager = LinearLayoutManager(this@PagingTestActivity)
//        layoutManager.orientation = LinearLayoutManager.HORIZONTAL
                binding.pagingRecyclerView.layoutManager = layoutManager

                // 액티비티 -> 리사이클러뷰 -> 실제 데이터를 연결하는 부분. 중요함.!!!!!!!!!!!!
                binding.pagingRecyclerView.adapter = shopMainList?.items?.content?.let {
                    PagingRecyclerAdapter(
                        it
                    )
                }
                // 구분선 넣기, 나중에 옵션으로 배경이미지도 넣기 가능.
                binding.pagingRecyclerView.addItemDecoration(
                    DividerItemDecoration(this@PagingTestActivity,
                        LinearLayoutManager.VERTICAL)
                )

            }

            //변경5
            override fun onFailure(call: Call<ItemListModel>, t: Throwable) {
                Log.d("lsy"," 통신실패")
                // 데이터를 못 받았을 때 수행되는 함수
                call.cancel()
            }

        })

//        // 기본 값으로 세로 방향 출력.
////        binding.recyclerView.layoutManager = LinearLayoutManager(this)
//        // 가로 방향으로 출력 해보기.
//        val layoutManager = LinearLayoutManager(this)
////        layoutManager.orientation = LinearLayoutManager.HORIZONTAL
//        binding.pagingRecyclerView.layoutManager = layoutManager
//
//        // 액티비티 -> 리사이클러뷰 -> 실제 데이터를 연결하는 부분. 중요함.!!!!!!!!!!!!
//        binding.pagingRecyclerView.adapter = PagingRecyclerAdapter(datas)
//        // 구분선 넣기, 나중에 옵션으로 배경이미지도 넣기 가능.
//        binding.pagingRecyclerView.addItemDecoration(
//            DividerItemDecoration(this,
//                LinearLayoutManager.VERTICAL)
//        )

        // 로컬 , 임시 더미 데이터로 , 스크롤 리스너 테스트
        // 스프링, shop에서, main 부분 , 페이징으로 받아와서 추가하기.
        binding.pagingRecyclerView.addOnScrollListener(object : RecyclerView.OnScrollListener() {
            override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                super.onScrolled(recyclerView, dx, dy)

                val lastVisibleItemPosition =
                    layoutManager!!.findLastCompletelyVisibleItemPosition() // 화면에 보이는 마지막 아이템의 position
                val itemTotalCount =
                    recyclerView.adapter!!.itemCount - 1 // 어댑터에 등록된 아이템의 총 개수 -1
                // 스크롤이 끝에 도달했는지 확인
                if (lastVisibleItemPosition == itemTotalCount) {
//                        isLoading = true
                    Log.d("lsy", "스크롤 끝")
//                    pageNo += 1
//                    Log.d("lsy", "pageNO : ${pageNo}, numOfRows: ${numOfRows}")
//                    for(i in 1..10) {
//                        datas.add("라바 $i + $cnt")
//                        cnt++
//                    }
                    Log.d("lsy", "데이터 추가됨.")
                    // 로컬 데이터 추가.
//                    getData()

                    (binding.pagingRecyclerView.adapter as PagingRecyclerAdapter).notifyDataSetChanged()

                }
            }
        })



    } // onCreate
    // 샘플 더미 데이터
    fun getData() {
        for(i in 1..10) {
            datas.add("라바 $i + $cnt")
            cnt++
        }
    }

    fun getData2() {
        for(i in 1..10) {
            datas.add("라바 $i + $cnt")
            cnt++
        }
    }




}

//