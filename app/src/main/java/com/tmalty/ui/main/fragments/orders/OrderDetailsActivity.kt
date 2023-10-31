package com.tmalty.ui.main.fragments.orders

import android.os.Bundle
import com.tmalty.base.BaseActivity
import com.tmalty.databinding.ActivityOrderDetailsBinding

class OrderDetailsActivity : BaseActivity() {

    // Declare view and objects
    lateinit var binding: ActivityOrderDetailsBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOrderDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupActivity()
    }

    //Entry point to this activity
    private fun setupActivity() {
        setupUI()
        setupListeners()
    }

    // Set up the UI components
    private fun setupUI() {
        // Set up any UI-related configurations here
    }


    // Set up event listeners for button clicks and other interactions
    private fun setupListeners() {
        binding.toolbar.back.setOnClickListener {
            finish()
        }
    }
}