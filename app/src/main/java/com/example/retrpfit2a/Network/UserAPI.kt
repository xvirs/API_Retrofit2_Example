package com.example.retrpfit2a.Network

import retrofit2.http.GET

interface UserAPI {

    @GET("posts/1")
    suspend fun getPost(): User

    @GET("posts")
    suspend fun getPosts(): List<User>

}