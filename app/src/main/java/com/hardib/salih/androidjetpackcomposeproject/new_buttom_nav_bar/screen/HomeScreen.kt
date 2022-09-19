package com.hardib.salih.androidjetpackcomposeproject.new_buttom_nav_bar.screen

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.hardib.salih.androidjetpackcomposeproject.new_buttom_nav_bar.BottomBar
import com.hardib.salih.androidjetpackcomposeproject.new_buttom_nav_bar.graphs.HomeNavGraph

@Composable
fun HomeScreen(
    navController: NavHostController = rememberNavController()
) {
    Scaffold(
        bottomBar = {BottomBar(navController)}
    ) {
        HomeNavGraph(navController = navController)
    }

}