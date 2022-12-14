package com.runningapp.app.runningapp.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.runningapp.app.runningapp.databinding.FragmentRunBinding

class RunFragment : Fragment() {

   private lateinit var binding:FragmentRunBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentRunBinding.inflate(inflater,container,false)

        return binding.root
    }

}