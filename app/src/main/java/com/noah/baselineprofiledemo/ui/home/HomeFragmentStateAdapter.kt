package com.noah.baselineprofiledemo.ui.home

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class HomeFragmentStateAdapter(fragment: HomeFragment): FragmentStateAdapter(fragment) {

    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return HomeNewsFragment()
    }

}