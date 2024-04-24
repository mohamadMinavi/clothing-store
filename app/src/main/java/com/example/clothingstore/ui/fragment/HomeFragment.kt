package com.example.clothingstore.ui.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.clothingstore.adapter.recyclerView.ProductsRecyclerAdapter
import com.example.clothingstore.databinding.HomeBinding
import com.example.clothingstore.remote.clothes.ClothesApiRepository
import com.example.clothingstore.remote.clothes.ClothesRequest
import com.example.clothingstore.remote.dataModel.allProducts.ProductsModel
import com.example.clothingstore.remote.dataModel.allProducts.ProductsModelItem

class HomeFragment() : Fragment() {

    private lateinit var binding: HomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = HomeBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        getDataFromServer()
    }


    private fun getDataFromServer(){

        ClothesApiRepository.instance.getClothes(
            object : ClothesRequest {

                override fun onSuccess(data: ProductsModel) {

                    binding.recyclerView.adapter = ProductsRecyclerAdapter(data)
                    binding.recyclerView.layoutManager = GridLayoutManager(
                        requireContext(),
                        2,
                        RecyclerView.VERTICAL,
                        false
                    )
                }

                override fun onNotSuccess(message: String) {
                    Log.i("NOT_SUCCESS", message)
                }

                override fun onError(error: String) {
                    Log.i("CONNECTION_ERROR", error)
                }

            }
        )
    }

}