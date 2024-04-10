package com.example.myappnoticias.c_dominio

import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myappnoticias.R

class NoticiaAbiertaViewHolder  (itemsView: View) : RecyclerView.ViewHolder(itemsView) {

    val img : ImageView = itemsView.findViewById(R.id.imagen_View_Noticia)
    val autorNoticia : TextView = itemsView.findViewById(R.id.txtView_Autor_ArticuloAbierto)
    val tituloNotica : TextView = itemsView.findViewById(R.id.txtView_Titulo_ArticuloAbierto)
    val descriptNoticia : TextView = itemsView.findViewById(R.id.txtView_Descripcion_ArticuloAbierto)
    val contenido : TextView = itemsView.findViewById(R.id.content_ArticuloAbierto)
    val url : TextView = itemsView.findViewById(R.id.txt_url_pagina)
    val botonGuardar : Button= itemsView.findViewById(R.id.boton_guardar_favoritos)

    val contx = itemsView.context
}