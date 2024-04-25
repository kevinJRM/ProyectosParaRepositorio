use periodico;

/* si ya existe eliminara*/
drop procedure if exists calse2ingenieriaBaseDeDatos;
go

create procedure calse2ingenieriaBaseDeDatos
as
begin
	-- Declarar variables para almacenar el nombre y apellido
    DECLARE @Resultado TABLE( id int, nombre VARCHAR(50), cantComentarios int);

	select u.id,u.nombre ,
	(
	select count(*) from
	(
	select (ct.id_usuario)idU from noticia nt join comentario ct on nt.id  = ct.id_noticia
	)
	noticia2 where noticia2.idU = u.id)cantComentarios from usuario u ;

    -- Devolver los resultados
    SELECT * from @Resultado;
end
go

exec periodico.dbo.calse2ingenieriaBaseDeDatos;
