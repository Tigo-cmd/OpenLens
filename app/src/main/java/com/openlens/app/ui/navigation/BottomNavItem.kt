package com.openlens.app.ui.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.twotone.Mic
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomNavItem(val route: String, val icon: ImageVector, val title: String) {
    object Home : BottomNavItem(Screen.Home.route, Icons.Default.Home, "Home")
    object Capture : BottomNavItem(Screen.Capture.route, Icons.TwoTone.Mic, "Capture")
    object Chat : BottomNavItem(Screen.Chat.route, Icons.Default.Chat, "Chat")
    object History : BottomNavItem(Screen.History.route, Icons.Default.History, "History")
    object Settings : BottomNavItem(Screen.Settings.route, Icons.Default.Settings, "Settings")
}