package com.example.project1

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET

object DogPhotoAPI {
    private const val BASE_URL = "https://dog.ceo/api/"

    private val networkLoggingInterceptor =
        HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)

    private val retrofit = Retrofit.Builder()
        .client(OkHttpClient.Builder().addInterceptor(networkLoggingInterceptor).build())
        .addConverterFactory(MoshiConverterFactory.create())
        .baseUrl(BASE_URL)
        .build()


    interface DogPhotoService {
        @GET("breeds/image/random")
        suspend fun getRandomDogPhoto(): DogPhoto
    }

    object DogApi {
        val retrofitService: DogPhotoService by lazy {
            DogPhotoAPI.retrofit.create(DogPhotoService::class.java)
        }
    }
}
