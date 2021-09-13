package com.bignerdranch.android.androidwithkotlin.model.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0002J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u0018\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\u0005H\u0016\u00a8\u0006\u0013"}, d2 = {"Lcom/bignerdranch/android/androidwithkotlin/model/repository/RepositoryImpl;", "Lcom/bignerdranch/android/androidwithkotlin/model/repository/Repository;", "()V", "convertHistoryEntityToWeather", "", "Lcom/bignerdranch/android/androidwithkotlin/model/entities/Weather;", "entityList", "Lcom/bignerdranch/android/androidwithkotlin/model/database/HistoryEntity;", "convertWeatherToEntity", "weather", "getAllHistory", "getWeatherFromLocalStorageRus", "getWeatherFromLocalStorageWorld", "getWeatherFromServer", "lat", "", "lng", "saveEntity", "", "app_paidDebug"})
public final class RepositoryImpl implements com.bignerdranch.android.androidwithkotlin.model.repository.Repository {
    
    public RepositoryImpl() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.bignerdranch.android.androidwithkotlin.model.entities.Weather getWeatherFromServer(double lat, double lng) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.bignerdranch.android.androidwithkotlin.model.entities.Weather> getWeatherFromLocalStorageRus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.bignerdranch.android.androidwithkotlin.model.entities.Weather> getWeatherFromLocalStorageWorld() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.bignerdranch.android.androidwithkotlin.model.entities.Weather> getAllHistory() {
        return null;
    }
    
    @java.lang.Override()
    public void saveEntity(@org.jetbrains.annotations.NotNull()
    com.bignerdranch.android.androidwithkotlin.model.entities.Weather weather) {
    }
    
    private final java.util.List<com.bignerdranch.android.androidwithkotlin.model.entities.Weather> convertHistoryEntityToWeather(java.util.List<com.bignerdranch.android.androidwithkotlin.model.database.HistoryEntity> entityList) {
        return null;
    }
    
    private final com.bignerdranch.android.androidwithkotlin.model.database.HistoryEntity convertWeatherToEntity(com.bignerdranch.android.androidwithkotlin.model.entities.Weather weather) {
        return null;
    }
}