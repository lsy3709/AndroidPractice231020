package com.example.myapp_test_11_homework.ch11.viewPager.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.myapp_test_11_homework.ch11.viewPager.fragment.SampleFrag1
import com.example.myapp_test_11_homework.ch11.viewPager.fragment.SampleFrag2
import com.example.myapp_test_11_homework.ch11.viewPager.fragment.SampleFrag3

class MyFragmentPagerAdapter(fragmentActivity: FragmentActivity): FragmentStateAdapter(fragmentActivity) {

    var sampleFragment : List<Fragment>
    init {
        //SampleFrag1 ~ 3-> 만들 예정.
        sampleFragment = listOf(SampleFrag1(), SampleFrag2(), SampleFrag3())
    }
    override fun getItemCount(): Int = sampleFragment.size

    override fun createFragment(position: Int): Fragment {
        val returnFrament : Fragment = sampleFragment[position]
        return  returnFrament
    }

}