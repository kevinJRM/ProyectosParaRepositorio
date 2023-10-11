package com.example.demonoticias.dominio

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.Spinner
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.demonoticias.R
import com.example.demonoticias.model.Articles
import com.example.demonoticias.ui.MainActivity


// el adaptador hereda un adaptador con el holder como tipo de clase a usar
class NoticiaAdapter : RecyclerView.Adapter<NoticiaArticuloViewHolder>(){ // con lo que hereda del recicley view junto con ese parametro conoce esa vista, el tipo de vista que armamos

    var items : MutableList<Articles> = ArrayList<Articles>()
    lateinit var contexto : MainActivity
    //lateinit var spopciones : SpinnerActi

    //lateinit var ff : Spinner

    fun darContexto(mainActivity: MainActivity) {
        contexto = mainActivity
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoticiaArticuloViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.noticia_item_presentado,parent,false)
        //spopciones = SpinnerActi()
        return NoticiaArticuloViewHolder(view)
    }

    override fun getItemCount(): Int {

        return items.size
    }

    override fun onBindViewHolder(holder: NoticiaArticuloViewHolder, position: Int) {

        holder.autor1.text = items[position].author
        holder.titulo1.text = items[position].title

        ArrayAdapter.createFromResource(
            holder.itemView.context,
            R.array.opciones_item_noticia,
            android.R.layout.simple_spinner_item
        ).also { adapter ->

            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

            holder.opcionesSpinner.adapter = adapter
        }

        var Articulo = ArrayList<String>()
        Articulo.add(items[position].source?.id.toString())
        Articulo.add(items[position].source?.name.toString())
        Articulo.add(items[position].author.toString())
        Articulo.add(items[position].title.toString())
        Articulo.add(items[position].description.toString())
        Articulo.add(items[position].url.toString())
        Articulo.add(items[position].urlToImage.toString())
        Articulo.add(items[position].publishedAt.toString())
        Articulo.add(items[position].content.toString())
        //spopciones.cargarArticuloSelect(contexto,f, holder.opcionesSpinner)
        //spopciones.onItemSelected()

        //ff = holder.opcionesSpinner

        holder.opcionesSpinner.onItemSelectedListener = SpinnerActi(Articulo)

        try{
        //holder es el contenedor de la vista, viewHolder/contenedor de la vista el "NoticiaViewHoler" el holder tiene una vista *tiene un itemView del recicleyView/ListaReciclable*
            Glide.with(holder.itemView.context)
                .load(items[position].urlToImage)//"https://s.yimg.com/uu/api/res/1.2/.JQHnpmgIB2uWWfFRC_.sg--~B/Zmk9ZmlsbDtoPTYzMDtweW9mZj0wO3c9MTIwMDthcHBpZD15dGFjaHlvbg--/https://media-mbst-pub-ue1.s3.amazonaws.com/creatr-uploaded-images/2023-07/119235f0-19af-11ee-bfdf-d2d22375f6a9.cf.jpg")
                .placeholder(R.drawable.image_predeterminado_por_negative_resword)
                .into(holder.img)
        }catch (e: Exception){
            Glide.with(holder.itemView.context)
                .load(" ")//"https://s.yimg.com/uu/api/res/1.2/.JQHnpmgIB2uWWfFRC_.sg--~B/Zmk9ZmlsbDtoPTYzMDtweW9mZj0wO3c9MTIwMDthcHBpZD15dGFjaHlvbg--/https://media-mbst-pub-ue1.s3.amazonaws.com/creatr-uploaded-images/2023-07/119235f0-19af-11ee-bfdf-d2d22375f6a9.cf.jpg")
                .placeholder(R.drawable.image_predeterminado_por_negative_resword)
                .into(holder.img)
        }
        /*
        holder.opcionesSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            var posicion_item = holder.adapterPosition
            override fun onNothingSelected(parent: AdapterView<*>?) {
            }
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {

                //view.on
                val p = parent!!.getItemAtPosition(position).toString()

                if (position == 1){
                    val intent = Intent(contexto, Noticia::class.java)

                    intent.putExtra("id","select: "+p)//items[position].source?.id)
                    intent.putExtra("name", items[posicion_item].source?.name)
                    intent.putExtra("autor",items[posicion_item].author)
                    intent.putExtra("titulo",items[posicion_item].title)
                    intent.putExtra("descripcion",items[posicion_item].description)
                    intent.putExtra("url",items[posicion_item].url)
                    intent.putExtra("urlImage",items[posicion_item].urlToImage)
                    intent.putExtra("publishedAt",items[posicion_item].publishedAt)
                    intent.putExtra("contenido",items[posicion_item].content)
                    contexto.startActivity(intent)

                    // Lógica a ejecutar cuando se hace clic en el botón
                    Log.d("TAG", "Click: Hola "+posicion_item+" "+p)
                }
                if(position == 2){
                    val intent = Intent(contexto, NoticiasAbiertas::class.java)

                    intent.putExtra("id",items[position].source?.id)
                    intent.putExtra("name", items[posicion_item].source?.name)
                    intent.putExtra("autor",items[posicion_item].author)
                    intent.putExtra("titulo",items[posicion_item].title)
                    intent.putExtra("descripcion",items[posicion_item].description)
                    intent.putExtra("url",items[posicion_item].url)
                    intent.putExtra("urlImage",items[posicion_item].urlToImage)
                    intent.putExtra("publishedAt",items[posicion_item].publishedAt)
                    intent.putExtra("contenido",items[posicion_item].content)
                    contexto.startActivity(intent)

                    // Lógica a ejecutar cuando se hace clic en el botón
                    Log.d("TAG", "Click: Hola "+posicion_item+" "+p)
                }

            }
        }*/

        Log.d("TAG","fila:"+position+" limite: "+items.size)
    }

    fun Update(lista: MutableList<Articles>){
        items = lista
        this.notifyDataSetChanged()
    }
}

