package com.runningapp.app.runningapp.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.runningapp.app.runningapp.R
import com.runningapp.app.runningapp.databinding.FragmentTrackingBinding
import com.runningapp.app.runningapp.ui.viewModels.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class TrackingFragment : Fragment() {

    private val mainViewModel: MainViewModel by viewModels()



    private lateinit var  binding : FragmentTrackingBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentTrackingBinding.inflate(inflater,container,false);
        return binding.root
    }
}