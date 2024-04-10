package com.example.myappnoticias.data.local

import com.example.myappnoticias.b_model.Articulo
import com.example.myappnoticias.b_model.Source

fun Articulo.toLocal() = NoticiaLocal(
    nombre = author.toString(),
    titulo = title.toString(),
    description = description.toString(),
    url = url.toString(),
    urlToImage = urlToImage.toString(),
    publishedAt = publishedAt.toString(),
    content = content.toString()
)

fun NoticiaLocal.toLocal() = Articulo(
    source = /*sourceLocal?.toLocal() ?: */Source("vacio","vacio"),
    author = nombre,
    title = titulo,
    description = description,
    url = url,
    urlToImage = urlToImage,
    publishedAt = publishedAt,
    content = content
)

fun NoticiaLocal.toLocalDB() = Articulo(
    source = Source("v","v"),//(id,name),
    author = nombre,
    title = titulo,
    description = description,
    url = url,
    urlToImage = urlToImage,
    publishedAt = publishedAt,
    content = content
)

fun Source.toLocal() = SourceLocal(
    id = id.toString(),
    name = name.toString()
)
fun SourceLocal.toLocal() = Source(
    id = id,
    name = name
)

fun List<NoticiaLocal>.toLocalo() = map(NoticiaLocal :: toLocal)

fun List<Articulo>.toLocal() = map(Articulo :: toLocal)


fun Array<Articulo>.toLocal() = map(Articulo :: toLocal)

fun ArrayList<NoticiaLocal>.toLocal() = map(NoticiaLocal :: toLocal)




