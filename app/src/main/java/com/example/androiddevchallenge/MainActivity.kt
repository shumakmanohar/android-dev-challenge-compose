/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.components.AppBar
import com.example.androiddevchallenge.components.HeaderTag
import com.example.androiddevchallenge.components.WeatherList
import com.example.androiddevchallenge.components.WeatherText
import com.example.androiddevchallenge.data.allWeatherList
import com.example.androiddevchallenge.data.weatherImgDataList
import com.example.androiddevchallenge.ui.theme.MyTheme
import com.example.androiddevchallenge.ui.theme.darkModeColor
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyTheme {
                MyApp()
            }
        }
    }
}

// Start building your app here!
// Start building your app here!
@Composable
fun MyApp() {
    Surface(color = MaterialTheme.colors.background) {
        Column(
            Modifier
                .background(color = if (isSystemInDarkTheme()) darkModeColor else Color.White)
                .fillMaxWidth()
        ) {
            // Using States to Save the Data
            var countryName by remember { mutableStateOf("England") }
            var cityName by remember { mutableStateOf("London") }
            var weatherDataListState by remember { mutableStateOf(allWeatherList[0]) }
            AppBar()
            Spacer(modifier = Modifier.padding(10.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .horizontalScroll(rememberScrollState())
            ) {
                weatherImgDataList.forEachIndexed { index, weatherImgData ->
                    WeatherText(
                        weatherImgData, index, cityName,
                        onCityNameChange = {
                            cityName = it
                        },
                        onCountryNameChange = {
                            countryName = it
                        },
                        onWeatherDataListChange = {
                            weatherDataListState = allWeatherList[it]
                        }
                    )
                }
            }
            Spacer(Modifier.padding(10.dp))
            HeaderTag(cityName = cityName, countryName = countryName)
            Spacer(Modifier.padding(10.dp))
            WeatherList(weatherDataListState)
        }
    }
}

@Preview("Light Theme")
@Composable
fun LightPreview() {
    MyTheme {
        MyApp()
    }
}

@Preview("Dark Theme")
@Composable
fun DarkPreview() {
    MyTheme(darkTheme = true) {
        MyApp()
    }
}
