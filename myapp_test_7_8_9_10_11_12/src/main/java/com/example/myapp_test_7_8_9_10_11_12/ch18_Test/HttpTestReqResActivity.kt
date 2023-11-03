package com.example.myapp_test_7_8_9_10_11_12.ch18_Test

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapp_test_7_8_9_10_11_12.databinding.ActivityHttpTestReqResBinding

class HttpTestReqResActivity : AppCompatActivity() {
    lateinit var binding : ActivityHttpTestReqResBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHttpTestReqResBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // reqres.in : 외국에서 무료 REST 테스트 서버 제공해주는 곳.
        // 데이터를 받아서, 리사이클러 뷰에 출력 해보기.
        // 리사이클러뷰 준비물 1) 어댑터 2) 뷰홀더 3) 목록 요소의 뷰 4) 데이터

        // http 통신 준비물
        // 1) MyApplication 설정 파일 2) 인터페이스 3) 모델 또는 모델이 담겨진 리스트가 필요.

        // 준비작업 1) 모델 준비하기.
        // 2) 모델을 요소로 하는 리스트로 준비하기.
        // 주의사항.
//        https://reqres.in/api/users?page=2
//        {
//            "page": 2,
//            "per_page": 6,
//            "total": 12,
//            "total_pages": 2,
//            //이부분 중요한 포인터, 나중에, 공공데이터, 특정 api 받을 때,
//            // 키 : data  , 값 : 배열 [모델1,모델2,모델3,... ]
//            "data": [
//            { // 모델 : DTO, VO
//                "id": 7,
//                "email": "michael.lawson@reqres.in",
//                "first_name": "Michael",
//                "last_name": "Lawson",
//                "avatar": "https://reqres.in/img/faces/7-image.jpg"
//            },
//            {
//                "id": 8,
//                "email": "lindsay.ferguson@reqres.in",
//                "first_name": "Lindsay",
//                "last_name": "Ferguson",
//                "avatar": "https://reqres.in/img/faces/8-image.jpg"
//            },

        // 작업 순서2 : 네트워크 인터페이스 정의하기.

        // 작업 순서3 : MyApplication, baseurl 등록, 우리가 만든 인터페이스 연결.
        // 매니페스트 에 등록해서, 앱이 실행시, 선언 및 초기화 자동으로 되고,
        // 바로 사용만 하면 됨.

        // 작업 순서4: 일단, retrofit 통신 이용해서 데이터가 전달 유무 확인.

        // 작업 순서5 : 리사이클러뷰에 넣는 작업. , 재사용.




    }
    //onCreate

}