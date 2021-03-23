package com.example.androiddevchallenge.data

import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.ui.theme.Rainy
import com.example.androiddevchallenge.ui.theme.Sunny
import com.example.androiddevchallenge.ui.theme.Thunder
import com.example.androiddevchallenge.ui.theme.Windy


var weatherImgDataList = mutableListOf(
    //London
    WeatherImgData("London","England",10, R.drawable.london_clocktower,R.drawable.windy),
    //Paris
    WeatherImgData("Paris ","France",14,R.drawable.paris,R.drawable.thunder),
    //Delhi
    WeatherImgData("Dubai","UAE",28,R.drawable.burjalarab,R.drawable.rainy),
    //Mumbai
    WeatherImgData("Mumbai","India",23, R.drawable.mumbai,R.drawable.sunny),
)

var londonWeatherList = mutableListOf(
    WeatherWeekData("Mon",R.drawable.sunny,Sunny,22),
    WeatherWeekData("Tue", R.drawable.windy, Windy,23),
    WeatherWeekData("Wed", R.drawable.sunny,Sunny,23),
    WeatherWeekData("Thu", R.drawable.thunder, Thunder,13),
    WeatherWeekData("Fri",R.drawable.rainy, Rainy,24),
    WeatherWeekData("Sat", R.drawable.windy,Windy,23),
    WeatherWeekData("Sun", R.drawable.sunny,Sunny,24),
)

var parisWeatherList = mutableListOf(
    WeatherWeekData("Mon",R.drawable.rainy,Sunny,19),
    WeatherWeekData("Tue",R.drawable.rainy, Rainy,18),
    WeatherWeekData("Wed", R.drawable.thunder, Thunder,20),
    WeatherWeekData("Thu", R.drawable.thunder, Thunder,18),
    WeatherWeekData("Fri", R.drawable.windy, Windy,19),
    WeatherWeekData("Sat", R.drawable.windy,Windy,21),
    WeatherWeekData("Sun", R.drawable.sunny,Sunny,23),
)

var delhiWeatherList = mutableListOf(
    WeatherWeekData("Mon", R.drawable.sunny,Sunny,10),
    WeatherWeekData("Tue", R.drawable.sunny,Sunny,15),
    WeatherWeekData("Wed", R.drawable.windy,Windy,22),
    WeatherWeekData("Thu", R.drawable.rainy,Rainy,19),
    WeatherWeekData("Fri", R.drawable.thunder,Thunder,19),
    WeatherWeekData("Sat", R.drawable.thunder,Thunder,21),
    WeatherWeekData("Sun", R.drawable.windy,Windy,22),
)

var mumbaiWeatherList = mutableListOf(
    WeatherWeekData("Mon", R.drawable.sunny,Sunny,28),
    WeatherWeekData("Tue",R.drawable.rainy,Rainy,23),
    WeatherWeekData("Wed", R.drawable.sunny,Sunny,24),
    WeatherWeekData("Thu", R.drawable.sunny,Sunny,20),
    WeatherWeekData("Fri", R.drawable.windy,Windy,19),
    WeatherWeekData("Sat", R.drawable.windy,Windy,30),
    WeatherWeekData("Sun", R.drawable.thunder,Thunder,28),
)

var allWeatherList = mutableListOf(
    londonWeatherList,
    parisWeatherList,
    delhiWeatherList,
    mumbaiWeatherList
)