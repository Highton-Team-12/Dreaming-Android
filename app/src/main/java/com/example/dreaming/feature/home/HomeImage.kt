package com.example.dreaming.feature.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
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
fun HomeImage(navController: NavController) {

    LaunchedEffect(true){
        delay(3000)
        navController.navigate(AppNavigationItem.Mypage.route) { popUpTo(0)}
    }

    Image(
        painter = painterResource(id = R.drawable.ic_home),
        contentDescription = null,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 220.dp)
    )
}
