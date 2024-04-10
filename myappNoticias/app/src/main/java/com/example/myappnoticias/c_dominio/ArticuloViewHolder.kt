package com.example.myappnoticias.c_dominio

import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Spinner
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myappnoticias.R

class ArticuloViewHolder (itemsView: View) : RecyclerView.ViewHolder(itemsView){

    val img : ImageView = itemsView.findViewById(R.id.image_rv_id_articulo_pantalla_main)
    val titulo1: TextView =itemsView.findViewById(R.id.txtView_titulo1_pantallaMain)
    val autor1: TextView = itemsView.findViewById(R.id.txtView_autor1_pantallaMain)
    val botonAbrir : Button = itemsView.findViewById(R.id.boton_AbrirNoticia)

}