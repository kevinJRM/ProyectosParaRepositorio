package com.example.myappnoticias.b_model

import android.content.Context
import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.myappnoticias.data.ArticulosRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.newSingleThreadContext
import kotlin.coroutines.CoroutineContext

// todos los cambios que ocurran en pantalla seran tomaddos aca de que cambios
// hereda de view model
class ViewModelNoticias : ViewModel(){


    private val TAG = "API-DEMO MainViewModelNoticias"
    private val coroutineContext: CoroutineContext = newSingleThreadContext("demoNoticias")
    private val scope = CoroutineScope(coroutineContext)


    private val noticiasRepo = ArticulosRepository()

    val noticias = MutableLiveData<ArrayList<Articulo>>()
    val notic = ArrayList<Articulo>()

    fun onStart(cont : Context){

        this.actualizarNoticIA(cont, "relevancy")

    }

    fun cambiarTipoNoticia(cont : Context, tipo : String){
        this.actualizarNoticIA(cont, tipo)
    }

    fun setListaArticulosAuxiliar(){
        noticias.postValue(ArrayList<Articulo>())
    }
    private fun actualizarNoticIA(cont : Context, tipo : String) {
        scope.launch {
            kotlin.runCatching {
                Log.d("TAG","onStart-noticiasRepo.getArticulosTopHeadLines - MainViewModelNoticias")
                noticiasRepo.getArticulosTopHeadLines(cont, tipo)
            }.onSuccess {
                Log.d(TAG, "NoticiasArticulos onSuccess")
                noticias.postValue(it)
                notic.addAll(it)
            }.onFailure {
                //var s =  AppDatabase.getInstance(cont).noticiadao().getAll()

                //noticias.postValue(nl)
                Log.e(TAG, "NoticiasArticulos Error: "+ it)
            }
        }
    }
}

