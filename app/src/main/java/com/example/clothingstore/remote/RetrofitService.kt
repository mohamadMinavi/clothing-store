package com.example.clothingstore.remote

import com.example.clothingstore.remote.categories.ElectronicsApiService
import com.example.clothingstore.remote.categories.JeweleryApiService
import com.example.clothingstore.remote.categories.MenApiService
import com.example.clothingstore.remote.categories.WomenApiService
import com.example.clothingstore.remote.clothes.ClothesApiService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitService {

    private const val url = "https://fakestoreapi.com/"

    private val retrofit = Retrofit.Builder()
        .baseUrl(url)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val apiService: ClothesApiService = retrofit.create(ClothesApiService::class.java)
    val jewelryApiService: JeweleryApiService = retrofit.create(JeweleryApiService::class.java)
    val electronicsApiService: ElectronicsApiService = retrofit.create(ElectronicsApiService::class.java)
    val menApiService: MenApiService = retrofit.create(MenApiService::class.java)
    val womenApiService: WomenApiService = retrofit.create(WomenApiService::class.java)

}