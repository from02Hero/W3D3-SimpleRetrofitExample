package com.example.w3d3_simpleretrofitexample

import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {
    @GET("photos")
    fun getPhotos(): Call<List<DataModel>>
}