package com.example.demonoticias.data

import android.content.Context
import com.example.demonoticias.model.Articles

class NoticiasArticulosRepository() {

    private val universitiDS = NoticiasArticulosDataSource()

    suspend fun getUniversities() : ArrayList<Articles>{
        return universitiDS.getUniversities()
    }
}