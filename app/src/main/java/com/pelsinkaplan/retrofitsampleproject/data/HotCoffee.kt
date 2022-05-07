package com.pelsinkaplan.retrofitsampleproject.data

import com.google.gson.annotations.SerializedName

data class HotCoffee(
    @SerializedName("title")
    var coffeeName: String,
    @SerializedName("description")
    var coffeeDescription: String,
    @SerializedName("ingredients")
    var coffeeIngredients: List<String>,
    @SerializedName("id")
    var coffeeId: Int
)