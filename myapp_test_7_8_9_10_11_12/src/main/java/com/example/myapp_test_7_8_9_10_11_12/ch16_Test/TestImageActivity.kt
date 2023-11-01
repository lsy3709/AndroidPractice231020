package com.example.myapp_test_7_8_9_10_11_12.ch16_Test

import android.content.Intent
import android.os.Bundle
import android.provider.MediaStore
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import com.example.myapp_test_7_8_9_10_11_12.databinding.ActivityTestImageBinding

class TestImageActivity : AppCompatActivity() {
    // 갤러리, 카메라 앱 연동해서 데이터 가져오기.
    lateinit var binding : ActivityTestImageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTestImageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //작업 구성 2가지.
        // 첫번째, 갤러리 앱을 호출 하는 작업
        // 두번째, 갤러리 앱에 데이터를 가져온 내용을 처리하는 작업.


        // 갤러리에서 선택 된 사진을 출력하는 뷰하나 생성.


        // 두번째, 갤러리 앱에 데이터를 가져온 내용을 처리하는 작업.
        val requestGalleryLauncher = registerForActivityResult(
            // 지금 정의하는 부분은 시스템에서 각 사용처 마다 정의가 다 되어 있고,
            // 골라서 사용할 예정. , 현재는 외부앱 에서 데이터 가져오는 역할부분을 이용할 예정.
            // StartActivityForResult -> 이부분 각각 다 정의가 되어 있다.
            ActivityResultContracts.StartActivityForResult()
        ) {
            // it 여기에, 갤러리에서 선택된 사진의 데이터가 들어 있음.
            // 위치가 들어 있다.
            //
        // 1) 불러온 사진을 적절히 크기를 조절해서, OOM(OutOf Memory) ,
        // 2) 바이트로 읽은 다음. ->
        // 3) 비트맵 타입으로 변환작업

        }

        // 버튼클릭시 : 갤러리 앱 호출,
        binding.galleryBtn.setOnClickListener {
            //갤러리 앱 호출, 인텐트의 액션 문자열을 사용함. 시스템꺼를 사용해서 정해진 문자열.
            // Intent.ACTION_PICK : 갤러리 호출
            // MediaStore.Images.Media.EXTERNAL_CONTENT_URI : 외부 저장소(갤러리)의 사진의 위치
            val intent = Intent(Intent.ACTION_PICK,MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
            // data type 지정.
            intent.type = "image/*"
            // 후처리 함수 호출 .-> 데이터 가져오기 위한 로직.
            // requestGalleryLauncher: 아직 후처리 함수 정의 안했음.
            requestGalleryLauncher.launch(intent)

        }

    }
}