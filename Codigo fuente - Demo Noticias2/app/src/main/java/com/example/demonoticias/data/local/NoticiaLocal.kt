package com.example.demonoticias.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "noticias")
data class NoticiaLocal (
    val nombre : String,
    @PrimaryKey val titulo : String
)