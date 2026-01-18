package com.openlens.app.ui.navigation

sealed class Screen(val route: String) {
    object Home : Screen("home")
    object Capture : Screen("capture")
    object Chat : Screen("chat")
    object History : Screen("history")
    object Settings : Screen("settings")
    object Login : Screen("login")
    object SignUp : Screen("signup")
}