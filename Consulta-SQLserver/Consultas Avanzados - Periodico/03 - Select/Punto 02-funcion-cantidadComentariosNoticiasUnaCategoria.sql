use periodico;

drop function if exists getCantidadComentariosCadaNoticiaDeUnaCategoria;
go
create function getCantidadComentariosCadaNoticiaDeUnaCategoria(@nombreCategoria varchar(250)) 
returns @Resultado TABLE(id int,titulo varchar(250),totalComentarios int,idCategori int,nombreCategoria varchar(250))

as
begin
insert into @Resultado

-- id titulo totalComentarios idCategori nombreCategori

select noticiasComentados.id, 
noticiasComentados.titulo, 
noticiasComentados.totalComentarios, 
noticiasComentados.idCategori,
noticiasComentados.nombreCategoria
from(

select noticia.id,noticia.titulo,
-- para obtener la columna se debe llamar a la funcion para completarla
(


select count(*) from
(
select noticiaCategoria.id, noticiaCategoria.titulo, noticiaCategoria.idCategoria,noticiaCategoria.nombreCategoria,(comentario.id)idComtUser , comentario.id_noticia from
(
-- noticias filtradas por categoria
select * from (
select noticia.id, noticia.titulo, (categoria.id)idCategoria, (categoria.nombre)nombreCategoria 
from noticia join categoria on noticia.id_categoria = categoria.id
)
noticia where noticia.nombreCategoria = @nombreCategoria
) 
noticiaCategoria join comentario on noticiaCategoria.id = comentario.id_noticia
)

comentados where noticia.id = comentados.id
) totalComentarios, (categoria.id)idCategori, (categoria.nombre)nombreCategoria from noticia join categoria on noticia.id_categoria = categoria.id
-- se vuelve a filtrar por el tipo de categoria
) noticiasComentados where noticiasComentados.nombreCategoria = @nombreCategoria;


return;
end;