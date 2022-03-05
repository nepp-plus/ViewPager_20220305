package com.neppplus.viewpager_20220305.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.neppplus.viewpager_20220305.fragments.HelloFragment
import com.neppplus.viewpager_20220305.fragments.MyInfoFragment
import com.neppplus.viewpager_20220305.fragments.MyNameFragment

class MainViewPagerAdapter(fm : FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getPageTitle(position: Int): CharSequence? {

        if (position == 0) {
            return "이름"
        }
        else if (position == 1) {
            return "내 정보"
        }
        else {
            return "인사말"
        }

    }

    override fun getCount(): Int {

        return 3

    }

    override fun getItem(position: Int): Fragment {

        return when(position) {
            0 -> MyNameFragment()
            1 -> MyInfoFragment()
            else -> HelloFragment()
        }

    }
}