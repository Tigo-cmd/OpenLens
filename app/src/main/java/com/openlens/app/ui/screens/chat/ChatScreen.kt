package com.openlens.app.ui.screens.chat

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ChatScreen() {
    val messages = remember { mutableStateOf(listOf("Hello!", "How can I help you?")) }
    val newMessage = remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        LazyColumn(
            modifier = Modifier.weight(1f)
        ) {
            items(messages.value) { message ->
                Text(message)
            }
        }
        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            OutlinedTextField(
                value = newMessage.value,
                onValueChange = { newMessage.value = it },
                modifier = Modifier.weight(1f)
            )
            Button(
                onClick = {
                    messages.value = messages.value + newMessage.value
                    newMessage.value = ""
                },
                modifier = Modifier.padding(start = 8.dp)
            ) {
                Text("Send")
            }
        }
    }
}