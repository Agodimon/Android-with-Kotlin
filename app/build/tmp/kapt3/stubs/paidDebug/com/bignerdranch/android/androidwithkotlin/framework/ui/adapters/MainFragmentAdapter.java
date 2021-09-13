package com.bignerdranch.android.androidwithkotlin.framework.ui.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0017B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u000b\u001a\u00020\fH\u0016J\u001c\u0010\r\u001a\u00020\u000e2\n\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u001c\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\fH\u0016J\u0016\u0010\u0015\u001a\u00020\u000e2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0007R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/bignerdranch/android/androidwithkotlin/framework/ui/adapters/MainFragmentAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/bignerdranch/android/androidwithkotlin/framework/ui/adapters/MainFragmentAdapter$MainViewHolder;", "itemClickListener", "Lcom/bignerdranch/android/androidwithkotlin/framework/ui/list_of_cities/ListOfCitiesFragment$OnItemViewClickListener;", "(Lcom/bignerdranch/android/androidwithkotlin/framework/ui/list_of_cities/ListOfCitiesFragment$OnItemViewClickListener;)V", "binding", "Lcom/bignerdranch/android/androidwithkotlin/databinding/FragmentMainRecyclerItemBinding;", "weatherData", "", "Lcom/bignerdranch/android/androidwithkotlin/model/entities/Weather;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setWeather", "data", "MainViewHolder", "app_paidDebug"})
public final class MainFragmentAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.bignerdranch.android.androidwithkotlin.framework.ui.adapters.MainFragmentAdapter.MainViewHolder> {
    private com.bignerdranch.android.androidwithkotlin.framework.ui.list_of_cities.ListOfCitiesFragment.OnItemViewClickListener itemClickListener;
    private java.util.List<com.bignerdranch.android.androidwithkotlin.model.entities.Weather> weatherData;
    private com.bignerdranch.android.androidwithkotlin.databinding.FragmentMainRecyclerItemBinding binding;
    
    public MainFragmentAdapter(@org.jetbrains.annotations.NotNull()
    com.bignerdranch.android.androidwithkotlin.framework.ui.list_of_cities.ListOfCitiesFragment.OnItemViewClickListener itemClickListener) {
        super();
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    public final void setWeather(@org.jetbrains.annotations.NotNull()
    java.util.List<com.bignerdranch.android.androidwithkotlin.model.entities.Weather> data) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.bignerdranch.android.androidwithkotlin.framework.ui.adapters.MainFragmentAdapter.MainViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.bignerdranch.android.androidwithkotlin.framework.ui.adapters.MainFragmentAdapter.MainViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lcom/bignerdranch/android/androidwithkotlin/framework/ui/adapters/MainFragmentAdapter$MainViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/bignerdranch/android/androidwithkotlin/framework/ui/adapters/MainFragmentAdapter;Landroid/view/View;)V", "bind", "", "weather", "Lcom/bignerdranch/android/androidwithkotlin/model/entities/Weather;", "app_paidDebug"})
    public final class MainViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public MainViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.bignerdranch.android.androidwithkotlin.model.entities.Weather weather) {
        }
    }
}