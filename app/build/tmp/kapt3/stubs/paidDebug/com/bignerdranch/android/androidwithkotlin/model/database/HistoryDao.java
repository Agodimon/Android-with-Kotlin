package com.bignerdranch.android.androidwithkotlin.model.database;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\'J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\'J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\f\u001a\u00020\nH\'J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\'J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\'\u00a8\u0006\u000f"}, d2 = {"Lcom/bignerdranch/android/androidwithkotlin/model/database/HistoryDao;", "", "all", "", "Lcom/bignerdranch/android/androidwithkotlin/model/database/HistoryEntity;", "delete", "", "entity", "deleteByCityName", "cityName", "", "getDataByWord", "city", "insert", "update", "app_paidDebug"})
public abstract interface HistoryDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM HistoryEntity")
    public abstract java.util.List<com.bignerdranch.android.androidwithkotlin.model.database.HistoryEntity> all();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM HistoryEntity WHERE city = :city")
    public abstract java.util.List<com.bignerdranch.android.androidwithkotlin.model.database.HistoryEntity> getDataByWord(@org.jetbrains.annotations.NotNull()
    java.lang.String city);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    com.bignerdranch.android.androidwithkotlin.model.database.HistoryEntity entity);
    
    @androidx.room.Update()
    public abstract void update(@org.jetbrains.annotations.NotNull()
    com.bignerdranch.android.androidwithkotlin.model.database.HistoryEntity entity);
    
    @androidx.room.Delete()
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    com.bignerdranch.android.androidwithkotlin.model.database.HistoryEntity entity);
    
    @androidx.room.Query(value = "DELETE FROM HistoryEntity WHERE city = :cityName")
    public abstract void deleteByCityName(@org.jetbrains.annotations.NotNull()
    java.lang.String cityName);
}