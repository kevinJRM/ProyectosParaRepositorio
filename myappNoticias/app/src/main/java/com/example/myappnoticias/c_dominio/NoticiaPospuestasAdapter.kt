package com.example.myappnoticias.c_dominio

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.myappnoticias.R
import com.example.myappnoticias.a_ui.Noticia
import com.example.myappnoticias.b_model.Articulo

class NoticiaPospuestasAdapter : RecyclerView.Adapter<NoticiaPospuestaViewHolder>() {

    private var items : MutableList<Articulo> = ArrayList()

    private lateinit var adapterOpciones : ArrayAdapter<CharSequence>

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoticiaPospuestaViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.noticia_pospuesta_item,parent,false)

        ArrayAdapter.createFromResource(view.context,R.array.opciones_item_noticia_pospuesta,android.R.layout.simple_spinner_item).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            this.adapterOpciones = adapter
        }

        return NoticiaPospuestaViewHolder(view)
    }

    override fun getItemCount(): Int {

        return items.size
    }

    override fun onBindViewHolder(holder: NoticiaPospuestaViewHolder, position: Int) {
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
        holder.titulo1.text = items[position].title

        holder.spinerNoticiaPostItem.adapter = this.adapterOpciones

        holder.spinerNoticiaPostItem.onItemSelectedListener = SpinnerNoticiaPospuesta(holder.itemView.context, items[position])

    }


    fun Update(lista: MutableList<Articulo>){
        items = lista
        this.notifyDataSetChanged()
    }


}