package com.example.dreaming.feature.login

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.dreaming.feature.navigation.AppNavigationItem
import com.example.dreaming.ui.component.TextField
import com.example.dreaming.ui.theme.background
import com.example.dreaming.ui.theme.black
import com.example.dreaming.ui.theme.main

@Composable
fun LoginScreen(navController: NavController){

    var userId by remember { mutableStateOf("") }
    Login(userId = userId)
}


@Composable
fun Login(userId: String) {
    
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf(" ") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(black)
    ) {
        Spacer(modifier = Modifier.padding(top = 48.dp))
        TextField(
            text = email,
            placeholder = userId.ifBlank { "아이디" },
            onTextChange = { text -> email = text })
        Spacer(modifier = Modifier.size(8.dp))
        TextField(
            text = password,
            placeholder = "비밀번호",
            isSecret = true,
            onTextChange = { text -> password = text })
    }

}