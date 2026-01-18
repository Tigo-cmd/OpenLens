package com.openlens.app.ui.screens.settings

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SettingsScreen() {
    val settingsOptions = listOf(
        "Device Settings",
        "Accessibility",
        "Plugins",
        "Privacy",
        "Account"
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text("Settings")
        LazyColumn(
            modifier = Modifier.weight(1f)
        ) {
            items(settingsOptions) { option ->
                Text(option, modifier = Modifier.padding(8.dp))
            }
        }
    }
}