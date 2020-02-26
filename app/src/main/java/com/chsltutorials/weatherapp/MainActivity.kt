package com.chsltutorials.weatherapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var navController : NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        navController = findNavController(R.id.navHostFragment)
        //val appBarConfiguration = AppBarConfiguration(setOf( R.id.navigation_today,R.id.navigation_sevendays,R.id.navigation_settings))
        bnvView.setupWithNavController(navController)
        NavigationUI.setupActionBarWithNavController(this,navController)
    }

    override fun onSupportNavigateUp() = NavigationUI.navigateUp(null,navController)
}
