package com.hardib.salih.androidjetpackcomposeproject.new_buttom_nav_bar.screen

import androidx.compose.material.Scaffold
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.navigation.NavHostController
import com.hardib.salih.androidjetpackcomposeproject.nav_drawer.AppBar
import com.hardib.salih.androidjetpackcomposeproject.nav_drawer.DrawerBody
import com.hardib.salih.androidjetpackcomposeproject.nav_drawer.DrawerHeader
import com.hardib.salih.androidjetpackcomposeproject.nav_drawer.menuItems
import com.hardib.salih.androidjetpackcomposeproject.new_buttom_nav_bar.ScreenContent
import kotlinx.coroutines.launch

@Composable
fun DetailsScreen(navController: NavHostController) {
    val name = remember {
        mutableStateOf("Home")
    }
    val scaffoldState = rememberScaffoldState()
    val scope = rememberCoroutineScope()

    Scaffold (
        scaffoldState = scaffoldState,
        topBar = {
                 AppBar (
                     onNavigationIconClick = {
                         scope.launch {
                             scaffoldState.drawerState.open()
                         }
                     }
                 )
        },
        drawerGesturesEnabled = scaffoldState.drawerState.isOpen,
        drawerContent = {
            DrawerHeader()
            DrawerBody(items = menuItems,
                onItemClick = {
                    name.value = it.title
                    scope.launch {
                        scaffoldState.drawerState.close()
//                        if (scaffoldState.drawerState.isOpen){
//
//                        }
                    }
                })
        }
            ){
        ScreenContent(name = name.value) {}
    }


}