package com.bignerdranch.android.androidwithkotlin.framework.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bignerdranch.android.androidwithkotlin.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, DetailsFragment.newInstance())
                .commitNow()
        }
    }
}