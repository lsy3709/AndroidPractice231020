package com.example.myapp_test_11_homework.ch11.viewPager.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.myapp_test_11_homework.R
import com.example.myapp_test_11_homework.databinding.FragmentSampleFrag1Binding
import com.example.myapp_test_11_homework.databinding.FragmentSampleFrag3Binding

class SampleFrag3 : Fragment() {
    lateinit var binding : FragmentSampleFrag3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentSampleFrag3Binding.inflate(layoutInflater)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSampleFrag3Binding.inflate(layoutInflater)
        return binding.root
    }
}