package com.example.androiddevchallenge.data

import androidx.compose.ui.graphics.Color


data class WeatherImgData(
    var  cityName:String,
    var countryName:String,
    var  temperature:Int,
    var cityImg:Int,
    var weatherIcon:Int
)

data class WeatherWeekData(
    var day:String,
    var weatherIcon:Int,
    var iconTint: Color,
    var temperature: Int
)
