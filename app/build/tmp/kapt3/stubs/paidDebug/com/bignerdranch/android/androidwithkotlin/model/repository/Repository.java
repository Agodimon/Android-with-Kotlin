package com.bignerdranch.android.androidwithkotlin.model.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH&J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0004H&\u00a8\u0006\u000e"}, d2 = {"Lcom/bignerdranch/android/androidwithkotlin/model/repository/Repository;", "", "getAllHistory", "", "Lcom/bignerdranch/android/androidwithkotlin/model/entities/Weather;", "getWeatherFromLocalStorageRus", "getWeatherFromLocalStorageWorld", "getWeatherFromServer", "lat", "", "lng", "saveEntity", "", "weather", "app_paidDebug"})
public abstract interface Repository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.bignerdranch.android.androidwithkotlin.model.entities.Weather getWeatherFromServer(double lat, double lng);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.bignerdranch.android.androidwithkotlin.model.entities.Weather> getWeatherFromLocalStorageRus();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.bignerdranch.android.androidwithkotlin.model.entities.Weather> getWeatherFromLocalStorageWorld();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.bignerdranch.android.androidwithkotlin.model.entities.Weather> getAllHistory();
    
    public abstract void saveEntity(@org.jetbrains.annotations.NotNull()
    com.bignerdranch.android.androidwithkotlin.model.entities.Weather weather);
}