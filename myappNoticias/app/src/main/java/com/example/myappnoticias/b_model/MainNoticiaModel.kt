package com.example.myappnoticias.b_model

import android.widget.ImageView
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainNoticiaModel : ViewModel() {
    val noticia = MutableLiveData<ArrayList<Articulo>>()

    fun setNoticias(articulo : ArrayList<Articulo>){
        noticia.postValue(articulo)
    }

}