package com.example.dreaming.feature.splash

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.dreaming.android.R
import com.example.dreaming.feature.navigation.AppNavigationItem
import com.example.dreaming.ui.theme.black
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavController) {
    var navigateToLogin by remember { mutableStateOf(false) }

    LaunchedEffect(true){
        delay(500)
        navigateToLogin = true
    }

    if (navigateToLogin){
        navController.navigate(AppNavigationItem.Login.route)
    }
    Box(
    modifier = Modifier
        .fillMaxSize()
        .background(black),
    contentAlignment = Alignment.Center
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_logo),
            contentDescription = null,
            modifier = Modifier.size(200.dp),
            tint = Color.Unspecified
        )
    }
}