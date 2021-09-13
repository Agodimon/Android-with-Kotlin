package com.bignerdranch.android.androidwithkotlin.model.entities;

import java.lang.System;

@kotlinx.parcelize.Parcelize()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000fJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000fJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bH\u00c6\u0003J<\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u00c6\u0001\u00a2\u0006\u0002\u0010\u0017J\t\u0010\u0018\u001a\u00020\u0005H\u00d6\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u00d6\u0003J\t\u0010\u001d\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u001e\u001a\u00020\bH\u00d6\u0001J\u0019\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0011\u0010\u000f\u00a8\u0006$"}, d2 = {"Lcom/bignerdranch/android/androidwithkotlin/model/entities/Weather;", "Landroid/os/Parcelable;", "city", "Lcom/bignerdranch/android/androidwithkotlin/model/entities/City;", "temperature", "", "feelsLike", "condition", "", "(Lcom/bignerdranch/android/androidwithkotlin/model/entities/City;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "getCity", "()Lcom/bignerdranch/android/androidwithkotlin/model/entities/City;", "getCondition", "()Ljava/lang/String;", "getFeelsLike", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTemperature", "component1", "component2", "component3", "component4", "copy", "(Lcom/bignerdranch/android/androidwithkotlin/model/entities/City;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lcom/bignerdranch/android/androidwithkotlin/model/entities/Weather;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_paidRelease"})
public final class Weather implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull()
    private final com.bignerdranch.android.androidwithkotlin.model.entities.City city = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer temperature = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer feelsLike = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String condition = null;
    public static final android.os.Parcelable.Creator<com.bignerdranch.android.androidwithkotlin.model.entities.Weather> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.bignerdranch.android.androidwithkotlin.model.entities.Weather copy(@org.jetbrains.annotations.NotNull()
    com.bignerdranch.android.androidwithkotlin.model.entities.City city, @org.jetbrains.annotations.Nullable()
    java.lang.Integer temperature, @org.jetbrains.annotations.Nullable()
    java.lang.Integer feelsLike, @org.jetbrains.annotations.Nullable()
    java.lang.String condition) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public Weather() {
        super();
    }
    
    public Weather(@org.jetbrains.annotations.NotNull()
    com.bignerdranch.android.androidwithkotlin.model.entities.City city, @org.jetbrains.annotations.Nullable()
    java.lang.Integer temperature, @org.jetbrains.annotations.Nullable()
    java.lang.Integer feelsLike, @org.jetbrains.annotations.Nullable()
    java.lang.String condition) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.bignerdranch.android.androidwithkotlin.model.entities.City component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.bignerdranch.android.androidwithkotlin.model.entities.City getCity() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getTemperature() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getFeelsLike() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCondition() {
        return null;
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator<com.bignerdranch.android.androidwithkotlin.model.entities.Weather> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.bignerdranch.android.androidwithkotlin.model.entities.Weather createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.bignerdranch.android.androidwithkotlin.model.entities.Weather[] newArray(int size) {
            return null;
        }
    }
}