package com.example.dreaming.feature.mypage

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.dreaming.android.R
import com.example.dreaming.feature.navigation.AppNavigationItem
import kotlinx.coroutines.delay

@Composable
fun MypageScreen(navController: NavController) {

    LaunchedEffect(true){
        delay(3000)
        navController.navigate(AppNavigationItem.Communit.route) { popUpTo(0)}
    }

    Image(
        painter = painterResource(id = R.drawable.ic_mypage),
        contentDescription = null,
        modifier = Modifier
            .fillMaxSize()
    )
}