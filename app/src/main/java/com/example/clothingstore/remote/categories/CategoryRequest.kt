package com.example.clothingstore.remote.categories

import com.example.clothingstore.remote.dataModel.categories.CategoryModel

interface CategoryRequest {

    fun onSuccess(data: CategoryModel)

    fun onNotSuccess(message: String)

    fun onError(error: String)

}