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

import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.data.WeatherWeekData
import com.example.androiddevchallenge.data.mumbaiWeatherList
import com.example.androiddevchallenge.ui.theme.darkModeColor

@Composable
fun WeatherCard(weatherWeekData: WeatherWeekData) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = if (isSystemInDarkTheme()) darkModeColor else Color.White),
        shape = RoundedCornerShape(0)
    ) {
        Row(
            modifier = Modifier.padding(8.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Text(
                text = weatherWeekData.day,
                modifier = Modifier
                    .wrapContentWidth(Alignment.Start),
                style = MaterialTheme.typography.subtitle1,

            )
            Icon(
                painter = painterResource(id = weatherWeekData.weatherIcon),
                modifier = Modifier
                    .height(40.dp)
                    .align(Alignment.CenterVertically)
                    .wrapContentHeight(Alignment.CenterVertically),
                contentDescription = "${weatherWeekData.temperature}°c and ${
                stringResource(id = weatherWeekData.weatherIcon)} on ${weatherWeekData.day}",
                tint = weatherWeekData.iconTint
            )
            Text(
                text = "${weatherWeekData.temperature}°c",
                modifier = Modifier
                    .wrapContentWidth(Alignment.End),
                style = MaterialTheme.typography.subtitle1
            )
        }
    }
}

@Preview
@Composable
fun PreviewWeatherCard() {
    WeatherCard(mumbaiWeatherList[0])
}
