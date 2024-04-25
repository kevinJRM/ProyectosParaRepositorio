use periodico;
drop function if exists getNombreCategoria;
go
create function getNombreCategoria(@id integer) returns varchar(250) as
begin
declare @respuesta varchar(250);
select @respuesta = noticia.nombreCategoria from (
select noticia.id, (categoria.nombre)nombreCategoria from noticia join categoria on noticia.id_categoria = categoria.id
)noticia where noticia.id = id;
return @respuesta
end;

