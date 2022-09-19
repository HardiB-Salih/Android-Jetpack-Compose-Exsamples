package com.hardib.salih.androidjetpackcomposeproject.nav_drawer

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

data class MenuItem(
    val id: String,
    val title: String,
    val contentDescription: String,
    val icon: ImageVector
)

val menuItems = listOf(
    MenuItem(
        id = "home",
        title = "Home",
        contentDescription = "Go to home screen",
        icon = Icons.Default.Home
    ),
    MenuItem(
        id = "settings",
        title = "Settings",
        contentDescription = "Go to settings screen",
        icon = Icons.Default.Settings
    ),
    MenuItem(
        id = "help",
        title = "Help",
        contentDescription = "Get help",
        icon = Icons.Default.Info
    ),
)
