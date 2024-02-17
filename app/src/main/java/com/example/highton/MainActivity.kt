package com.example.highton

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.highton.feature.navigation.AppNavigationItem
import com.example.highton.feature.navigation.BottomNavigationItem
import com.example.highton.feature.splash.SplashScreen
import com.example.highton.ui.theme.black
import com.example.highton.util.DevicePaddings
import com.example.highton.util.Utils
import java.lang.reflect.Modifier

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
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
            //Main(navController)
        }
    }
}
//
//@OptIn(ExperimentalMaterial3Api::class)
//@Composable
//fun Main(navController: NavController) {
//    val scaffoldState = rememberScrollState()
//    val navController = rememberNavController()
//
//    Scaffold(
//        modifier = androidx.compose.ui.Modifier
//            .background(black)
//            .padding(
//                bottom = DevicePaddings.navigationBarHeightDp.dp
//            ),
//    ) {
//        NavHost(navController = , graph = )
//}
