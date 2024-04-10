package com.example.myappnoticias.data

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ArticulosTopHeadLinesAPI {

    @GET("/v2/top-headlines")
    fun getArticulosTopHeadLines(
        @Query("country") country:String,
        @Query("apiKey") apiKey:String,
    ) : Call<NoticiasData>

    @GET("/v2/everything")
    fun getArticulosEverything(
        @Query("q") q:String,
        @Query("sortBy") sortBy:String,
        @Query("apiKey") apiKey:String
    ) : Call<NoticiasData>
}

