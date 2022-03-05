package com.neppplus.viewpager_20220305.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.neppplus.viewpager_20220305.fragments.HelloFragment
import com.neppplus.viewpager_20220305.fragments.MyInfoFragment
import com.neppplus.viewpager_20220305.fragments.MyNameFragment

class MainViewPagerAdapter(fm : FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getPageTitle(position: Int): CharSequence? {

        return when(position) {
            0 -> "이름"
            1 -> "내 정보"
            else -> "인사말"
        }

    }

    override fun getCount() = 3

    override fun getItem(position: Int): Fragment {

        return when(position) {
            0 -> MyNameFragment()
            1 -> MyInfoFragment()
            else -> HelloFragment()
        }

    }
}