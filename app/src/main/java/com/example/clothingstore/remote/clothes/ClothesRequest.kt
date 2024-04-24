package com.example.clothingstore.remote.clothes

import com.example.clothingstore.remote.dataModel.allProducts.ProductsModel

interface ClothesRequest {

    fun onSuccess(data: ProductsModel)

    fun onNotSuccess(message: String)

    fun onError(error: String)

}