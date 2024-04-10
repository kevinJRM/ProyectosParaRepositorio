package com.example.myappnoticias.a_ui

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myappnoticias.R
import com.example.myappnoticias.b_model.Articulo
import com.example.myappnoticias.c_dominio.NoticiaAdapter
import com.example.myappnoticias.b_model.ViewModelNoticias
import com.google.firebase.auth.FirebaseAuth
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.GlobalScope.coroutineContext


class FragmentNoticiasMain : AppCompatActivity() {


    private lateinit var viewModelNoticias : ViewModelNoticias
    private lateinit var rvArticulosNoticias : RecyclerView
    private lateinit var adapter : NoticiaAdapter
    private val progresDialog by lazy { this?.let { CustomProgressDialog(it) } }//by lazy { CustomProgressDialog(this)}

    private lateinit var firebaseAuth : FirebaseAuth

    private lateinit var botonRelevantes : Button
    private lateinit var botonTendencias : Button
    private lateinit var botonPublicados : Button

    private lateinit var botonInicio : Button
    private lateinit var botonVerMasTarde : Button


    override fun onCreate(savedInstanceState: Bundle?) { super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("TAG","onCreate - MainActivity")

        botonRelevantes = findViewById(R.id.boton_relevantes)
        botonTendencias = findViewById(R.id.boton_tendencias)
        botonPublicados = findViewById(R.id.boton_publicados)

        botonInicio = findViewById(R.id.boton_inicio)
        botonVerMasTarde = findViewById(R.id.boton_ver_mas_tarde)

        botonRelevantes.setOnClickListener(){
            viewModelNoticias.cambiarTipoNoticia(this,"relevancy")
        }

        botonTendencias.setOnClickListener(){
            viewModelNoticias.cambiarTipoNoticia(this,"popularity")
        }

        botonPublicados.setOnClickListener(){
            viewModelNoticias.cambiarTipoNoticia(this,"publishedAt")
        }

        botonVerMasTarde.setOnClickListener(){
            var intent = Intent(this, FragmentNoticiasPospuestas::class.java)
            startActivity(intent)
        }


        bindView()
        bindViewModel()
    }

    override fun onStart() { super.onStart()

        progresDialog?.start("Recuperando datos...")

        viewModelNoticias.onStart(this)
        Log.d("TAG", "onStart - MainActivity")
    }

    override fun onResume() { super.onResume()
        progresDialog?.stop()
        Log.d("TAG","onResume - MainActivity") }

    override fun onPause() { super.onPause()
        Log.d("TAG","onPause - MainActivity") }

    override fun onStop() { super.onStop()
        Log.d("TAG","onStop - MainActivity") }




    private fun bindView(){
        rvArticulosNoticias = findViewById(R.id.rvArticulos_noticias)

        rvArticulosNoticias.layoutManager = GridLayoutManager(this,2)

        adapter = NoticiaAdapter(this)

        rvArticulosNoticias.adapter = adapter
    }

    private fun bindViewModel(){
        Log.d("TAG","bindViewModel - MainActivity")
        viewModelNoticias = ViewModelProvider(this)[ViewModelNoticias()::class.java]

        viewModelNoticias.noticias.observe(this){
            adapter.Update(it)
            Log.d("TAG","Detener Dialog")
            progresDialog?.stop()
        }

    }

}

