package com.rabea.navigationcomponentexample.drawarlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.NavigationUI.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.rabea.navigationcomponentexample.R
import com.rabea.navigationcomponentexample.databinding.ActivityDrawarLayoutBinding

class DrawarLayoutActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDrawarLayoutBinding
    lateinit var navHostFragment: NavHostFragment
    lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_drawar_layout)
        setSupportActionBar(binding.toolbar)

        navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHostFragment.navController

        NavigationUI.setupWithNavController(binding.navView, navController)
        NavigationUI.setupActionBarWithNavController(this, navController, binding.drawarLayout)

    }

    override fun onSupportNavigateUp(): Boolean {
        return navigateUp(navController, binding.drawarLayout)
    }

}