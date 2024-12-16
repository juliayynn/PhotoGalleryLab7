package com.example.laba_7.api

package api

import retrofit2.Call
import retrofit2.http.GET

interface FlickrApi {
    @GET("/")
    fun fetchContents(): Call<String>
}