package com.example.myappnoticias.c_dominio

import android.view.View
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myappnoticias.R

class NoticiaPospuestaViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView){

    val botonAbrir : Button = itemView.findViewById(R.id.boton_abrir_noticia_pospuesta)
    val titulo1 : TextView =     itemView.findViewById(R.id.txtView_titulo1_noticiaAbierta)

    val spinerNoticiaPostItem : Spinner = itemView.findViewById(R.id.spinner_item_noticia_post)

}