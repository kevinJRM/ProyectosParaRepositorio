package com.example.demonoticias.data.local

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch

abstract class AppDatabase : RoomDatabase(){

    abstract fun noticiadao() : NoticiaDAO

    companion object {
        @Volatile
        private var isntance : AppDatabase? = null

        fun getInstance(context : Context) : AppDatabase = isntance ?: synchronized(this) {
            isntance ?: buildDatabase(context)
        }
        private fun buildDatabase(context : Context) : AppDatabase =
            Room.databaseBuilder(context, AppDatabase::class.java, "app_database")
                .fallbackToDestructiveMigration()
                .build()

        suspend fun clean(context : Context) = coroutineScope {
            launch (Dispatchers.IO) {
                getInstance(context).clearAllTables()
            }
        }

    }

}