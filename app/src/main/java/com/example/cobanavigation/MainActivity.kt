package com.example.cobanavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.cobanavigation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var _binding : ActivityMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.navHost) as NavHostFragment

        val navController = navHostFragment.navController

        binding.bottomNavigationView.setupWithNavController(navController)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}