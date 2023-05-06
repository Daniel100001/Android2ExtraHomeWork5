package com.example.android2homework2.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.android2homework2.R
import com.example.android2homework2.databinding.ActivityMainBinding
import com.example.android2homework2.utils.PreferenceHelper

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initialize()

    }

    private fun initialize() {
        val preferenceHelper = PreferenceHelper()
        preferenceHelper.unit(this)
        val check = preferenceHelper.saveBoolean

        if (check == false) {
            val navController = findNavController(binding.navHostFragment.id)
            val navGraph = navController.navInflater.inflate(R.navigation.nav_graph)
            navGraph.setStartDestination(R.id.onBoardFragment)
            navController.graph = navGraph
        }
    }
}