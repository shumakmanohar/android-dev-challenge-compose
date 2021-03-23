package com.example.androiddevchallenge.components

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.androiddevchallenge.ui.theme.darkModeColor

@Composable
fun AppBar() {

    TopAppBar(title = {
        Text(text = "WeatherApp", color = if (isSystemInDarkTheme()) Color.White else darkModeColor)
    }, backgroundColor = if (isSystemInDarkTheme()) darkModeColor else Color.White
    )
}

@Preview
@Composable
fun AppBarPreview() {
    AppBar()
}