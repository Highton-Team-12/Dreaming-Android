package com.example.highton.feature.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import com.dreaming.android.R
import androidx.compose.ui.res.painterResource

enum class BottomNavigationItem(
    val route: String,
    val icon: @Composable () -> Painter,
    val label: String
) {
    Home(
        route = "home",
        icon = { painterResource(R.drawable.)},
        label = "홈"
    )

}