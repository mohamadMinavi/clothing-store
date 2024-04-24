package com.example.clothingstore.mvp.view

import android.content.Context
import android.view.LayoutInflater
import com.example.clothingstore.databinding.ActivityMainBinding
import com.example.clothingstore.mvp.ext.ActivityUtils
import com.example.clothingstore.ui.fragment.HomeFragment

class ViewMainActivity(
    private val context: Context,
    private val utils: ActivityUtils
) {

    val binding = ActivityMainBinding.inflate(LayoutInflater.from(context))

    fun setUpFragments(){
        utils.setFragment(binding)
    }


}