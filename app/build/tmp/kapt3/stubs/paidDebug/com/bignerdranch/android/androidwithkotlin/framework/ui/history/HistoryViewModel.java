package com.bignerdranch.android.androidwithkotlin.framework.ui.history;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0006\u0010\u000f\u001a\u00020\u0010R\u0012\u0010\u0006\u001a\u00020\u0007X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/bignerdranch/android/androidwithkotlin/framework/ui/history/HistoryViewModel;", "Landroidx/lifecycle/ViewModel;", "Lkotlinx/coroutines/CoroutineScope;", "repository", "Lcom/bignerdranch/android/androidwithkotlin/model/repository/Repository;", "(Lcom/bignerdranch/android/androidwithkotlin/model/repository/Repository;)V", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "historyLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/bignerdranch/android/androidwithkotlin/AppState;", "getHistoryLiveData", "()Landroidx/lifecycle/MutableLiveData;", "getAllHistory", "", "app_paidDebug"})
public final class HistoryViewModel extends androidx.lifecycle.ViewModel implements kotlinx.coroutines.CoroutineScope {
    private final com.bignerdranch.android.androidwithkotlin.model.repository.Repository repository = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.bignerdranch.android.androidwithkotlin.AppState> historyLiveData = null;
    
    public HistoryViewModel(@org.jetbrains.annotations.NotNull()
    com.bignerdranch.android.androidwithkotlin.model.repository.Repository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.bignerdranch.android.androidwithkotlin.AppState> getHistoryLiveData() {
        return null;
    }
    
    public final void getAllHistory() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlin.coroutines.CoroutineContext getCoroutineContext() {
        return null;
    }
}