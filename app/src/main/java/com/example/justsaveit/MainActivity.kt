package com.example.justsaveit

import android.annotation.SuppressLint
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import androidx.appcompat.app.AppCompatDelegate
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.setupActionBarWithNavController
import me.ibrahimsn.lib.SmoothBottomBar

class MainActivity : AppCompatActivity() {

    private lateinit var navController: NavController
    private lateinit var navbar:SmoothBottomBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

//        val currentNightMode = Configuration.uiMode and Configuration.UI_MODE_NIGHT_MASK
//        when (currentNightMode) {
//            Configuration.UI_MODE_NIGHT_NO -> {} // Night mode is not active, we're using the light theme
//            Configuration.UI_MODE_NIGHT_YES -> {} // Night mode is active, we're using dark theme
//        }

        navbar = findViewById(R.id.nav_bar)

        navController = findNavController(R.id.main_fragment)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_bottom_nav,menu)
        navbar.setupWithNavController(menu!!,navController)
        return true
    }

    override fun onSupportNavigateUp(): Boolean {
        navController.navigateUp()
        return true
    }
}