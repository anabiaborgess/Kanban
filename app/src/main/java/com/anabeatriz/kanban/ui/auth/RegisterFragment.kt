package com.anabeatriz.kanban.ui.auth

import android.os.Bundle
import androidx.fragment.app.Fragment
import com.anabeatriz.kanban.databinding.FragmentRegisterBinding
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.anabeatriz.kanban.R


class RegisterFragment : Fragment() {

    private var _binding: FragmentRegisterBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentRegisterBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
    }
