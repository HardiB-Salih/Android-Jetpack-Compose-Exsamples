package com.hardib.salih.androidjetpackcomposeproject.new_buttom_nav_bar

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import com.hardib.salih.androidjetpackcomposeproject.ui.screen_size.WindowInfo
import com.hardib.salih.androidjetpackcomposeproject.ui.screen_size.rememberWindowInfo

@Composable
fun ScreenContent(name: String, onClick: () -> Unit) {

    val windowInfo = rememberWindowInfo()

    when (windowInfo.screenWidthInfo){
        is WindowInfo.WindowType.Compact -> {
            // Screen For Phone
        }
        is WindowInfo.WindowType.Medium -> {
            // Screen For Medium size
        }
        else -> {
            //Screen For Large Size
        }
    }



    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            modifier = Modifier.clickable { onClick() },
            text = name,
            fontSize = MaterialTheme.typography.h3.fontSize,
            fontWeight = FontWeight.Bold
        )
    }
}