package com.example.demonoticias.dominio

import android.content.Intent
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.Spinner
import com.example.demonoticias.ui.MainActivity
import com.example.demonoticias.ui.Noticia
import com.example.demonoticias.ui.NoticiasAbiertas

class SpinnerActi(item: ArrayList<String>) : AdapterView.OnItemSelectedListener {
    private var posicArticSelec = item
    //lateinit var contextoThi : MainActivity
    //lateinit var spinner: Spinner

    fun cargarArticuloSelect(contexto: MainActivity, itemm: ArrayList<String>, opcionesSpinner: Spinner) {
        //contextoThi = contexto
        posicArticSelec = itemm
        //spinner = opcionesSpinner

        //onItemSelected(spinner,spinner.emptyView,spinner)
    }

    private fun concatenarArticulo(): String {
        return posicArticSelec[0]+"|"+posicArticSelec[1]+"|"+posicArticSelec[2]+"|"+posicArticSelec[3]+"|"+posicArticSelec[4]+"|"+posicArticSelec[5]+"|"+posicArticSelec[6]+"|"+posicArticSelec[7]+"|"+posicArticSelec[8]
    }


    private fun abrirNoticia(p1: View?) {
        val intent = Intent(p1!!.context/*contextoThi*/, Noticia::class.java)
        Log.d("TAG","salida error:"+intent)

        intent.putExtra("articulo",this.concatenarArticulo())
        /*
        intent.putExtra("id","select: "+this.posicArticSelec[0])//items[position].source?.id)
        intent.putExtra("name", " "+this.posicArticSelec[1])
        intent.putExtra("autor",this.posicArticSelec[2])
        intent.putExtra("titulo",this.posicArticSelec[3])
        intent.putExtra("descripcion",this.posicArticSelec[4])
        intent.putExtra("url",this.posicArticSelec[5])
        intent.putExtra("urlImage",this.posicArticSelec[6])
        intent.putExtra("publishedAt",this.posicArticSelec[7])
        intent.putExtra("contenido",this.posicArticSelec[8])
        */
        p1.context.startActivity(intent)


        // Lógica a ejecutar cuando se hace clic en el botón
        Log.d("TAG", "Click: Hola ")
    }

    private fun agregarArticuloAbierto(p1 :View?){
        //
        val intent = Intent(p1!!.context, NoticiasAbiertas::class.java)
        intent.putExtra("articulo",this.concatenarArticulo())
        /*
        intent.putExtra("id","select: "+this.posicArticSelec[0])//items[position].source?.id)
        intent.putExtra("name", " "+this.posicArticSelec[1])
        intent.putExtra("autor",this.   posicArticSelec[2])
        intent.putExtra("titulo",this.posicArticSelec[3])
        intent.putExtra("descripcion",this.posicArticSelec[4])
        intent.putExtra("url",this.posicArticSelec[5])
        intent.putExtra("urlImage",this.posicArticSelec[6])
        intent.putExtra("publishedAt",this.posicArticSelec[7])
        intent.putExtra("contenido",this.posicArticSelec[8])
        */
        p1.context.startActivity(intent)

        // Lógica a ejecutar cuando se hace clic en el botón
        Log.d("TAG", "Click: Hola ")
    }


    override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
        //var p = p0!!.getItemAtPosition(p2).toString()
        if(p2 == 1){
            this.abrirNoticia(p1)

        }

        if (p2 == 2){
            this.agregarArticuloAbierto(p1)
        }
    }

    override fun onNothingSelected(p0: AdapterView<*>?) {
        //
    }
}