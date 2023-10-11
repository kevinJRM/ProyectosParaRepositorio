package com.example.demonoticias.model

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModelArticulo : ViewModel() {

    var id : MutableLiveData<String> = MutableLiveData<String>()
    var name : MutableLiveData<String> = MutableLiveData<String>()
    var author : MutableLiveData<String> = MutableLiveData<String>()
    var title : MutableLiveData<String> = MutableLiveData<String>()
    var description : MutableLiveData<String> = MutableLiveData<String>()
    var url : MutableLiveData<String> = MutableLiveData<String>()
    var urlToImage : MutableLiveData<String> = MutableLiveData<String>()
    var publishedAt : MutableLiveData<String> = MutableLiveData<String>()
    var content : MutableLiveData<String> = MutableLiveData<String>()

    fun llenarArticulo(
        txtView_id: String?,
        txtView_name: String?,
        txtView_author: String?,
        txtView_title: String?,
        txtView_description: String?,
        txtView_url:String,
        txtView_urlToImage:String,
        txtView_publishedAt:String,
        txtView_content:String){

        this.id.postValue(txtView_id)
        this.name.postValue(txtView_name)
        this.author.postValue(txtView_author)
        this.title.postValue(txtView_title)
        this.description.postValue(txtView_description)
        this.url.postValue(txtView_url)
        this.urlToImage.postValue(txtView_urlToImage)
        this.publishedAt.postValue(txtView_publishedAt)
        this.content.postValue(txtView_content)
    }

}