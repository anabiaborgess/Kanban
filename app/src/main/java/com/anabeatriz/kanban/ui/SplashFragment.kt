package com.anabeatriz.kanban.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import com.anabeatriz.kanban.databinding.FragmentSplashBinding
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.anabeatriz.kanban.R
import android.os.Handler
import android.os.Looper
import androidx.navigation.fragment.findNavController


class SplashFragment : Fragment() {

    private var _binding: FragmentSplashBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSplashBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Handler(Looper.getMainLooper()).postDelayed({checkAuth()}, 3000)
    }

    private fun checkAuth() {
        findNavController().navigate(R.id.action_splashFragment_to_authentication)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

