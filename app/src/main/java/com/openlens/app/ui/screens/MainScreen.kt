package com.openlens.app.ui.screens

import android.annotation.SuppressLint
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.openlens.app.ui.navigation.AppNavigation
import com.openlens.app.ui.navigation.BottomNavigationBar
import com.openlens.app.ui.navigation.Screen

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen() {
    val navController = rememberNavController()
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    Scaffold(
        bottomBar = {
            if (currentRoute != Screen.Login.route && currentRoute != Screen.SignUp.route) {
                BottomNavigationBar(navController = navController)
            }
        }
    ) {
        AppNavigation()
    }
}