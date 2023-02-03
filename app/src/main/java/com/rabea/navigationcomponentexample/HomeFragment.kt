package com.rabea.navigationcomponentexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.rabea.navigationcomponentexample.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_home,container,false)

//        return inflater.inflate(R.layout.fragment_home, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.cvStudy.setOnClickListener {
          //  findNavController().navigate(R.id.action_homeFragment_to_studyFragment)
            findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToStudyFragment())
        }

        binding.cvExam.setOnClickListener {
         //   findNavController().navigate(R.id.action_homeFragment_to_examFragment)
            findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToExamFragment())
        }

        binding.cvLibrary.setOnClickListener {
          //  findNavController().navigate(R.id.action_homeFragment_to_libraryFragment)
            findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToLibraryFragment())
        }

        binding.cvSupport.setOnClickListener {
          //  findNavController().navigate(R.id.action_homeFragment_to_supportFragment)
            findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToSupportFragment())
        }

    }

}