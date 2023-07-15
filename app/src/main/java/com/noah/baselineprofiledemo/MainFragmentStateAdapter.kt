package com.noah.baselineprofiledemo

import android.app.Activity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.noah.baselineprofiledemo.ui.dashboard.DashboardFragment
import com.noah.baselineprofiledemo.ui.home.HomeFragment
import com.noah.baselineprofiledemo.ui.home.HomeNewsFragment

class MainFragmentStateAdapter(activity: FragmentActivity): FragmentStateAdapter(activity) {

    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        if (position == 0) {
            return HomeFragment()
        } else {
            return DashboardFragment()
        }
    }

}