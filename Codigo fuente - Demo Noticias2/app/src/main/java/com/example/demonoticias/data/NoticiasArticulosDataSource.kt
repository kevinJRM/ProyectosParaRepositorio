package com.example.demonoticias.data


import android.util.Log
import com.example.demonoticias.model.Articles
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory



class NoticiasArticulosDataSource() {

    private val _BASE_URL : String= "https://newsapi.org/"
    private val TAG = "API-DEMO"

    suspend fun getUniversities() : ArrayList<Articles> {
        Log.d(TAG, "Articulos Noticias DataSource Get")

        val api = Retrofit.Builder()
            .baseUrl(_BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(NoticiasArticulosAPI::class.java)


        var result = api.getUniversity("us", "e6fdb0ec51e74d31a16dd11a61070286").execute()

        return if (result.isSuccessful){
            /*
            val db = FirebaseFirestore.getInstance()

            // de la coleccion intenta sacar el unico elemento
            // articulo con coleccion de noticias y 3 datos y de ese documento pido la coleccion de noticias
            db.collection("NoticiasData").document("articlesColeccion").set(
                hashMapOf(
                    "name" to "kevin", //variable String
                    "email" to "correo@email.com" //variable String
                )
            )

            var name = ""
            var e = ""
            //get obtener de la base datos
            //            nombre de objeto       varible de un id
            db.collection("NoticiasData").document("articlesColeccion").get().addOnSuccessListener {
                name = it.get("name").toString()
                e = it.get("email").toString()
            }*/

            Log.d(TAG, "Resultado Exitoso y respuesta de DataBase ")
            result.body()?.articles ?: ArrayList<Articles>()
        }else{
            Log.e(TAG, "Error en llamdo API: "+result.message())
            ArrayList<Articles>()
        }
    }
}