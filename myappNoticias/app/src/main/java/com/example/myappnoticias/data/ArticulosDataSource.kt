package com.example.myappnoticias.data


import android.content.Context
import android.util.Log
import com.example.myappnoticias.data.local.toLocal
import com.example.myappnoticias.b_model.Articulo
import com.example.myappnoticias.data.local.AppDatabase
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory



class ArticulosDataSource() {

    private val _BASE_URL : String= "https://newsapi.org/"
    private val TAG = "API-DEMO"

    suspend fun getArticulosTopHeadLines(cont : Context, tipo : String) : ArrayList<Articulo>{
        val api = Retrofit.Builder()
            .baseUrl(_BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(ArticulosTopHeadLinesAPI::class.java) // y aca se usa la interfaz
        Log.d("TAG","api.getArticulosTopHeadLines().execution")
        var result: Response<NoticiasData>? = null

        result = api.getArticulosEverything("argentina",tipo,"e6fdb0ec51e74d31a16dd11a61070286").execute()


        return if (result?.isSuccessful?:false){
            Log.d(TAG, "Resultado Exitoso")
            result?.body()?.articles  ?: ArrayList<Articulo>()
        }else{
            Log.e(TAG, "Error en llamdo API: "+result?.message())
            ArrayList<Articulo>()
        }
    }


}