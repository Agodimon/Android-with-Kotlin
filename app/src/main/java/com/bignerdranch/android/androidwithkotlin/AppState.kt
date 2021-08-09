package com.bignerdranch.android.androidwithkotlin

import androidx.lifecycle.LiveData

sealed class AppState{
    data class Success(val weatherData: Any):AppState()
    data class Error(val error:Throwable):AppState()
    object Loading:AppState()
}
