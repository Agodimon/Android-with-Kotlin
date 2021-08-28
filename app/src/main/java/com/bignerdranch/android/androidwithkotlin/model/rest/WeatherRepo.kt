package com.bignerdranch.android.androidwithkotlin.model.rest

import com.google.gson.Gson
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object WeatherRepo {
    val api: WeatherAPI by lazy {
    val adapter = Retrofit.Builder()
        .baseUrl(ApiUtils.baseUrl)
        .addConverterFactory(GsonConverterFactory.create())
        .client(ApiUtils.getOkHTTPBuilderWithHeaders())
        .build()

        adapter.create(WeatherAPI::class.java)
    }
}