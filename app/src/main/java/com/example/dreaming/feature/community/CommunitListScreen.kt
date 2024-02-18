package com.example.dreaming.feature.community

import androidx.compose.foundation.Image
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
fun CommunitListScreen(navController: NavController) {
    LaunchedEffect(true){
        delay(3000)
        navController.navigate(AppNavigationItem.Subtract.route) { popUpTo(0)}
    }

    Image(
        painter = painterResource(id = R.drawable.ic_community_list),
        contentDescription = null,
        modifier = Modifier
            .fillMaxWidth()
    )
}