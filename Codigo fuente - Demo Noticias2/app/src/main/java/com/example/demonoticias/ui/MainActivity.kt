package com.example.demonoticias.ui

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.demonoticias.R
import com.example.demonoticias.dominio.NoticiaAdapter
import com.example.demonoticias.model.MainViewModelNoticias
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {

    private lateinit var viewModelNoticias : MainViewModelNoticias
    private lateinit var rvArticulosNoticias : RecyclerView
    private lateinit var adapter : NoticiaAdapter
    private val progresDialog by lazy { CustomProgressDialog(this)}

    private lateinit var firebaseAuth : FirebaseAuth


    private lateinit var botonAbrirNoticia : Button
    private lateinit var botonNociasAbierta : Button
    private lateinit var botonAdapterNoticiaAbrir : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        bindView()
        bindViewModel()

        //firebaseAuth = FirebaseAuth.getInstance()

        botonNociasAbierta = findViewById(R.id.botonNoticiasAbiertas)

        botonNociasAbierta.setOnClickListener(){
            Handler(Looper.getMainLooper()).post {
                var intent = Intent(this, NoticiasAbiertas::class.java)
                startActivity(intent)
            }
        }
    }

    override fun onStart() {
        super.onStart()

        progresDialog.start("recuperando datos...")

        viewModelNoticias.onStart()
        //Log.d("TAG","onStart : "+viewModel.a())
        Log.d("TAG", "onStart-PantallaMain")

    }

    override fun onResume() {
        super.onResume()
        Log.d("TAG","onResume-PantallaMain")
    }

    override fun onPause() {
        super.onPause()
        Log.d("TAG","onPause-PantallaMain")
    }

    override fun onStop() {
        super.onStop()
        Log.d("TAG","onStop-PantallaMain")
    }

    private fun bindView(){
        rvArticulosNoticias = findViewById(R.id.rvArticulos_noticias)

        rvArticulosNoticias.layoutManager = GridLayoutManager(this,2)

        adapter = NoticiaAdapter()
        adapter.darContexto(this)

        rvArticulosNoticias.adapter = adapter
    }

    private fun bindViewModel(){
        viewModelNoticias = ViewModelProvider(this)[MainViewModelNoticias()::class.java]

        viewModelNoticias.noticias.observe(this){
            adapter.Update(it)
            progresDialog.stop()
        }

    }

}

