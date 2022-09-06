package com.example.cobanavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.cobanavigation.databinding.FragmentPertamaBinding

class FragmentPertama : Fragment() {
    private var _binding : FragmentPertamaBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentPertamaBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnFragmentKedua.setOnClickListener{
            val mBundle = Bundle()
            mBundle.putString(EXTRA_NAME, "Dimas Rizqi")
            it.findNavController().navigate(R.id.action_fragmentPertama_to_fragmentKedua, mBundle)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    companion object{
        const val EXTRA_NAME = "EXTRA_NAME"
    }

}