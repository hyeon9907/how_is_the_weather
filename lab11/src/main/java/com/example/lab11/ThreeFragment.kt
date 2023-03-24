    package com.example.lab11

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.lab11.databinding.FragmentOneBinding
import com.example.lab11.databinding.FragmentThreeBinding

    class ThreeFragment : Fragment() {


        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            val binding = FragmentThreeBinding.inflate(inflater,container,false)
            return binding.root
        }
    }