package com.openlens.app.ui.screens.history

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
fun HistoryScreen() {
    val historyItems = listOf(
        "Identified 'Blue ceramic coffee mug'",
        "Translated 'Hola, mundo'",
        "Called 'Sarah'"
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text("Command History")
        LazyColumn(
            modifier = Modifier.weight(1f)
        ) {
            items(historyItems) { item ->
                Text(item, modifier = Modifier.padding(8.dp))
            }
        }
    }
}