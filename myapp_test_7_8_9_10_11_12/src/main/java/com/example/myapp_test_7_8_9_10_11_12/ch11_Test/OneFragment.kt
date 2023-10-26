package com.example.myapp_test_7_8_9_10_11_12.ch11_Test

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.myapp_test_7_8_9_10_11_12.databinding.FragmentOneBinding

class OneFragment : Fragment() {
    // 베이스 액티비티에 위에 출력이 되는 조각(프래그먼트)
    // 기본1
    lateinit var binding : FragmentOneBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //기본2
        binding = FragmentOneBinding.inflate(layoutInflater,container,false)
//        return inflater.inflate(R.layout.fragment_one, container, false)
        // 기본3
        return binding.root
    }

}