package com.example.demonoticias.dominio

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.demonoticias.R
import com.example.demonoticias.model.Articles

class NoticiasAbiertasAdapter : RecyclerView.Adapter<NoticiasViewHolder>() {

    private var items : MutableList<Articles> = ArrayList<Articles>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoticiasViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.noticia_abierta_item,parent,false)

        return NoticiasViewHolder(view)
    }

    override fun getItemCount(): Int {

        return items.size
    }

    override fun onBindViewHolder(holder: NoticiasViewHolder, position: Int) {
        holder.autor1.text = items[position].author
        holder.titulo1.text = items[position].title
    }


    fun Update(lista: MutableList<Articles>){
        items = lista
        this.notifyDataSetChanged()
    }


}