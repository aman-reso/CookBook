package com.example.aman.data.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.aman.models.Result
import com.example.aman.util.Constants.Companion.FAVORITE_RECIPES_TABLE

@Entity(tableName = FAVORITE_RECIPES_TABLE)
class FavoritesEntity(
    @PrimaryKey(autoGenerate = true)
    var id: Int=0,
    var result: Result,
    var serverId:Int?=-1
)