package com.example.myapp_test_7_8_9_10_11_12.ch11_Test

import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
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

    // 오버플로우 메뉴 이벤트 핸들러 추가하기.
    override fun onOptionsItemSelected(item: MenuItem): Boolean = when(item.itemId) {
        0 -> {
            Toast.makeText(this@Test11_ActionBarActivity,"메뉴1 클릭됨",Toast.LENGTH_SHORT).show()
            true
        }

        1 -> {
            Toast.makeText(this@Test11_ActionBarActivity,"메뉴2 클릭됨",Toast.LENGTH_SHORT).show()
            true
        }

        2 -> {
            Toast.makeText(this@Test11_ActionBarActivity,"메뉴3 클릭됨",Toast.LENGTH_SHORT).show()
            true
        }
        // 람다식에서 return 사용 못함.
        else -> super.onOptionsItemSelected(item)
    }

}