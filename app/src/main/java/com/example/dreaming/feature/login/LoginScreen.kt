package com.example.dreaming.feature.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.dreaming.android.R
import com.example.dreaming.feature.navigation.AppNavigationItem
import com.example.dreaming.ui.component.TextField
import com.example.dreaming.ui.theme.black

@Composable
fun LoginScreen(navController: NavController) {

    var userId by remember { mutableStateOf("") }
    Login(
        userId = userId,
        navController = navController,
    )
}


@Composable
fun Login(userId: String, navController: NavController) {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var navigateToHome by remember { mutableStateOf(false) }

    // 클릭 이벤트 처리
    LaunchedEffect(navigateToHome) {
        if (navigateToHome) {
            navController.navigate(AppNavigationItem.HIM.route) {
                popUpTo(0)
            }
        }
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(black)
            .padding(horizontal = 16.dp)
    ) {
        Spacer(modifier = Modifier.padding(top = 200.dp))
        Image(
            modifier = Modifier
                .size(130.dp)
                .align(Alignment.CenterHorizontally),
            painter = painterResource(id = R.drawable.ic_logo),
            contentDescription = null
        )
        Spacer(modifier = Modifier.size(20.dp))
        TextField(
            text = email,
            placeholder = userId.ifBlank { "아이디" },
            onTextChange = { text -> email = text }
        )
        Spacer(modifier = Modifier.size(21.dp))
        TextField(
            text = password,
            placeholder = "비밀번호",
            isSecret = true,
            onTextChange = { text -> password = text }
        )
        Spacer(modifier = Modifier.size(35.dp))
        // 클릭 이벤트 처리
        Image(
            painter = painterResource(id = R.drawable.ic_login),
            contentDescription = null,
            modifier = Modifier.clickable {
                navigateToHome = true
            }
        )
    }
}
