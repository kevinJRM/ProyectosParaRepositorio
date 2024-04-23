package com.example.myappnoticias.a_ui

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myappnoticias.R
import com.example.myappnoticias.b_model.Articulo
import com.example.myappnoticias.b_model.MainNoticiaModel
import com.example.myappnoticias.b_model.Source
import com.example.myappnoticias.c_dominio.NoticiaAbiertaAdaptador

class Noticia : AppCompatActivity() {

    private lateinit var mainNoticiaModel : MainNoticiaModel
    private lateinit var rvArticulosNoticias : RecyclerView
    private lateinit var adapter : NoticiaAbiertaAdaptador
    private var articuloAbierto = ArrayList<Articulo>()

    //private lateinit var botonAtras : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_despliegue_noticia_abierta)

        //botonAtras = findViewById(R.id.boton_atras_noticia_abierta)

        rvArticulosNoticias = findViewById(R.id.recicleyViewNoticiaAbierta)

        rvArticulosNoticias.layoutManager = GridLayoutManager(this, 1)

        adapter = NoticiaAbiertaAdaptador()

        rvArticulosNoticias.adapter = adapter

        /*botonAtras.setOnClickListener(){
            finish()
        }*/

        //------------------------------------------------------------------------------------------
        val articulo = intent.getStringExtra("articulo").toString().split("|")

        Log.d("TAG", "onCreate - Noticia")

        this.articuloAbierto.add(
            Articulo(
                Source(
                    articulo.get(0),
                    articulo.get(1)
                ),
                articulo.get(2),
                articulo.get(3),
                articulo.get(4),
                articulo.get(5),
                articulo.get(6),
                articulo.get(7),
                articulo.get(8)
            )
        )

        Log.d("TAG","Noticia - llego articulo "+articulo.get(4))

        mainNoticiaModel = ViewModelProvider(this)[MainNoticiaModel::class.java]

        mainNoticiaModel.noticia.observe(this){
            adapter.Update(it)
        }
        adapter.indicadorCierre.observe(this){
            finish()
        }

    }

    override fun onStart() {
        super.onStart()

        mainNoticiaModel.setNoticias(this.articuloAbierto)


        Log.d("TAG", "onStart - Noticia")

    }

    override fun onPause() {
        super.onPause()
        Log.d("TAG","onPause - Noticia")
    }

    override fun onStop() {
        super.onStop()
        Log.d("TAG","onStop - Noticia")
    }

    override fun onResume() {
        super.onResume()
        Log.d("TAG","onResume - Noticia")
    }

}


