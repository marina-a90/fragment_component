package com.example.navigationcomponent

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_launcher.*

class FragmentLauncher : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_launcher, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button1.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentLauncher_to_fragment1)
        }

        button2.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentLauncher_to_fragment2)
        }

        button3.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentLauncher_to_fragment3)
        }
    }

}