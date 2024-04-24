package com.example.clothingstore.mvp.presenter

import com.example.clothingstore.mvp.ext.BaseLifeCycle
import com.example.clothingstore.mvp.model.ModelMainActivity
import com.example.clothingstore.mvp.view.ViewMainActivity

class PresenterMainActivity(
    private val view: ViewMainActivity,
    private val model: ModelMainActivity
) : BaseLifeCycle {

    override fun onCreate() {
        prepareBottomNavigation()
    }

    private fun prepareBottomNavigation(){
        view.setUpFragments()
    }




}