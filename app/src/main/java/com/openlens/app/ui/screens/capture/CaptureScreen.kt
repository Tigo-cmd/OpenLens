package com.openlens.app.ui.screens.capture

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun CaptureScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Listening...")
        Box(
            modifier = Modifier
                .weight(1f),
            contentAlignment = Alignment.Center
        ) {
            // Placeholder for waveform animation
            Text("Waveform Animation")
        }
        Button(
            onClick = { /* Handle push-to-talk */ },
            modifier = Modifier.size(150.dp)
        ) {
            Text("Push to Talk")
        }
    }
}