package com.bignerdranch.android.androidwithkotlin.di

import com.bignerdranch.android.androidwithkotlin.framework.ui.main.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule= module {
    viewModel { MainViewModel() }
}