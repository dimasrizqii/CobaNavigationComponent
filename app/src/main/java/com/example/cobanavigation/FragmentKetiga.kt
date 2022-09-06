package com.example.cobanavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs
import com.example.cobanavigation.databinding.FragmentKetigaBinding

class FragmentKetiga : Fragment() {
    private var _binding: FragmentKetigaBinding? = null
    private val binding get() = _binding!!

    private val args : FragmentKetigaArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentKetigaBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (FragmentKetigaArgs.fromBundle(arguments as Bundle).name.isNullOrEmpty()){
            binding.tvNama2.text = "Menggunakan Bottom Navigation"
        } else {
            val aName = args.name
            binding.tvNama2.text = "Namamu : $aName"
        }

        binding.btnFragmentKedua2.setOnClickListener{
            val actionToFragmentKedua = FragmentKetigaDirections.actionFragmentKetigaToFragmentKedua3()
            view.findNavController().navigate(actionToFragmentKedua)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}