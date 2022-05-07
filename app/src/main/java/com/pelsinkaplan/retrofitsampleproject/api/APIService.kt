package com.pelsinkaplan.retrofitsampleproject.api

import com.pelsinkaplan.retrofitsampleproject.data.HotCoffee
import retrofit2.Call
import retrofit2.http.GET

interface APIService {
    @GET("/coffee/hot")
    fun getRequest(): Call<List<HotCoffee>>
}