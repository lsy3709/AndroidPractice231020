package com.example.myapp_test_7_8_9_10_11_12.ch11_12_Test

import android.content.Context.MODE_PRIVATE
import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.myapp_test_7_8_9_10_11_12.R
import com.example.myapp_test_7_8_9_10_11_12.databinding.FragmentOneBinding


class OneFragment : Fragment() {
    // 베이스 액티비티에 위에 출력이 되는 조각(프래그먼트)
    // 기본1
    lateinit var binding : FragmentOneBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("lsy","생명주기,onCreate ")
    }

    override fun onStart() {
        super.onStart()
        Log.d("lsy","생명주기,onStart ")
    }
    override fun onResume() {
        super.onResume()
        Log.d("lsy","생명주기,onResume ")
    }

    override fun onPause() {
        super.onPause()
        Log.d("lsy","생명주기,onPause ")
    }

    override fun onStop() {
        super.onStop()
        Log.d("lsy","생명주기,onStop ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("lsy","생명주기 onDestroy, ")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //기본2
        binding = FragmentOneBinding.inflate(layoutInflater,container,false)
//        return inflater.inflate(R.layout.fragment_one, container, false)
        binding.FragBtn.setOnClickListener {
            Toast.makeText(context,"메세지 확인",Toast.LENGTH_SHORT).show()
            val pref: SharedPreferences = requireContext().getSharedPreferences("test1234", MODE_PRIVATE)
            val editor = pref.edit()
            editor.putString("test1", "test1")
            editor.putString("test2", "test2")
            editor.putString("test3", "test3")
            editor.commit()
        }
binding.FragBt2.setOnClickListener {
    val resultView = activity?.findViewById<TextView>(R.id.fragResult1)
    if (resultView != null) {
        resultView.text = "sample"
    }
}

        // 기본3
        return binding.root
    }

}