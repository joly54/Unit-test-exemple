package com.fivesysdev.unit_test_exemple.Retrofit

import com.fivesysdev.unit_test_exemple.Day
import retrofit2.http.GET

interface ApiService {
    @GET("jEPaXtNY")
    suspend fun getSchedule(): List<Day>
}