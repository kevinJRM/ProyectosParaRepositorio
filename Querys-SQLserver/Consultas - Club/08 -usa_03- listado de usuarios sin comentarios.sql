
use periodico;

CREATE TABLE #CantidadComentariosCadaUsuario (
    id INT,
	nombre varchar(250),
    cantComentarios INT
);

-- resultado del procedimiento almacenado en la tabla temporal
INSERT INTO #CantidadComentariosCadaUsuario exec cantidadComentariosCadaUsuario;

select * from #CantidadComentariosCadaUsuario -- insertado en tabla temporal
union	 
select id,nombre,cantComentarios from(
select id_usuario,cantComentarios from (
select noticia.id,noticia.titulo, noticia.id_usuario,
(
select count(*) from
(
select (noticia2.id)idNoticia from (
select noticia.id, noticia.titulo, noticia.id_usuario, (categoria.id)idCategoria, (categoria.nombre)nombreCategoria 
from noticia join categoria on noticia.id_categoria = categoria.id
)
noticia2 join comentario on noticia2.id = comentario.id_noticia
) noticia2 where noticia.id = noticia2.idNoticia)cantComentarios from noticia
)
noticia3 where noticia3.cantComentarios = 0) noticiaDeUsu join usuario on noticiaDeUsu.id_usuario = usuario.id;

DROP TABLE #CantidadComentariosCadaUsuario; -- eliminacion de tabla temporal despues de uso

