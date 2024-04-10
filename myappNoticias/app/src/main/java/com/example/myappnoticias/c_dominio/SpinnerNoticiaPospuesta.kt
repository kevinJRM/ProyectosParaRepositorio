package com.example.myappnoticias.c_dominio

import android.content.Context
import android.util.Log
import android.view.View
import android.widget.AdapterView
import com.example.myappnoticias.b_model.Articulo
import com.example.myappnoticias.data.local.AppDatabase
import com.example.myappnoticias.data.local.toLocal
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class SpinnerNoticiaPospuesta(contexto : Context, artp : Articulo) : AdapterView.OnItemSelectedListener {
    private var context = contexto
    private var art = artp
    private val scope = CoroutineScope(GlobalScope.coroutineContext)

    override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
        if (p2==1){
            scope.launch {
                kotlin.runCatching {
                    AppDatabase.getInstance(p1!!.context).noticiadao().delete(art.toLocal())
                }.onSuccess {
                    Log.d("TAG","RecicladorAdaptorNoticia-onBindViewHolder - guardado con exito "+it)
                }.onFailure {
                    Log.d("TAG","RecicladorAdaptorNoticia-onBindViewHolder - fallo el guardado "+it)
                }
            }
        }
    }

    override fun onNothingSelected(p0: AdapterView<*>?) {
        TODO("Not yet implemented")
    }
}