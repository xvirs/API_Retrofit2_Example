package com.example.retrpfit2a.Network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class UserNetwork {

    //buider es para inicializar Retrofit

    val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl("https://jsonplaceholder.typicode.com")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(UserAPI::class.java)
    }
}