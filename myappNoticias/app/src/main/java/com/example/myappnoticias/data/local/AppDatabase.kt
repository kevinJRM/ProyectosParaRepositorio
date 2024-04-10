package com.example.myappnoticias.data.local

import android.content.Context
import android.util.Log
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch



@Database(entities = [NoticiaLocal::class], version = 3)
abstract class AppDatabase : RoomDatabase() {

    abstract fun noticiadao() : NoticiaDAO

    companion object {
        @Volatile // GARANTIZA LECTURA = ESCRITURA DESDE MULTIPELS HILOS DE EJECUCION
        private var isntance : AppDatabase? = null

        // pide la referencia de la instancia AppDatabase para usar, en caso de no haber una instancia(osea null) la crea
        fun getInstance(context : Context) : AppDatabase = isntance ?: synchronized(this) {
            Log.d("TAG","obtener base de datos")
            isntance ?: buildDatabase(context)
        }
        private fun buildDatabase(context : Context) : AppDatabase =
            Room.databaseBuilder(context, AppDatabase::class.java, "app_databasee")
                .fallbackToDestructiveMigration()
                .build()

        suspend fun clean(context : Context) = coroutineScope {
            launch (Dispatchers.IO) {
                getInstance(context).clearAllTables()
            }
        }

    }

}