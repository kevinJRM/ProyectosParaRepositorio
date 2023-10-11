package com.example.demonoticias.data.local

import androidx.room.*

@Dao
interface NoticiaDAO {

    @Query("SELECT * FROM noticias")
    fun getAll() : List<NoticiaLocal>

    @Query("SELECT * FROM noticias WHERE name = :name LIMIT 1")
    fun getByName(name : String) :NoticiaLocal

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(vararg noticia : NoticiaLocal)

    @Delete
    fun delete(noticia : NoticiaLocal)


}