package com.kimongo.sitehub.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.kimongo.sitehub.ui.screens.LoginScreen
import com.kimongo.sitehub.ui.screens.Signupcreen
import com.kimongo.sitehub.ui.screens.SplashScreen

@Preview
@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = "splash"
        ) {
        composable("splash") {
            SplashScreen(navController)
        }
        composable("login") {
            LoginScreen()
        }
        composable("signup") {
            Signupcreen()
        }
    }
}