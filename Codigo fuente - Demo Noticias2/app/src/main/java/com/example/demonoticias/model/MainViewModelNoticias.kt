package com.example.demonoticias.model

import android.content.Context
import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.demonoticias.data.NoticiasArticulosRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.newSingleThreadContext
import kotlin.coroutines.CoroutineContext

// hereda de view model
class MainViewModelNoticias : ViewModel(){


    private val TAG = "API-DEMO MainViewModelNoticias"
    private val coroutineContext: CoroutineContext = newSingleThreadContext("demoNoticias")
    private val scope = CoroutineScope(coroutineContext)


    private val noticiasRepo = NoticiasArticulosRepository()

    val noticias = MutableLiveData<ArrayList<Articles>>()

    fun onStart(){

        scope.launch {
            kotlin.runCatching {
                noticiasRepo.getUniversities()
            }.onSuccess {
                Log.d(TAG, "NoticiasArticulos onSuccess")
                noticias.postValue(it)
            }.onFailure {
                Log.e(TAG, "NoticiasArticulos Error: "+ it)
            }
        }

    }
}

