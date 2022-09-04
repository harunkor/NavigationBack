package com.patika.navigationback

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.patika.navigationback.databinding.FragmentCBinding


class CFragment : Fragment() {

    private lateinit var fragmentCBinding: FragmentCBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        fragmentCBinding = FragmentCBinding.inflate(inflater)
        return fragmentCBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        fragmentCBinding.apply {
            cbuttonback.setOnClickListener {
                findNavController().navigateUp()
            }

            cbuttonnext.setOnClickListener {
                findNavController().navigate(R.id.action_CFragment_to_home_nav_graph)

            }

        }


    }

}