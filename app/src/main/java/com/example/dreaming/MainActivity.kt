package com.dreaming.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.rememberScaffoldState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.runtime.currentComposer
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.dreaming.application.DreamingApp
import com.example.dreaming.application.PreferenceManager
import com.example.dreaming.feature.community.CommunitListScreen
import com.example.dreaming.feature.community.CommunityScreen
import com.example.dreaming.feature.home.HomeImage
import com.example.dreaming.feature.home.HomeScreen
import com.example.dreaming.feature.login.LoginScreen
import com.example.dreaming.feature.mypage.MypageScreen
import com.example.dreaming.feature.navigation.AppNavigationItem
import com.example.dreaming.feature.navigation.BottomNavigationItem
import com.example.dreaming.ui.component.BottomNavigation
import com.example.dreaming.feature.splash.SplashScreen
import com.example.dreaming.feature.subtract.SubtractScreen
import com.example.dreaming.ui.theme.black
import com.example.dreaming.util.DevicePaddings

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val context = LocalContext.current

            DreamingApp.prefs = PreferenceManager(context)
            BaseApp()
        }
    }
}

@Composable
fun BaseApp(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = AppNavigationItem.Splash.route){
        composable(AppNavigationItem.Splash.route){
            SplashScreen(navController)
        }
        composable(AppNavigationItem.Main.route){
            Main(navController)
        }
        composable(AppNavigationItem.Login.route){
            LoginScreen(navController)
        }
        composable(AppNavigationItem.HIM.route){
            HomeImage(navController)
        }
        composable(AppNavigationItem.Mypage.route){
            MypageScreen(navController)
        }
        composable(AppNavigationItem.Communit.route){
            CommunityScreen(navController)
        }
        composable(AppNavigationItem.Subtract.route){
            SubtractScreen(navController)
        }
        composable(AppNavigationItem.CommunitList.route){
            CommunitListScreen(navController)
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Main(mainNavController: NavController) {
    val scaffoldState = rememberScaffoldState()
    val navController = rememberNavController()

    Scaffold(
        modifier = androidx.compose.ui.Modifier
            .background(black)
            .padding(
                bottom = DevicePaddings.navigationBarHeightDp.dp
            ),
        scaffoldState = scaffoldState,
        isFloatingActionButtonDocked = true,
        bottomBar = {
            BottomNavigation(
                navController = navController,
                items = listOf(
                    BottomNavigationItem.Home,
                    BottomNavigationItem.Mypage,
                    BottomNavigationItem.Community,
                    BottomNavigationItem.Subtract
                ),)
        }
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = BottomNavigationItem.Home.route,
            Modifier.padding(innerPadding)
        ){
            composable(BottomNavigationItem.Home.route){
                HomeScreen(mainNavController)
            }
            composable(BottomNavigationItem.Mypage.route){
                MypageScreen(mainNavController)
            }
            composable(BottomNavigationItem.Community.route){
                CommunityScreen(mainNavController)
            }
            composable(BottomNavigationItem.Subtract.route){
                SubtractScreen(mainNavController)
            }
        }
    }
}
