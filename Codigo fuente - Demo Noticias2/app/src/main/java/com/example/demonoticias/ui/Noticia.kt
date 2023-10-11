package com.example.demonoticias.ui

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.demonoticias.R
import com.example.demonoticias.dominio.NoticiaAdapter
import com.example.demonoticias.model.MainViewModelArticulo

class Noticia : AppCompatActivity() {

    private lateinit var mainNoticiaModel : MainViewModelArticulo

    lateinit var txt_Texto1 : TextView
    lateinit var txt_Texto2 : TextView
    lateinit var txt_Texto3 : TextView
    lateinit var txt_Texto4 : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.vista_noticia_activity)


        txt_Texto1 = findViewById(R.id.txtView_Autor_ArticuloAbierto)
        txt_Texto2 = findViewById(R.id.txtView_Titulo_ArticuloAbierto)
        txt_Texto3 = findViewById(R.id.txtView_Descripcion_ArticuloAbierto)
        txt_Texto4 = findViewById(R.id.txtView_IDArticuloAbierto)


        mainNoticiaModel = ViewModelProvider(this)[MainViewModelArticulo::class.java]

        mainNoticiaModel.author.observe(this){
            txt_Texto1.text = it
        }
        mainNoticiaModel.title.observe(this){
            txt_Texto2.text = it
        }
        mainNoticiaModel.description.observe(this){
            txt_Texto3.text = it
        }
        mainNoticiaModel.id.observe(this){
            txt_Texto4.text = it
        }

        val create_id = intent.getStringExtra("id").toString()
        val create_name = intent.getStringExtra("name").toString()
        val create_autor = intent.getStringExtra("autor").toString()
        val create_titulo = intent.getStringExtra("titulo").toString()
        val create_descripcion = intent.getStringExtra("descripcion").toString()
        val create_url = intent.getStringExtra("url").toString()
        val create_urlImage = intent.getStringExtra("urlImage").toString()
        val create_publishedAt = intent.getStringExtra("publishedAt").toString()
        val create_contenido = intent.getStringExtra("contenido").toString()
        Log.d("TAG", "resword: ")

        mainNoticiaModel.llenarArticulo(
            create_id,
            create_name,
            create_autor,
            create_titulo,
            create_descripcion,
            create_url,
            create_urlImage,
            create_publishedAt,
            create_contenido)

    }

    override fun onStart() {
        super.onStart()


        Log.d("TAG", "onStart-NoticiaAbierta")

    }

    override fun onPause() {
        super.onPause()
        Log.d("TAG","onPause-NoticiaAbierta")
    }

    override fun onStop() {
        super.onStop()
        Log.d("TAG","onStop-NoticiaAbierta")
    }

    override fun onResume() {
        super.onResume()
        Log.d("TAG","onResume-NoticiaAbierta")
    }

}