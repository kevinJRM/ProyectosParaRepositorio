
use periodico;
drop view if exists vwUsuariosEscritoresNoticiasDeportes;
go
create view vwUsuariosEscritoresNoticiasDeportes with encryption as
-- usuarios que escribieron noticias que pertenezcan a la categoría deporte
select existeEscrito.id, existeEscrito.nombre from (
select usuario2.id,usuario2.nombre,(
select count(*) from (
select idn,titulo,id_categoria,nombreCategori,id_usuario,nombre  from
(
select (n.id)idn,n.titulo,n.id_usuario,n.id_categoria,(c.nombre)nombreCategori from noticia n join categoria c on n.id_categoria = c.id 
) noticiaCategori join usuario on noticiaCategori.id_usuario = usuario.id
)noticiaCatUser where noticiaCatUser.id_usuario = usuario2.id and noticiaCatUser.nombreCategori ='deporte')totalPublicados from usuario usuario2) existeEscrito where existeEscrito.totalPublicados != 0;
