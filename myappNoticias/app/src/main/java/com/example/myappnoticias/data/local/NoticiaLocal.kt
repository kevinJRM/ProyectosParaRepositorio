package com.example.myappnoticias.data.local

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "noticias")
data class NoticiaLocal (
    @PrimaryKey var titulo : String,
    var nombre : String,
    var description : String,
    var url : String,
    var urlToImage : String,
    var publishedAt : String,
    var content : String)



