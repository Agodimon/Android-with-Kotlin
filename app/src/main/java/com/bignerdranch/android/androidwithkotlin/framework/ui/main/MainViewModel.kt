package com.bignerdranch.android.androidwithkotlin.framework.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.bignerdranch.android.androidwithkotlin.AppState
import java.lang.Thread.sleep

class MainViewModel : ViewModel() {
    private val liveDataToObserve:MutableLiveData<AppState> = MutableLiveData()

    fun getLiveData()=liveDataToObserve

    fun getWeather()=getDataFromLocalSource()

    private fun getDataFromLocalSource(){
        liveDataToObserve.value=AppState.Loading
        Thread{
            sleep(1000)
            liveDataToObserve.postValue(AppState.Success(Any()))
        }.start()
    }

}