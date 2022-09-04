package com.patika.navigationback

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.patika.navigationback.databinding.FragmentBBinding

class BFragment : Fragment() {

    private lateinit var fragmentBBinding: FragmentBBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        fragmentBBinding = FragmentBBinding.inflate(inflater)
        return fragmentBBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fragmentBBinding.apply {
            bbuttonback.setOnClickListener {
                findNavController().navigateUp()
            }
            bbuttonnext.setOnClickListener {
                findNavController().navigate(R.id.CFragment)
            }
        }

    }


}