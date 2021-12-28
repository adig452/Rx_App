package com.rx.rxapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.viewpager2.widget.ViewPager2

import com.google.android.material.tabs.TabLayout

import com.google.android.material.tabs.TabLayoutMediator


class HomeActivity : AppCompatActivity() {

    private var tabLayout: TabLayout? = null
    var viewPager: ViewPager2? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        tabLayout = findViewById(R.id.mainTabLayout)
        viewPager = findViewById(R.id.mainViewPager)

        tabLayout?.addTab(tabLayout!!.newTab().setText("My Mechanic"))
        tabLayout?.addTab(tabLayout!!.newTab().setText("2 & 4 wheeler for sale"))
        tabLayout?.addTab(tabLayout!!.newTab().setText("Sell your 2 & 4 wheeler"))
        tabLayout?.tabGravity = TabLayout.GRAVITY_FILL

        viewPager!!.adapter = createTabAdapter(tabLayout!!.tabCount)
        TabLayoutMediator(
            tabLayout!!, viewPager!!
        ) { tab, position ->
            if (position == 0) {
                tab.text = "My Mechanic"
            }
            if (position == 1) {
                tab.text = "2 & 4 wheeler for sale"
            }
            if (position == 2) {
                tab.text = "Sell your 2 & 4 wheeler"
            }
        }.attach()
    }

    private fun createTabAdapter(tabCount: Int): TabAdapter {
        return TabAdapter(this, tabCount)
    }
}