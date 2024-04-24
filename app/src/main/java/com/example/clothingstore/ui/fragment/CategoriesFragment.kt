package com.example.clothingstore.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.clothingstore.databinding.CategoriesBinding

class CategoriesFragment : Fragment(){

    private lateinit var binding: CategoriesBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = CategoriesBinding.inflate(inflater)
        return binding.root
    }

    /*private fun getCategoriesFromServer(){
        CategoriesApiRepository.instance.getCategories(object : CategoriesRequest{
            override fun onSuccess(data: CategoriesModel) {
                val adapter = ListViewAdapter(requireContext(),data,imagesCategoriesArray)
                binding.listView.adapter = adapter
            }

            override fun onNotSuccess(message: String) {
                Log.i("NOT_SUCCESS", message)
            }

            override fun onError(error: String) {
                Log.i("CONNECTION_ERROR", error)
            }

        })
    }*/

}