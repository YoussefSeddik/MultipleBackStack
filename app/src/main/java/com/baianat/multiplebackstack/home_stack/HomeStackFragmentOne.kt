package com.baianat.multiplebackstack.home_stack

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.baianat.multiplebackstack.R
import com.baianat.multiplebackstack.Utils.replaceFragment


class HomeStackFragmentOne : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home_stack_one, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        requireView().findViewById<Button>(R.id.fragmentTwoButton).setOnClickListener {
            parentFragmentManager.replaceFragment(
                HomeStackFragmentTwo(),
                container = R.id.mainContainer,
                true
            )
        }
    }
}