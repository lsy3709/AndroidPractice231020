package com.example.myapp_test_7_8_9_10_11_12.ch11_Test

import android.os.Bundle
import android.util.Log
import android.view.Menu
import androidx.appcompat.app.AppCompatActivity
import com.example.myapp_test_7_8_9_10_11_12.R
import com.example.myapp_test_7_8_9_10_11_12.databinding.ActivityTest11ActionBarBinding

class Test11_ActionBarActivity : AppCompatActivity() {
    //기본1
    lateinit var binding : ActivityTest11ActionBarBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //기본2
        binding = ActivityTest11ActionBarBinding.inflate(layoutInflater)
        //기본3
        setContentView(binding.root)

        //액션바에 업버튼 붙이기
        supportActionBar?.setDisplayHomeAsUpEnabled(true)





    }

    // 액션바 클릭 이벤트 처리.
    override fun onSupportNavigateUp(): Boolean {
        Log.d("lsy","test")
        onBackPressed()
        return super.onSupportNavigateUp()
    }

    // 액션바에 오버플로우 메뉴 붙이기
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main,menu)
        return super.onCreateOptionsMenu(menu)
    }

}