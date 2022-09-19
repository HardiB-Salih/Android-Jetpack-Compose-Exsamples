package com.hardib.salih.androidjetpackcomposeproject.new_buttom_nav_bar.graphs

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.hardib.salih.androidjetpackcomposeproject.new_buttom_nav_bar.screen.SplashScreen

fun NavGraphBuilder.splashNavGraph(navController: NavHostController){
    navigation(
        route = Graph.SPLASH,
        startDestination = SplashScreenBy.Splash.route
    ){
        composable(SplashScreenBy.Splash.route){
            //Path Splash Screen
            SplashScreen(navController = navController)
        }
    }
}

sealed class SplashScreenBy(val route: String) {
    object Splash : SplashScreenBy(route = "SPLASH")
}