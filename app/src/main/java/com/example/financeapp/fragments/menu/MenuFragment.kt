package com.example.financeapp.fragments.menu

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.financeapp.R
import com.example.financeapp.databinding.FragmentMenuBinding

class MenuFragment : Fragment() {

    private lateinit var binding: FragmentMenuBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMenuBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        clickTracking()
    }

    private fun clickTracking() {
        with(binding) {
            btnExit.setOnClickListener {
                requireActivity().finish()
            }
            btnFinancialBook.setOnClickListener {
                switchFragment(R.id.action_menuFragment_to_financialBookFragment)
            }
            btnQuiz.setOnClickListener {
                switchFragment(R.id.action_menuFragment_to_quizFragment)
            }
            btnSettings.setOnClickListener {
                switchFragment(R.id.action_menuFragment_to_settingsFragment)
            }
            btnAbout.setOnClickListener {
                switchFragment(R.id.action_menuFragment_to_aboutFragment)
            }
        }
    }

    private fun switchFragment(fm: Int) {
        findNavController().navigate(fm)
    }
}