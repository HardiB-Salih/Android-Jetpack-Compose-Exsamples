package com.hardib.salih.androidjetpackcomposeproject.new_buttom_nav_bar.screen

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.hardib.salih.androidjetpackcomposeproject.nav_drawer.AppBar
import com.hardib.salih.androidjetpackcomposeproject.nav_drawer.DrawerBody
import com.hardib.salih.androidjetpackcomposeproject.nav_drawer.DrawerHeader
import com.hardib.salih.androidjetpackcomposeproject.nav_drawer.menuItems
import com.hardib.salih.androidjetpackcomposeproject.new_buttom_nav_bar.ScreenContent
import kotlinx.coroutines.launch
@ExperimentalMaterialApi
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
                        if (scaffoldState.drawerState.isOpen){
                            scaffoldState.drawerState.close()
                        }
                    }
                })
        }
            ){

        BottomSheet(name.value)
    }


}

@ExperimentalMaterialApi
@Composable
fun BottomSheet(
    name: String,
) {
    val bottomSheetState = rememberBottomSheetState(initialValue = BottomSheetValue.Collapsed)
    val scaffoldState = rememberBottomSheetScaffoldState(
        bottomSheetState = bottomSheetState
    )
    val scope = rememberCoroutineScope()
    BottomSheetScaffold(
        scaffoldState = scaffoldState,
        sheetContent = {
        Box(modifier = Modifier
            .fillMaxWidth()
            .height(300.dp),
        contentAlignment = Alignment.Center
        ) {
            Text(text = "Bottom Sheet", color = Color.Black, fontSize = 30.sp)
        }
    },
        sheetBackgroundColor = Color.Green,
        sheetPeekHeight = 0.dp
    ){
        Box(modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            ScreenContent(name = name){
                scope.launch {
                    if (bottomSheetState.isCollapsed) bottomSheetState.expand() else bottomSheetState.collapse()
                }
            }
        }
    }

}