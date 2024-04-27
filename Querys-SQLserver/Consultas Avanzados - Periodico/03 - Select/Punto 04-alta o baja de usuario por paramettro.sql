use periodico;

drop procedure if exists usuarioAltaBaja;
go

create procedure usuarioAltaBaja 
	 @idUser int = null, @nombre varchar(250)=null , @activo bit = null , @altaBaja int
as
begin
	if @altaBaja = 1
		begin
			insert into usuario values(@idUser, @nombre, @activo);
		end

	else if @altaBaja = 0
		begin
			delete usuario where usuario.id = @idUser;
		end	
end

-- baja de usuario
--exec usuarioAltaBaja @idUser=3, @alta = 0;

--alta de usuario
--exec usuarioAltaBaja @idUser=3,@nombre='user3',@activo=0, @alta = 1;





