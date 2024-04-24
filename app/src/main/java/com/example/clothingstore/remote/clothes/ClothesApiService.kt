package com.example.clothingstore.remote.clothes

import com.example.clothingstore.remote.dataModel.allProducts.ProductsModel
import retrofit2.Call
import retrofit2.http.GET

interface ClothesApiService {
    @GET("products")
    fun getClothes() : Call<ProductsModel>
}