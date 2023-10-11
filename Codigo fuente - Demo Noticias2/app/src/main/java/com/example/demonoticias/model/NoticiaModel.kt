package com.example.demonoticias.model

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class NoticiaModel : ViewModel() {

    private var source : MutableLiveData<Source> = MutableLiveData<Source>()
    private var autor : MutableLiveData<String> = MutableLiveData<String>()
    private var titulo : MutableLiveData<String> = MutableLiveData<String>()
    private var descripcion : MutableLiveData<String> = MutableLiveData<String>()
    private var url : MutableLiveData<String> = MutableLiveData<String>()
    private var url_To_Image : MutableLiveData<String> = MutableLiveData<String>()
    private var publishe_At : MutableLiveData<String> = MutableLiveData<String>()
    private var content : MutableLiveData<String> = MutableLiveData<String>()


    fun abrirNoticia(){

        autor.postValue("")
        titulo.postValue("")
        descripcion.postValue("")
        url.postValue("")
        url_To_Image.postValue("")
        publishe_At.postValue("")
        content.postValue("")

    }

}