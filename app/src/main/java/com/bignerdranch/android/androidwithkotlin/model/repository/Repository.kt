package com.bignerdranch.android.androidwithkotlin.model.repository

import com.bignerdranch.android.androidwithkotlin.model.entities.Weather

interface Repository {
    fun getWeatherFromServer(): Weather
    fun getWeatherFromLocalStorage(): Weather
}