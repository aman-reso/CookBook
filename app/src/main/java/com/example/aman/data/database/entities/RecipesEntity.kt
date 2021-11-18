package com.example.aman.data.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.aman.models.FoodRecipe
import com.example.aman.util.Constants.Companion.RECIPES_TABLE

@Entity(tableName = RECIPES_TABLE)
class RecipesEntity(
    var foodRecipe: FoodRecipe
) {
    @PrimaryKey(autoGenerate = false)
    var id: Int = 0
}