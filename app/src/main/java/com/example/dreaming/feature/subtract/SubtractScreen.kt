package com.example.dreaming.feature.subtract

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
fun SubtractScreen(navController: NavController) {

    Image(
        painter = painterResource(id = R.drawable.ic_subtract),
        contentDescription = null,
        modifier = Modifier
            .fillMaxSize()
    )
}