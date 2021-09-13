package com.bignerdranch.android.androidwithkotlin.framework.ui.list_of_cities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\u0006\u0010\u000e\u001a\u00020\nJ\u0006\u0010\u000f\u001a\u00020\nR\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/bignerdranch/android/androidwithkotlin/framework/ui/list_of_cities/ListOfCitiesViewModel;", "Landroidx/lifecycle/ViewModel;", "Landroidx/lifecycle/LifecycleObserver;", "repository", "Lcom/bignerdranch/android/androidwithkotlin/model/repository/Repository;", "(Lcom/bignerdranch/android/androidwithkotlin/model/repository/Repository;)V", "liveDataToObserve", "Landroidx/lifecycle/MutableLiveData;", "Lcom/bignerdranch/android/androidwithkotlin/AppState;", "getDataFromLocalSource", "", "isRussian", "", "getLiveData", "getWeatherFromLocalSourceRus", "getWeatherFromLocalSourceWorld", "app_paidRelease"})
public final class ListOfCitiesViewModel extends androidx.lifecycle.ViewModel implements androidx.lifecycle.LifecycleObserver {
    private final com.bignerdranch.android.androidwithkotlin.model.repository.Repository repository = null;
    private final androidx.lifecycle.MutableLiveData<com.bignerdranch.android.androidwithkotlin.AppState> liveDataToObserve = null;
    
    public ListOfCitiesViewModel(@org.jetbrains.annotations.NotNull()
    com.bignerdranch.android.androidwithkotlin.model.repository.Repository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.bignerdranch.android.androidwithkotlin.AppState> getLiveData() {
        return null;
    }
    
    public final void getWeatherFromLocalSourceRus() {
    }
    
    public final void getWeatherFromLocalSourceWorld() {
    }
    
    private final void getDataFromLocalSource(boolean isRussian) {
    }
}