package com.hardib.salih.androidjetpackcomposeproject.new_buttom_nav_bar.graphs

import android.window.SplashScreen
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.hardib.salih.androidjetpackcomposeproject.new_buttom_nav_bar.screen.HomeScreen

@Composable
fun RootNavigationGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        route = Graph.ROOT,
        startDestination = Graph.SPLASH
    ){
        splashNavGraph(navController)
        composable(Graph.HOME){
            //Here We Go To Home Screen
            HomeScreen()
        }
    }

}

