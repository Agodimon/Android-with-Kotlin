package com.bignerdranch.android.androidwithkotlin.model.repository

import com.bignerdranch.android.androidwithkotlin.model.entities.Weather

class RepositoryImpl : Repository {
    override fun getWeatherFromServer()= Weather()

    override fun getWeatherFromLocalStorage()=Weather()
}