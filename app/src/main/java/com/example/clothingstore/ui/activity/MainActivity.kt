package com.example.clothingstore.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.clothingstore.R
import com.example.clothingstore.databinding.ActivityMainBinding
import com.example.clothingstore.mvp.ext.ActivityUtils
import com.example.clothingstore.mvp.model.ModelMainActivity
import com.example.clothingstore.mvp.presenter.PresenterMainActivity
import com.example.clothingstore.mvp.view.ViewMainActivity

class MainActivity() : AppCompatActivity(),ActivityUtils {

    private lateinit var presenter: PresenterMainActivity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val view = ViewMainActivity(this,this)
        setContentView(view.binding.root)

        val model = ModelMainActivity(this)

        presenter = PresenterMainActivity(view, model)
        presenter.onCreate()


    }



    override fun setFragment(binding: ActivityMainBinding) {
        val navHost = supportFragmentManager.findFragmentById(R.id.fragmentContainer) as NavHostFragment
        binding.bottomNav.setupWithNavController(navHost.navController)
    }

}