package com.example.splashscreen.views.home_page

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun HomePage() {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(color = Color.Cyan)){
            Text(text = "Home Page")
    }
}