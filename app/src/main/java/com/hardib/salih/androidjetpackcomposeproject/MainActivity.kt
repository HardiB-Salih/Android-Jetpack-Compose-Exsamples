package com.hardib.salih.androidjetpackcomposeproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.hardib.salih.androidjetpackcomposeproject.bottom_navigation_bar.*
import com.hardib.salih.androidjetpackcomposeproject.new_buttom_nav_bar.graphs.RootNavigationGraph
import com.hardib.salih.androidjetpackcomposeproject.ui.theme.AndroidJetpackComposeProjectTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidJetpackComposeProjectTheme {
                RootNavigationGraph(navController = rememberNavController())
            }
        }
    }
}



//@Composable
//fun MainScreen() {
//    val navController = rememberNavController()
//
//    Scaffold(
//        bottomBar = {
//                AppBottomNavigation(
//                    navController = navController,
//                    modifier = Modifier
//                        .clip(RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp))
//                        .border(
//                            1.dp, Brush.verticalGradient(
//                                listOf(
//                                    Color.White.copy(0.4f),
//                                    Color.White.copy(0.2f),
//                                    Color.Transparent
//                                )
//                            ),
//                            RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp)
//                        ),
//                )
//             },
//        drawerContent = { Text(text = "Drawer") },
//    ) {
//        NavHost(navController = navController, startDestination = NAV_HOME) {
//            composable(NAV_HOME) { AppScreen(text = "Home Screen", navController) }
//            composable(NAV_FAV) { AppScreen(text = "Favourite Screen", navController) }
//            composable(NAV_FEED) { AppScreen(text = "Feed Screen", navController) }
//            composable(NAV_PROFILE) { AppScreen(text = "Profile Screen", navController) }
//            composable("HomeDetailScreen") {
//                HomeDetailScreen(navController = navController)
//            }
//
//        }
//    }
//}
//
//@Composable
//fun AppScreen(text: String, navController: NavController) = Surface(modifier = Modifier
//    .fillMaxSize()
//    .clickable {
//        navController.navigate("HomeDetailScreen")
//    }) {
//    Text(text = text, fontSize = 32.sp)
//}
//
//@Composable
//public fun currentRoute(navController: NavController): String? {
//    val navBackStackEntry by navController.currentBackStackEntryAsState()
//    return navBackStackEntry?.arguments?.getString("KEY_ROUTE")
//}
//
//@Preview(showBackground = true)
//@Composable
//fun DefaultPreview() {
//    AndroidJetpackComposeProjectTheme {
//        MainScreen()
//    }
//}