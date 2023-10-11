package com.example.demonoticias.dominio

import com.example.demonoticias.data.parametrosRepository

class calcularPropina {

    val parametros = parametrosRepository()

    suspend fun calcular(total : Float, personas : Float) : Float {

        var porcPropina : Float = parametros.getPorcPropina()

        var resultado : Float = (total * (1+porcPropina)) / personas

        return resultado
    }
}