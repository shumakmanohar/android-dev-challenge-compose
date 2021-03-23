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
package com.example.androiddevchallenge.components

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androiddevchallenge.data.WeatherImgData
import com.example.androiddevchallenge.data.weatherImgDataList

@Composable
fun WeatherText(
    weatherData: WeatherImgData,
    weatherDataIndex: Int,
    cityName: String,
    onCityNameChange: (String) -> Unit,
    onCountryNameChange: (String) -> Unit,
    onWeatherDataListChange: (Int) -> Unit
) {

    Box(
        modifier = Modifier
            .padding(10.dp)
            .clickable(
                onClick = {
                    onCityNameChange(weatherData.cityName) // Change City
                    onCountryNameChange(weatherData.countryName) // Change Country
                    onWeatherDataListChange(weatherDataIndex) // Change Weather DataList
                    Log.i("Weather", "Clicked")
                }
            )
    ) {
        BgImage(weatherData.cityImg)
        Column(
            modifier = Modifier
                .width(200.dp)
                .height(300.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = weatherData.cityName,
                textAlign = TextAlign.Center,
                color = Color.White,
                fontWeight = FontWeight.Light,
                fontSize = 18.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 8.dp)
            )
            Spacer(modifier = Modifier.padding(35.dp))
            Column(
                Modifier
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = weatherData.weatherIcon),
                    contentDescription = "null"
                )
                Text(
                    text = "${weatherData.temperature}°c",
                    textAlign = TextAlign.Center,
                    color = Color.White,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 28.sp,
                    letterSpacing = 1.sp,
                    modifier = Modifier
                        .fillMaxWidth()
                )
            }
        }
    }
}
@Composable
fun ParameterizedComposable() {
    // Passing in the First DummyData
    WeatherText(weatherImgDataList[0], 0, "London", {}, {}, {})
}
@Preview(showBackground = true)
@Composable
fun WeatherText_Preview() {
    ParameterizedComposable()
}
