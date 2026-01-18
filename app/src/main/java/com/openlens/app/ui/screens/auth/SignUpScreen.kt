package com.openlens.app.ui.screens.auth

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.openlens.app.ui.navigation.Screen
import com.openlens.app.ui.viewmodel.AuthViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignUpScreen(
    navController: NavController,
    authViewModel: AuthViewModel = hiltViewModel()
) {
    val email by authViewModel.email.collectAsState()
    val password by authViewModel.password.collectAsState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        OutlinedTextField(
            value = email,
            onValueChange = { authViewModel.onEmailChange(it) },
            label = { Text("Email") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(8.dp))
        OutlinedTextField(
            value = password,
            onValueChange = { authViewModel.onPasswordChange(it) },
            label = { Text("Password") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = { navController.navigate(Screen.Home.route) },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Sign Up")
        }
        Spacer(modifier = Modifier.height(8.dp))
        Button(
            onClick = { navController.navigate(Screen.Login.route) },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Back to Login")
        }
    }
}