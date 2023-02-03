package com.rabea.navigationcomponentexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.rabea.navigationcomponentexample.databinding.FragmentExamBinding


class ExamFragment : Fragment() {

    private lateinit var binding: FragmentExamBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_exam, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnExamDetails1.setOnClickListener {
            findNavController().navigate(ExamFragmentDirections.actionExamFragmentToExamDetailsFragment(Scores(54,65,34)))
        }

        binding.btnExamDetails2.setOnClickListener {
            findNavController().navigate(ExamFragmentDirections.actionExamFragmentToExamDetailsFragment(Scores(86,56,97)))
        }

    }

}