package com.bignerdranch.android.androidwithkotlin.framework.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import com.bignerdranch.android.androidwithkotlin.AppState
import com.bignerdranch.android.androidwithkotlin.databinding.MainFragmentBinding
import com.google.android.material.snackbar.Snackbar
import org.koin.androidx.viewmodel.ext.android.viewModel


class MainFragment : Fragment() {


    private val viewModel: MainViewModel by viewModel()
    private var _binding: MainFragmentBinding? = null
    private val binding get() = _binding!!

    override

    fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = MainFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val observer = Observer<AppState> { renderData(it) }
        viewModel.getLiveData().observe(viewLifecycleOwner, observer)
        viewModel.getWeather()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun renderData(appState: AppState) = with(binding){
        when (appState) {
            is AppState.Success -> {
                val weatherData = appState.weatherData
                progressBar.visibility = View.GONE
                Snackbar.make(mainView, "Success", Snackbar.LENGTH_LONG).show()
            }
            is AppState.Loading -> {
                progressBar.visibility = View.VISIBLE
            }
            is AppState.Error -> {
                progressBar.visibility = View.GONE
                Snackbar
                    .make(mainView, "Error", Snackbar.LENGTH_INDEFINITE)
                    .setAction("Reload") { viewModel.getWeather() }
                    .show()
            }
        }
    }

    companion object {
        fun newInstance() = MainFragment()
    }
}