package com.example.clothingstore.remote.categories

import com.example.clothingstore.remote.dataModel.categories.CategoryModel
import retrofit2.Call
import retrofit2.http.GET

interface JeweleryApiService {
    @GET("products/category/jewelery")
    fun getCategories() : Call<CategoryModel>
}

interface ElectronicsApiService {
    @GET("products/category/electronics")
    fun getCategories() : Call<CategoryModel>
}

interface MenApiService {
    @GET("products/category/men's clothing")
    fun getCategories() : Call<CategoryModel>
}

interface WomenApiService {
    @GET("products/category/women's clothing")
    fun getCategories() : Call<CategoryModel>
}