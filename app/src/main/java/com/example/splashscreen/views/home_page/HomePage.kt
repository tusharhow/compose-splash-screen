package com.example.splashscreen.views.home_page

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp

@Composable
fun HomePage() {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(color = Color.Blue)
        , contentAlignment = Alignment.Center,

    ){
            Text(text = "Home Page", style =  TextStyle(
                color = Color.White,
                fontSize = 30.sp
            ))
    }
}