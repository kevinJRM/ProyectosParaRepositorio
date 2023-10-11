package com.example.demonoticias.dominio

import android.media.Image
import android.view.View
import android.widget.ImageView
import android.widget.Spinner
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.demonoticias.R

class NoticiaArticuloViewHolder (itemsView: View) : RecyclerView.ViewHolder(itemsView){

    val img : ImageView = itemsView.findViewById(R.id.image_rv_id_articulo_pantalla_main)
    val titulo1: TextView =itemsView.findViewById(R.id.txtView_titulo1_pantallaMain)
    val autor1: TextView = itemsView.findViewById(R.id.txtView_autor1_pantallaMain)

    val opcionesSpinner : Spinner = itemsView.findViewById(R.id.spinner_opciones_Item_noticia)

}