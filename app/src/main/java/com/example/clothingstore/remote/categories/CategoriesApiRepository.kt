package com.example.clothingstore.remote.categories

import com.example.clothingstore.remote.RetrofitService
import com.example.clothingstore.remote.dataModel.categories.CategoryModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class CategoriesApiRepository private constructor(){

     companion object {
         private var apiRepository: CategoriesApiRepository? = null

         val instance: CategoriesApiRepository
             get(){
                 if (apiRepository == null) apiRepository = CategoriesApiRepository()
                 return apiRepository!!
             }
     }

    fun getJewelry(
        categoryRequest: CategoryRequest
    ){
        RetrofitService.jewelryApiService.getCategories().enqueue(object : Callback<CategoryModel> {
            override fun onResponse(call: Call<CategoryModel>, response: Response<CategoryModel>) {
                if (response.isSuccessful){
                    val data = response.body() as CategoryModel
                    categoryRequest.onSuccess(data)
                } else {
                    categoryRequest.onNotSuccess("Not Successful")
                }
            }

            override fun onFailure(call: Call<CategoryModel>, t: Throwable) {
                categoryRequest.onError("Error: ${t.message}")
            }

        })
    }

    fun getElectronics(
        categoryRequest: CategoryRequest
    ){
        RetrofitService.electronicsApiService.getCategories().enqueue(object : Callback<CategoryModel> {
            override fun onResponse(call: Call<CategoryModel>, response: Response<CategoryModel>) {
                if (response.isSuccessful){
                    val data = response.body() as CategoryModel
                    categoryRequest.onSuccess(data)
                } else {
                    categoryRequest.onNotSuccess("Not Successful")
                }
            }

            override fun onFailure(call: Call<CategoryModel>, t: Throwable) {
                categoryRequest.onError("Error: ${t.message}")
            }

        })
    }

    fun getMen(
        categoryRequest: CategoryRequest
    ){
        RetrofitService.menApiService.getCategories().enqueue(object : Callback<CategoryModel> {
            override fun onResponse(call: Call<CategoryModel>, response: Response<CategoryModel>) {
                if (response.isSuccessful){
                    val data = response.body() as CategoryModel
                    categoryRequest.onSuccess(data)
                } else {
                    categoryRequest.onNotSuccess("Not Successful")
                }
            }

            override fun onFailure(call: Call<CategoryModel>, t: Throwable) {
                categoryRequest.onError("Error: ${t.message}")
            }

        })
    }

    fun getWomen(
        categoryRequest: CategoryRequest
    ){
        RetrofitService.womenApiService.getCategories().enqueue(object : Callback<CategoryModel> {
            override fun onResponse(call: Call<CategoryModel>, response: Response<CategoryModel>) {
                if (response.isSuccessful){
                    val data = response.body() as CategoryModel
                    categoryRequest.onSuccess(data)
                } else {
                    categoryRequest.onNotSuccess("Not Successful")
                }
            }

            override fun onFailure(call: Call<CategoryModel>, t: Throwable) {
                categoryRequest.onError("Error: ${t.message}")
            }

        })
    }


}