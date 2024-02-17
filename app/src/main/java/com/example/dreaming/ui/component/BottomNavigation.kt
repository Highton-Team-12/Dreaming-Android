package com.example.dreaming.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.dreaming.feature.navigation.BottomNavigationItem
import com.example.dreaming.ui.theme.bottomback
import com.example.dreaming.ui.theme.dark
import com.example.dreaming.ui.theme.sub


@Composable
fun BottomNavigation(
    navController: NavController,
    items: List<BottomNavigationItem>,
) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination

    Row(Modifier.fillMaxWidth()) {
        items.forEach { screen ->
            val selected =
                currentDestination?.hierarchy?.any { it.route == screen.route } == true
            val color = if (selected) sub else dark
            Column(
                Modifier
                    .height(56.dp)
                    .weight(1f)
                    .background(color = bottomback)
                    .clickable(
                        interactionSource = remember { MutableInteractionSource() },
                        indication = rememberRipple(radius = 22.dp),
                    ) {
                        navController.navigate(screen.route) {
                            popUpTo(0) {
                                saveState = true
                            }
                            launchSingleTop = true
                            restoreState = true
                        }
                    },
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Icon(
                    painter = screen.icon(),
                    contentDescription = null,
                    tint = color,
                    modifier = Modifier.size(24.dp)
                )
                Body3(text = screen.label, color = color)
            }
        }
    }
}