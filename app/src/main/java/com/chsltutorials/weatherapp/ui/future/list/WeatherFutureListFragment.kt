package com.chsltutorials.weatherapp.ui.future.list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.chsltutorials.weatherapp.R

class WeatherFutureListFragment : Fragment() {

    private lateinit var weatherFutureListViewModel: WeatherFutureListViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        weatherFutureListViewModel =
            ViewModelProviders.of(this).get(WeatherFutureListViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_future_list, container, false)
        val textView: TextView = root.findViewById(R.id.text_dashboard)
        weatherFutureListViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}