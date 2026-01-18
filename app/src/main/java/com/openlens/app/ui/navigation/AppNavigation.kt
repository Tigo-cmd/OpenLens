package com.openlens.app.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.openlens.app.ui.screens.capture.CaptureScreen
import com.openlens.app.ui.screens.chat.ChatScreen
import com.openlens.app.ui.screens.history.HistoryScreen
import com.openlens.app.ui.screens.auth.LoginScreen
import com.openlens.app.ui.screens.auth.SignUpScreen
import com.openlens.app.ui.screens.settings.SettingsScreen
import com.openlens.app.ui.screens.home.HomeScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Screen.Login.route) {
        composable(Screen.Login.route) {
            LoginScreen(navController)
        }
        composable(Screen.SignUp.route) {
            SignUpScreen(navController)
        }
        composable(Screen.Home.route) {
            HomeScreen()
        }
        composable(Screen.Capture.route) {
            CaptureScreen()
        }
        composable(Screen.Chat.route) {
            ChatScreen()
        }
        composable(Screen.History.route) {
            HistoryScreen()
        }
        composable(Screen.Settings.route) {
            SettingsScreen()
        }
    }
}
