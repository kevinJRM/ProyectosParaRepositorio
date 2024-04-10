package com.example.myappnoticias.data

import android.content.Context
import com.example.myappnoticias.b_model.Articulo

class ArticulosRepository() {

    private val articulosDS = ArticulosDataSource()

    private fun revomerArtVacios(artp : ArrayList<Articulo>) : ArrayList<Articulo>{
        var art = artp

        var i=0
        while (i<art.size){
            if(art[i].title.equals("[Removed]") == true) {
                art.remove(art[i])
            }
            i+= 1
        }

        return art
    }
    suspend fun getArticulosTopHeadLines(cont: Context, tipo: String) : ArrayList<Articulo>{
        return this.revomerArtVacios(articulosDS.getArticulosTopHeadLines(cont, tipo))
    }
}