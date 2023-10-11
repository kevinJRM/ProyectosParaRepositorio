package com.example.demonoticias.model

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.demonoticias.data.NoticiasArticulosRepository
import com.example.demonoticias.dominio.calcularPropina
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {


    private val calculadora = calcularPropina()

    var totalPorPersona : MutableLiveData<String> = MutableLiveData<String>()

    fun calcular(total: Float, personas: Float ) {

        viewModelScope.launch {
            kotlin.runCatching {
                calculadora.calcular(total, personas)

            }.onSuccess {
                var resultado = it
                totalPorPersona.postValue("salida: ${resultado}")

            }
        }
    }

}