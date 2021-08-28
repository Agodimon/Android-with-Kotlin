package com.bignerdranch.android.androidwithkotlin.model.repository

import com.bignerdranch.android.androidwithkotlin.model.WeatherLoader
import com.bignerdranch.android.androidwithkotlin.model.entities.City
import com.bignerdranch.android.androidwithkotlin.model.entities.Weather
import com.bignerdranch.android.androidwithkotlin.model.rest.WeatherRepo

class RepositoryImpl : Repository {
       override fun getWeatherFromServer(lat: Double, lng: Double): Weather {
        val dto = WeatherRepo.api.getWeather(lat, lng).execute().body()
        return Weather(
            temperature = dto?.fact?.temp ?: 0,
            feelsLike = dto?.fact?.feelsLike ?: 0,
            condition = dto?.fact?.condition
        )
    }

    override fun getWeatherFromLocalStorageRus() = City.getRussianCities()

    override fun getWeatherFromLocalStorageWorld() = City.getWorldCities()

}