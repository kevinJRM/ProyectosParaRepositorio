package com.example.myappnoticias.c_dominio

import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.myappnoticias.R
import com.example.myappnoticias.a_ui.Noticia
import com.example.myappnoticias.b_model.Articulo


// el adaptador hereda un adaptador con el holder como tipo de clase a usar
class NoticiaAdapter(var contexto : Context) : RecyclerView.Adapter<ArticuloViewHolder>(){ // con lo que hereda del recicley view junto con ese parametro conoce esa vista, el tipo de vista que armamos

    // lo que ira cambiando en la pantalla
    private var items : MutableList<Articulo> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticuloViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.noticia_item,parent,false)

        return ArticuloViewHolder(view)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ArticuloViewHolder, position: Int) {

        holder.autor1.text = items[position].author
        holder.titulo1.text = items[position].title

        holder.botonAbrir.setOnClickListener(){
            val intent = Intent(it.context, Noticia::class.java)

            var noticia = items[position].source?.id.toString()+"|"+
                    items[position].source?.name.toString()+"|"+
                    items[position].author.toString()+"|"+
                    items[position].title.toString()+"|"+
                    items[position].description.toString()+"|"+
                    items[position].url.toString()+"|"+
                    items[position].urlToImage.toString()+"|"+
                    items[position].publishedAt.toString()+"|"+
                    items[position].content.toString()

            intent.putExtra("articulo",noticia)

            it.context.startActivity(intent)

        }

    }

    fun Update(lista: MutableList<Articulo>){
        items = lista
        this.notifyDataSetChanged()
    }
}

