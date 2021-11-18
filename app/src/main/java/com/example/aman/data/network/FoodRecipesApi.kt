package com.example.aman.data.network

import com.example.aman.models.FoodRecipe
import com.example.aman.util.RandomNumberGen
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.http.QueryMap

interface FoodRecipesApi {

    @GET("/api/json/v1/1/search.php")
    suspend fun getRecipes(
        @Query("f")randomString:String
    ): Response<FoodRecipe>

    @GET("/api/json/v1/1/search.php")
    suspend fun searchRecipes(
        @Query("s")searchString: String?="Arrabiata"
    ): Response<FoodRecipe>

}