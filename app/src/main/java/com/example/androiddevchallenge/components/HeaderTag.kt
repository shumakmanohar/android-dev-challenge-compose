package com.example.androiddevchallenge.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.ui.theme.gradientFColor

@Composable
fun HeaderTag(cityName:String,countryName:String) {



        Column(Modifier.fillMaxWidth())
        {
            Text(text = cityName,
                style= MaterialTheme.typography.h6,
                color = gradientFColor,
                modifier = Modifier.padding(start = 10.dp,bottom = 6.dp)
            )
            Text(text = countryName,
                style= MaterialTheme.typography.body1,
                modifier = Modifier.padding(start = 10.dp))
        }





}



@Preview
@Composable
fun HeaderTagPreview() {
    HeaderTag(cityName = "London", countryName = "England")
}
