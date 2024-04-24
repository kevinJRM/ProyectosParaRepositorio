--listado de socios
select * from socio;

--listado de actividades
select * from actividad;

--listado de actividades con cupo cubierto
select a.nombre, a.cupo, count(*) inscriptos from actividad_socio a_s
join actividad a on a.id = a_s.id_actividad
group by a.nombre, a.cupo
having count(*) = a.cupo;

--listado de actividades por socio
select a_s.dni, a.nombre from actividad_socio a_s
join actividad a on a.id = a_s.id_actividad;

--listado de socios sin actividad
select * from socio where dni not in (select dni from actividad_socio);

--listado de elementos
select * from elemento;

--listado de alquileres adeudados
select * from elemento_socio where fecha_devol is null;

--listado de deuda por socio
select cs.dni, a.valor * (case when s.edad < 18 then c.valor_n else c.valor_a end) total from cuota_socio cs
join cuota c on c.id = cs.id_cuota
join actividad_socio a_s on a_s.dni = cs.dni
join actividad a on a.id = a_s.id_actividad
join socio s on s.dni = a_s.dni and s.estado = 1;

--listado de deuda por grupo familiar
-- dni, total, vencimiento
select aux2.dni_responsable, (case when aux2.vencimiento >= aux2.vencimiento then  aux2.total - ((aux2.total * 10) / 100)/*%10menosDelTotal*/ else aux2.total end) total_cuota, aux2.vencimiento
from ( select aux1.dni_responsable, aux1.total total, aux1.vencimiento 

from (select s.dni_responsable, a.valor * (case when s.edad < 18 then c.valor_n else c.valor_a end) total, c.vencimiento 
from cuota_socio cs join cuota c on c.id = cs.id_cuota join actividad_socio a_s on a_s.dni = cs.dni join actividad a on a.id = a_s.id_actividad join socio s on s.dni = a_s.dni and s.estado = 1
union all 
select s.dni_responsable, e.valor * (DateDiff(day, getdate(), es.fecha_devol)), es.fecha_devol from elemento_socio es join elemento e on e.id = es.id_elemento join socio s on s.dni = es.dni and s.estado = 1 where es.fecha_devol is null
) aux1) 
aux2;


