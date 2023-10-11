package com.example.demonoticias.ui

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.example.demonoticias.R
import com.example.demonoticias.dominio.NoticiasAbiertasAdapter
import com.example.demonoticias.model.Articles
import com.example.demonoticias.model.Source
import com.example.demonoticias.model.ViewModelArticulosAbiertos

class NoticiasAbiertas : AppCompatActivity() {

    //dependencias
    lateinit var viewModelArtAbiertos : ViewModelArticulosAbiertos
    private lateinit var adapter : NoticiasAbiertasAdapter
    private lateinit var rvArticulosAbiertos : RecyclerView

    private val lista = ArrayList<Articles>()

    override fun onStop() {
        super.onStop()
        Log.d("TAG","onStop-listado_NoticiasAbiertas")
    }

    override fun onPause() {
        super.onPause()
        Log.d("TAG","onPause-listado_NoticiasAbiertas")
    }

    override fun onResume() {
        super.onResume()
        Log.d("TAG","onResume-listado_NoticiasAbiertas")
    }

    override fun onStart() {
        super.onStart()

        val create_id = intent.getStringExtra("id").toString()
        val create_name = intent.getStringExtra("name").toString()
        val create_autor = intent.getStringExtra("autor").toString()
        val create_titulo = intent.getStringExtra("titulo").toString()
        val create_descripcion = intent.getStringExtra("descripcion").toString()
        val create_url = intent.getStringExtra("url").toString()
        val create_urlImage = intent.getStringExtra("urlImage").toString()
        val create_publishedAt = intent.getStringExtra("publishedAt").toString()
        val create_contenido = intent.getStringExtra("contenido").toString()

        var art = Articles(Source(create_id,create_name),create_autor,create_titulo,create_descripcion,create_url,create_urlImage,create_publishedAt,create_contenido)

        if(intent.getStringExtra("id").toString() != null){
            lista.add(art)
            viewModelArtAbiertos.onStart(lista)
        }

        //model.onStart()
        //Log.d("TAG","onStart : "+viewModel.a())
        Log.d("TAG", "onStart-listado_NoticiasAbiertas")

    }

    private fun bindView(){
        rvArticulosAbiertos = findViewById(R.id.rv_NoticiasAbiertas)
        rvArticulosAbiertos.layoutManager = LinearLayoutManager(this)

        adapter = NoticiasAbiertasAdapter()

        rvArticulosAbiertos.adapter = adapter
    }

    private fun bindViewModel(){
        viewModelArtAbiertos = ViewModelProvider(this)[ViewModelArticulosAbiertos::class.java]
        viewModelArtAbiertos.noticias.observe(this){
            adapter.Update(it)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.noticias_abiertas_listado)

        Log.d("TAG","sasdfdsags")

        bindView()

        bindViewModel()


    }
}