package com.example.aman.data

import com.example.aman.data.network.FoodRecipesApi
import com.example.aman.models.FoodRecipe
import com.example.aman.util.RandomNumberGen
import retrofit2.Response
import javax.inject.Inject

class RemoteDataSource @Inject constructor(
    private val foodRecipesApi: FoodRecipesApi
) {
    suspend fun getRecipes(): Response<FoodRecipe> {
        return foodRecipesApi.getRecipes(RandomNumberGen.generateRandomCharacter())
    }

    suspend fun searchRecipes(searchQuery: String): Response<FoodRecipe> {
        return foodRecipesApi.searchRecipes(searchQuery)
    }

}