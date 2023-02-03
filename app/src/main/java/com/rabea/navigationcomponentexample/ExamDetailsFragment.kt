package com.rabea.navigationcomponentexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.rabea.navigationcomponentexample.databinding.FragmentExamDetailsBinding


class ExamDetailsFragment : Fragment() {

//    var scoreBangle = 0
//    var scoreEnglish = 0
//    var scoreMath = 0
    private lateinit var scores: Scores

    lateinit var binding: FragmentExamDetailsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_exam_details, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // show example of data Binding

        scores = ExamDetailsFragmentArgs.fromBundle(requireArguments()).scores
//        scoreBangle = ExamDetailsFragmentArgs.fromBundle(requireArguments()).bScore
//        scoreEnglish = ExamDetailsFragmentArgs.fromBundle(requireArguments()).eScore
//        scoreMath = ExamDetailsFragmentArgs.fromBundle(requireArguments()).mScore

//        binding.tvBangleScore.text = scoreBangle.toString()
//        binding.tvEnglishScore.text = scoreEnglish.toString()
//        binding.tvMathScore.text = scoreMath.toString()
        /*binding.tvBangleScore.text = scores.bScore.toString()
        binding.tvBangleScore.text = scores.eScore.toString()
        binding.tvBangleScore.text = scores.mScore.toString()*/
        binding.scores = scores

    }

}