package com.bignerdranch.android.androidwithkotlin.framework.ui.details;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u001e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/bignerdranch/android/androidwithkotlin/framework/ui/details/DetailsViewModel;", "Landroidx/lifecycle/ViewModel;", "Landroidx/lifecycle/LifecycleObserver;", "repository", "Lcom/bignerdranch/android/androidwithkotlin/model/repository/Repository;", "(Lcom/bignerdranch/android/androidwithkotlin/model/repository/Repository;)V", "liveDataToObserve", "Landroidx/lifecycle/MutableLiveData;", "Lcom/bignerdranch/android/androidwithkotlin/AppState;", "getLiveDataToObserve", "()Landroidx/lifecycle/MutableLiveData;", "loadData", "", "cityName", "", "lat", "", "lng", "app_paidDebug"})
public final class DetailsViewModel extends androidx.lifecycle.ViewModel implements androidx.lifecycle.LifecycleObserver {
    private final com.bignerdranch.android.androidwithkotlin.model.repository.Repository repository = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.bignerdranch.android.androidwithkotlin.AppState> liveDataToObserve = null;
    
    public DetailsViewModel(@org.jetbrains.annotations.NotNull()
    com.bignerdranch.android.androidwithkotlin.model.repository.Repository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.bignerdranch.android.androidwithkotlin.AppState> getLiveDataToObserve() {
        return null;
    }
    
    public final void loadData(@org.jetbrains.annotations.NotNull()
    java.lang.String cityName, double lat, double lng) {
    }
}