package com.patika.navigationback

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.patika.navigationback.databinding.FragmentABinding


class AFragment : Fragment() {

    private lateinit var fragmentABinding: FragmentABinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        fragmentABinding = FragmentABinding.inflate(inflater)
        return fragmentABinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fragmentABinding.apply {
            button.setOnClickListener {
                findNavController().navigate(R.id.BFragment)
            }

            button2.setOnClickListener {
                findNavController().navigateUp()
            }
        }


    }


}