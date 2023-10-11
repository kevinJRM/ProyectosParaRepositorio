package com.example.demonoticias.data

import kotlinx.coroutines.delay

class parametrosRepository {

    val ds = parametrosDataSource()
    suspend fun getPorcPropina() : Float {
        delay(5000)
        // j
        return 0.10f
    }

}