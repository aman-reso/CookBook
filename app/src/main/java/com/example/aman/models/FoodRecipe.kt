package com.example.aman.models

import com.google.gson.annotations.SerializedName

data class FoodRecipe(
    @SerializedName("meals")
    val results: List<Result>
)