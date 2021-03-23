package com.example.androiddevchallenge.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.R

@Composable
fun BgImage(imgSrc:Int) {
    Image(
        painter = painterResource(id = imgSrc), contentDescription = "Pic Description",
        modifier = Modifier
            .width(200.dp)
            .height(300.dp)
            .clip(shape = RoundedCornerShape(10.dp))
            .background(brush = Brush.verticalGradient(colors = listOf(Black, Black)))
            .alpha(0.5f),
        contentScale = ContentScale.Crop
    )
}
@Preview(showBackground = true)
@Composable
fun BgImage_Preview() {
    BgImage(R.drawable.london_clocktower)
}
