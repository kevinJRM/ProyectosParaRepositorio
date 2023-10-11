package com.example.demonoticias.dominio

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.demonoticias.R

class NoticiasViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView){

    val autor1 : TextView = itemView.findViewById(R.id.txtView_autor1_noticiaAbierta)
    val titulo1 : TextView =     itemView.findViewById(R.id.txtView_titulo1_noticiaAbierta)

}