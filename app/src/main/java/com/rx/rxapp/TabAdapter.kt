package com.rx.rxapp

import android.util.Log
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class TabAdapter(fragmentActivity: FragmentActivity, var totalTabs: Int) : FragmentStateAdapter(fragmentActivity) {

    override fun getItemCount(): Int {
        Log.d("TEST", "getItemCount()")
        return totalTabs
    }

    override fun createFragment(position: Int): Fragment {
        Log.d("TEST", "called createFragment :: $position")

        return when (position) {
            0 -> {
                Log.d("TEST 0", "$position")
                HomeFragment()
            }
            1 -> {
                Log.d("TEST 1", "$position")
                SecondFragment()
            }
            2 -> {
                Log.d("TEST 2", "$position")
                HomeFragment()
            }
            else -> HomeFragment()
        }
    }
}
