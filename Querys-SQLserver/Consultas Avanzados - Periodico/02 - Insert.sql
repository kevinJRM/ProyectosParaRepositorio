use periodico;
insert into usuario values(0, 'usuario1', 1);
insert into usuario values(1, 'usuario2', 1);
insert into usuario values(2, 'usuario3', 0);
insert into categoria values(0, 'politica');
insert into categoria values(1, 'deporte');
insert into categoria values(2, 'economia');
insert into noticia values(0, 'Subio el dolar', '2023-04-27', 2, 0);
insert into noticia values(1, 'Elecciones en Argentina', '2023-04-28', 0, 1);
insert into noticia values(2, 'Messi campeon del mundo', '2023-04-29', 1, 2);
insert into noticia values(3, 'Mbappe odia a Messi', '2023-04-30', 1, 2);
insert into comentario values(0, 'jajaja', '2023-04-30', 0, 0);
insert into comentario values(1, 'muy bueno', '2023-04-30', 1, 1);
insert into comentario values(2, 'messi-rve', '2023-04-30', 2, 2);
insert into comentario values(3, 'dale campeon', '2023-04-30', 2, 2);

