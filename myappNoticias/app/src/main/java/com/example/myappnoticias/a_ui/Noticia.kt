package com.example.myappnoticias.a_ui

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.myappnoticias.R
import com.example.myappnoticias.b_model.Articulo
import com.example.myappnoticias.b_model.MainNoticiaModel
import com.example.myappnoticias.b_model.Source
import com.example.myappnoticias.c_dominio.NoticiaAdapter
import com.example.myappnoticias.c_dominio.RecicladorAdaptadorNoticia
import com.example.myappnoticias.data.local.AppDatabase
import com.example.myappnoticias.data.local.toLocal
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class Noticia : AppCompatActivity() {

    private lateinit var mainNoticiaModel : MainNoticiaModel
    private lateinit var rvArticulosNoticias : RecyclerView
    private lateinit var adapter : RecicladorAdaptadorNoticia
    private var articuloAbierto = ArrayList<Articulo>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.reciclador)

        rvArticulosNoticias = findViewById(R.id.recicleyViewNoticiaAbierta)

        rvArticulosNoticias.layoutManager = GridLayoutManager(this, 1)

        adapter = RecicladorAdaptadorNoticia()

        rvArticulosNoticias.adapter = adapter


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


