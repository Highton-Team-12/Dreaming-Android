package com.example.dreaming.feature.navigation

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
        icon = { painterResource(R.drawable.ic_home)},
        label = "홈"
    ),

    Mypage(
        route = "mypage",
        icon = { painterResource(id = R.drawable.ic_my)},
        label = "마이"
    ),

    Community(
        route = "community",
        icon = { painterResource(id = R.drawable.ic_community)},
        label = "대화"
    ),

    Subtract(
        route = "subtract",
        icon = { painterResource(id = R.drawable.ic_subtract)},
        label = "문의"
    )
}