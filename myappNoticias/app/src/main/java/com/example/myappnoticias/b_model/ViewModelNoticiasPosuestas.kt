package com.example.myappnoticias.b_model

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModelNoticiasPosuestas : ViewModel() {

    val noticias = MutableLiveData<ArrayList<Articulo>>()

    //
    fun onStart(item : ArrayList<Articulo>){
        noticias.postValue(item)
    }

}