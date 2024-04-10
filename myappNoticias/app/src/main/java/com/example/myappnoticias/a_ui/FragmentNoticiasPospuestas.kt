package com.example.myappnoticias.a_ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myappnoticias.R
import com.example.myappnoticias.data.local.AppDatabase
import com.example.myappnoticias.data.local.toLocalo
import com.example.myappnoticias.c_dominio.NoticiaPospuestasAdapter
import com.example.myappnoticias.b_model.ViewModelNoticiasPosuestas
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class FragmentNoticiasPospuestas : AppCompatActivity() {

    lateinit var viewModelArtAbiertos : ViewModelNoticiasPosuestas
    private lateinit var adapter : NoticiaPospuestasAdapter
    private lateinit var rvArticulosAbiertos : RecyclerView
    private lateinit var context : Context
    private val scope = CoroutineScope(GlobalScope.coroutineContext)

    private lateinit var botonInicio : Button
    private lateinit var botonVerMasTarde : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ver_mas_tarde_lista)
        bindView()
        bindViewModel()
        context = this

        botonInicio = findViewById(R.id.boton_inicio)
        botonVerMasTarde = findViewById(R.id.boton_ver_mas_tarde)

        botonInicio.setOnClickListener(){
            finish()
        }

        Log.d("TAG","onCreate-NoticiasAbiertas")

    }


    override fun onStart() {
        super.onStart()
        Log.d("TAG","onStart-NoticiasAbiertas")

        Log.d("TAG", "onStart-listado_Noticias - NoticiasAbiertas")

    }


    override fun onStop() { super.onStop()
        Log.d("TAG","onStop-listado_Noticias - NoticiasAbiertas")
    }
    override fun onPause() { super.onPause()
        Log.d("TAG","onPause-listado_Noticias - NoticiasAbiertas")
    }
    override fun onResume() {
        super.onResume()

        scope.launch {
            kotlin.runCatching {
                AppDatabase.getInstance(context).noticiadao().getAll().toLocalo()
            }.onSuccess {
                viewModelArtAbiertos.onStart( ArrayList( it ))
                Log.d("TAG", "onStart-BaseData exitoso - NoticiasAbiertas")
            }.onFailure {
                Log.d("TAG", "onStart-BaseData fallo - NoticiasAbiertas")
            }
        }

        Log.d("TAG","onResume-listado_Noticias - NoticiasAbiertas")
    }

    private fun bindView(){
        Log.d("TAG","bindView - NoticiasAbiertas")
        rvArticulosAbiertos = findViewById(R.id.rv_NoticiasAbiertas)
        rvArticulosAbiertos.layoutManager = LinearLayoutManager(this)

        adapter = NoticiaPospuestasAdapter()

        rvArticulosAbiertos.adapter = adapter

    }

    private fun bindViewModel(){
        Log.d("TAG","bindViewModel - NoticiasAbiertas")
        viewModelArtAbiertos = ViewModelProvider(this)[ViewModelNoticiasPosuestas::class.java]
        viewModelArtAbiertos.noticias.observe(this){
            adapter.Update(it)
        }
    }


}