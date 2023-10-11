package com.example.demonoticias.data

import com.example.demonoticias.model.Articles
import com.google.gson.annotations.SerializedName

data class NoticiasData (

    @SerializedName("status")
    val status : String?,
    @SerializedName("totalResults")
    val totalResults : Int?,
    @SerializedName("articles")
    val articles : ArrayList<Articles>?


    )