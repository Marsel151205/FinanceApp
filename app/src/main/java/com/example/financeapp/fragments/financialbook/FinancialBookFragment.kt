package com.example.financeapp.fragments.financialbook

import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.UnderlineSpan
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.financeapp.R
import com.example.financeapp.databinding.FragmentFinancialBookBinding

class FinancialBookFragment : Fragment() {

    private lateinit var binding: FragmentFinancialBookBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFinancialBookBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupView()
        clickTracking()
    }

    private fun clickTracking() {
        with(binding) {
            tvMore.setOnClickListener {
                if (rvStories.visibility == View.GONE) {
                    rvStories.visibility = View.VISIBLE
                } else rvStories.visibility = View.GONE
            }
            btnAdd.setOnClickListener {
                findNavController().navigate(R.id.action_financialBookFragment_to_addingCostsFragment)
            }
        }
    }

    private fun setupView() {
        val text = binding.tvMore.text
        val ss = SpannableString(text)
        ss.setSpan(UnderlineSpan(), 0, text.length, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        binding.tvMore.text = ss
    }
}