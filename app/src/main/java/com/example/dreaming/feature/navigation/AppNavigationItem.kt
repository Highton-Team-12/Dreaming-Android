package com.example.dreaming.feature.navigation

sealed class AppNavigationItem(val route: String) {

    object Splash : AppNavigationItem("splash")

    object Main : AppNavigationItem("main")

    object Login : AppNavigationItem("login")

    object Register : AppNavigationItem("register")

    object Home : AppNavigationItem("home")

}