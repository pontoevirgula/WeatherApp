package com.chsltutorials.weatherapp.ui.future.detail

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.chsltutorials.weatherapp.R

class WeatherFutureDetailFragment : Fragment() {

    companion object {
        fun newInstance() = WeatherFutureDetailFragment()
    }

    private lateinit var viewModel: WeatherFutureDetailViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_weather_future_detail, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(WeatherFutureDetailViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
