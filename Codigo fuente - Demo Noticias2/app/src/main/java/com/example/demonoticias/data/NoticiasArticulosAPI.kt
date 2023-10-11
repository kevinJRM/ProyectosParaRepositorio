package com.example.demonoticias.data

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface NoticiasArticulosAPI {
    @GET("/v2/top-headlines")
    fun getUniversity(
        @Query("country") country:String,
        @Query("apiKey") apiKey:String,
    ) : Call<NoticiasData>
}