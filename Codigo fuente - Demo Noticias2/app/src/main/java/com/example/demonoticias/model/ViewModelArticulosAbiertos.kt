package com.example.demonoticias.model

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModelArticulosAbiertos : ViewModel() {

    val noticias = MutableLiveData<ArrayList<Articles>>()

    fun onStart(item : ArrayList<Articles>){
        noticias.postValue(item)
    }

}