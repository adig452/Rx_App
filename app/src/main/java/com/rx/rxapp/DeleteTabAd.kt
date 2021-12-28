package com.rx.rxapp

import android.content.Context
import android.util.Log
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class DeleteTabAd(context: Context, fm: FragmentManager, totalTabs: Int) : FragmentPagerAdapter(fm) {

    private var myContext: Context? = null
    var totalTabs = 0

    override fun getCount(): Int {
        return totalTabs
    }

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                Log.d("TEST", "$position")
                HomeFragment()
            }
            1 -> {
                Log.d("TEST", "$position")
                SecondFragment()
            }
            2 -> {
                Log.d("TEST", "$position")
                HomeFragment()
            }
            else -> HomeFragment()
        }
    }
}