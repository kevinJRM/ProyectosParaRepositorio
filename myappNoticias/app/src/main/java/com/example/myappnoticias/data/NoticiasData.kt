package com.example.myappnoticias.data

import com.example.myappnoticias.b_model.Articulo
import com.google.gson.annotations.SerializedName

data class NoticiasData (

    @SerializedName("status")
    val status : String?,
    @SerializedName("totalResults")
    val totalResults : Int?,
    @SerializedName("articles")
    val articles : ArrayList<Articulo>?


    )