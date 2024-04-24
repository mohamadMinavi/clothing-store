package com.example.clothingstore.remote.clothes

import com.example.clothingstore.remote.RetrofitService
import com.example.clothingstore.remote.dataModel.allProducts.ProductsModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ClothesApiRepository private constructor(){

     companion object {
         private var apiRepository: ClothesApiRepository? = null

         val instance: ClothesApiRepository
             get(){
                 if (apiRepository == null) apiRepository = ClothesApiRepository()
                 return apiRepository!!
             }
     }

    fun getClothes(
        clothesRequest: ClothesRequest
    ){
        RetrofitService.apiService.getClothes().enqueue(object : Callback<ProductsModel> {
            override fun onResponse(call: Call<ProductsModel>, response: Response<ProductsModel>) {
                if (response.isSuccessful){
                    val data = response.body() as ProductsModel
                    clothesRequest.onSuccess(data)
                } else {
                    clothesRequest.onNotSuccess("Not Successful")
                }
            }

            override fun onFailure(call: Call<ProductsModel>, t: Throwable) {
                clothesRequest.onError("Error: ${t.message}")
            }

        })
    }

}