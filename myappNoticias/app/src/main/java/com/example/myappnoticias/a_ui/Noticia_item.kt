package com.example.myappnoticias.a_ui

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.myappnoticias.R

class Noticia_item : AppCompatActivity(){

    override fun onStop() {
        super.onStop()
        Log.d("TAG","onStop-Noticia_item")
    }

    override fun onPause() {
        super.onPause()
        Log.d("TAG","onPause-Noticia_item")
    }

    override fun onResume() {
        super.onResume()
        Log.d("TAG","onResume-Noticia_item")
    }

    override fun onStart() {
        super.onStart()

        var autor = intent.extras!!.getInt("autor")
        var titulo = intent.extras!!.getInt("titulo")
        var descripcion = intent.extras!!.getInt("descripcion")
        var url = intent.extras!!.getInt("url")
        var url_to_image = intent.extras!!.getInt("url_To_Image")
        var publishe_At = intent.extras!!.getInt("publishe_At")
        var content = intent.extras!!.getInt("content")

        Log.d("TAG", "onStart-Noticia_item")

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.noticia_item)




    }

}