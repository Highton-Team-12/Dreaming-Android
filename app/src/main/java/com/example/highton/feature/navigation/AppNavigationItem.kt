package com.example.highton.feature.navigation

sealed class AppNavigationItem(val route: String) {

    object Splash : AppNavigationItem("splash")

    object Main : AppNavigationItem("main")
}