package com.example.clothingstore.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.clothingstore.R
import com.example.clothingstore.databinding.DrawerBinding

class DrawerFragment : Fragment() {

    private lateinit var binding: DrawerBinding


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DrawerBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.cardMen.setOnClickListener {
            goingToCategoryFragment("men")
        }
        binding.cardWomen.setOnClickListener {
            goingToCategoryFragment("women")
        }
        binding.cardJewelry.setOnClickListener {
            goingToCategoryFragment("jewelry")
        }
        binding.cardElectronics.setOnClickListener {
            goingToCategoryFragment("electronics")
        }

    }

    private fun goingToCategoryFragment(name: String){
        val newFragment = CategoriesFragment()
        val transaction = parentFragmentManager.beginTransaction()
        transaction.replace(R.id.fragmentContainer, newFragment)
        transaction.addToBackStack(name)
        transaction.commit()
    }




}