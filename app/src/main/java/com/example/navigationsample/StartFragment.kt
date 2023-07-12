package com.example.navigationsample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navigationsample.databinding.FragmentStartBinding

class StartFragment : Fragment() {
    private lateinit var binding: FragmentStartBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentStartBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.pathOfCatButton.setOnClickListener {
            findNavController().navigate(
                R.id.action_startFragment_to_factFragment,
                FactFragment.createArgs(getString(R.string.cat_fact), 0)
            )
        }

        binding.pathOfHamsterButton.setOnClickListener {
            findNavController().navigate(
                R.id.action_startFragment_to_factFragment,
                FactFragment.createArgs(getString(R.string.hamster_fact), 1)
            )
        }
    }
}