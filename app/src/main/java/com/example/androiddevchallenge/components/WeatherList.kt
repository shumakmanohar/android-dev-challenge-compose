package com.example.androiddevchallenge.components

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.androiddevchallenge.data.WeatherWeekData
import com.example.androiddevchallenge.data.londonWeatherList

@Composable
fun WeatherList(List : MutableList<WeatherWeekData>)
{

    LazyColumn{
        itemsIndexed(items = List)
        {index, item ->
            WeatherCard(weatherWeekData = item)
        }
    }
}

@Preview
@Composable
fun PreviewWeatherList() {
   WeatherList(londonWeatherList)
}