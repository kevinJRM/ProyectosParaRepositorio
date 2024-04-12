package com.example.myappnoticias.data.local

import androidx.room.*;


@Dao
interface NoticiaDAO {

    @Query("SELECT * FROM noticias")
    fun getAll() : List<NoticiaLocal>

    @Query("SELECT * FROM noticias n WHERE n.nombre = :name LIMIT 1")
    fun getByName(name : String) :NoticiaLocal

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(vararg noticias : NoticiaLocal)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(noticias : NoticiaLocal)

    @Delete
    fun delete(vararg noticias: NoticiaLocal)



}