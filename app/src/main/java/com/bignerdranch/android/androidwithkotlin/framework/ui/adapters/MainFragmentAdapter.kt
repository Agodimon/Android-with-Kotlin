package com.bignerdranch.android.androidwithkotlin.framework.ui.adapters

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bignerdranch.android.androidwithkotlin.model.entities.Weather

class MainFragmentAdapter {
    inner class MainViewHolder(view: View):RecyclerView.ViewHolder(view){
        fun bind (weather: Weather) = with(binding){
mainFragmentRecyclerItemTextView.text=weather.city.city
            root.setOnClickListener{itemClickListener?.onItemViewClick(weather)}
        }
    }
}