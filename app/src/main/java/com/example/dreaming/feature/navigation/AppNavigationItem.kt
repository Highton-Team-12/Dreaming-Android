package com.example.dreaming.feature.navigation

sealed class AppNavigationItem(val route: String) {

    object Splash : AppNavigationItem("splash")

    object Main : AppNavigationItem("main")

    object Login : AppNavigationItem("login")

    object Register : AppNavigationItem("register")

    object HIM : AppNavigationItem("him")

    object Mypage : AppNavigationItem("mypage")

    object Communit : AppNavigationItem("communit")

    object Subtract : AppNavigationItem("subtract")

    object CommunitList : AppNavigationItem("communitlist")

}