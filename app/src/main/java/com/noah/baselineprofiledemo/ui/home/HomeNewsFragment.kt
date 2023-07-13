package com.noah.baselineprofiledemo.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.noah.baselineprofiledemo.databinding.FragmentHomeNewsBinding

class HomeNewsFragment : Fragment() {

    private var _binding: FragmentHomeNewsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    val vm by lazy { ViewModelProvider(this).get(HomeViewModel::class.java) }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeNewsBinding.inflate(inflater, container, false)
        initView()
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun initView() {
        val layoutManager = LinearLayoutManager(this.context)
        val list = vm.getNewsInfo()
        val adapter = NewsAdapter(list)
        binding.rv.layoutManager = layoutManager
        binding.rv.adapter = adapter
    }
}