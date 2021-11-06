package com.example.project1

import com.squareup.moshi.Json

data class DogPhoto(
    @Json(name = "message") val message: String,
    @Json(name = "status") val status: String
)

