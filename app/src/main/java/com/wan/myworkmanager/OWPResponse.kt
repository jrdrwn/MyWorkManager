package com.wan.myworkmanager

import com.squareup.moshi.Json

data class OWPResponse(
    val id: Int,
    val name: String,
    @Json(name = "weather")
    val weatherList: List<Weather>,
    val main: Main,
)

data class Weather(
    val main: String,
    val description: String
)

data class Main(
    @Json(name = "temp")
    val temperature: Double
)
