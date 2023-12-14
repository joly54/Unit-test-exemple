package com.fivesysdev.unit_test_exemple.Retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient  {
    val retrofit: Retrofit by lazy {
        Retrofit.Builder()
            .baseUrl("https://pastebin.com/raw/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    val apiService: ApiService by lazy {
        retrofit.create(ApiService::class.java)
    }
}