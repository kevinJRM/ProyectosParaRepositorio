package com.example.myappnoticias.c_dominio

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.myappnoticias.R
import com.example.myappnoticias.b_model.Articulo
import com.example.myappnoticias.data.local.AppDatabase
import com.example.myappnoticias.data.local.toLocal
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class RecicladorAdaptadorNoticia : RecyclerView.Adapter<NoticiaAbiertaViewHolder>() {

    private var items : MutableList<Articulo> = ArrayList<Articulo>()
    private val scope = CoroutineScope(GlobalScope.coroutineContext)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoticiaAbiertaViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_noticia_abierta,parent,false)

        return NoticiaAbiertaViewHolder(view)
    }


    override fun onBindViewHolder(holder: NoticiaAbiertaViewHolder, position: Int) {
        holder.autorNoticia.text = items[0].author
        holder.tituloNotica.text = items[0].title
        holder.descriptNoticia.text = items[0].description
        holder.contenido.text = items[0].content

        holder.url.text = items[0].url

        holder.botonGuardar.setOnClickListener(){
            scope.launch {
                kotlin.runCatching {

                    AppDatabase.getInstance(it.context).noticiadao().insert(items.get(0).toLocal())
                }.onSuccess {
                    Log.d("TAG","RecicladorAdaptorNoticia-onBindViewHolder - guardado con exito "+it)
                }.onFailure {
                    Log.d("TAG","RecicladorAdaptorNoticia-onBindViewHolder - fallo el guardado "+it)
                }
            }
        }


        try{
            Glide.with(holder.itemView.context)
                .load(items[position].urlToImage)
                .placeholder(R.drawable.image_predeterminado_por_negative_resword)
                .into(holder.img)
        }catch (e: Exception){
            Glide.with(holder.itemView.context)
                .load(" ")
                .placeholder(R.drawable.image_predeterminado_por_negative_resword)
                .into(holder.img)
        }

    }

    override fun getItemCount(): Int {
        return items.size;
    }

    fun Update(lista: MutableList<Articulo>){
        items =lista
        this.notifyDataSetChanged()
    }
}