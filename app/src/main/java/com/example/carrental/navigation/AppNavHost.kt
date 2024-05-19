package com.example.carrental.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.carrental.ui.theme.screens.contacts.ContactScreen
import com.example.carrental.ui.theme.screens.home.HomeScreen
import com.example.carrental.ui.theme.screens.login.LoginScreen
import com.example.carrental.ui.theme.screens.register.RegisterScreen
import com.example.carrental.ui.theme.screens.splash.SplashScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUTE_REGISTER
){
    NavHost(navController = navController,
        modifier = modifier,
        startDestination = startDestination){
        composable(ROUTE_REGISTER){ RegisterScreen(navController) }
        composable(ROUTE_HOME){ HomeScreen(navController) }
        composable(ROUTE_LOGIN){ LoginScreen(navController) }
        composable(ROUTE_SPLASH){ SplashScreen(navController) }
        composable(ROUTE_CONTACTS){ ContactScreen(navController) }}
    }

