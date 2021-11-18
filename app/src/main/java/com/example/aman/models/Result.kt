package com.example.aman.models

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize
import kotlinx.android.parcel.RawValue

@Parcelize
data class Result(
    @SerializedName("idMeal")
    val recipeId: Int,
    @SerializedName("strMeal")
    val mealName: String,
    @SerializedName("strCategory")
    val strCategory : String,
    @SerializedName("strYoutube")
    val readyInMinutes: String,
    @SerializedName("strInstructions")
    val instructions: String?,
    @SerializedName("strSource")
    var source:String,
    @SerializedName("strMealThumb")
    var thumbNail:String?="https://www.themealdb.com/images/media/meals/xqwwpy1483908697.jpg",
    var isFav:Boolean?=false

): Parcelable

/**
"strArea": "British",
"strInstructions": "Grease a 1 litre/2 pint pie dish with butter.\r\nCut the crusts off the bread. Spread each slice with on one side with butter, then cut into triangles.\r\nArrange a layer of bread, buttered-side up, in the bottom of the dish, then add a layer of sultanas. Sprinkle with a little cinnamon, then repeat the layers of bread and sultanas, sprinkling with cinnamon, until you have used up all of the bread. Finish with a layer of bread, then set aside.\r\nGently warm the milk and cream in a pan over a low heat to scalding point. Don't let it boil.\r\nCrack the eggs into a bowl, add three quarters of the sugar and lightly whisk until pale.\r\nAdd the warm milk and cream mixture and stir well, then strain the custard into a bowl.\r\nPour the custard over the prepared bread layers and sprinkle with nutmeg and the remaining sugar and leave to stand for 30 minutes.\r\nPreheat the oven to 180C/355F/Gas 4.\r\nPlace the dish into the oven and bake for 30-40 minutes, or until the custard has set and the top is golden-brown.",
"strMealThumb": "https://www.themealdb.com/images/media/meals/xqwwpy1483908697.jpg",
"strTags": "Pudding,Brunch",
"strYoutube": "https://www.youtube.com/watch?v=Vz5W1-BmOE4",
"strIngredient1": "butter",
"strIngredient2": "bread",
"strIngredient3": "sultanas",
"strIngredient4": "cinnamon",
"strIngredient5": "milk",
"strIngredient6": "double cream",
"strIngredient7": "eggs",
"strIngredient8": "sugar",
"strIngredient9": "nutmeg",
"strIngredient10": "",
"strIngredient11": "",
"strIngredient12": "",
"strIngredient13": "",
"strIngredient14": "",
"strIngredient15": "",
"strIngredient16": "",
"strIngredient17": "",
"strIngredient18": "",
"strIngredient19": "",
"strIngredient20": "",
"strMeasure1": "25g/1oz",
"strMeasure2": "8 thin slices",
"strMeasure3": "50g/2oz",
"strMeasure4": "2 tsp",
"strMeasure5": "350ml/12fl",
"strMeasure6": "50ml/2fl oz",
"strMeasure7": "2 free-range",
"strMeasure8": "25g/1oz",
"strMeasure9": "grated, to taste",
"strMeasure10": "",
"strMeasure11": "",
"strMeasure12": "",
"strMeasure13": "",
"strMeasure14": "",
"strMeasure15": "",
"strMeasure16": "",
"strMeasure17": "",
"strMeasure18": "",
"strMeasure19": "",
"strMeasure20": "",
"strSource": "https://cooking.nytimes.com/recipes/1018529-coq-au-vin",
"strImageSource": null,
"strCreativeCommonsConfirmed": null,
"dateModified": null
        */