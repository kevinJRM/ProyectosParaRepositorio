
create database periodico; -- crear base de datos para las tablas
use periodico; -- usar base de datos para las tablas
create table usuario (
    id integer not null primary key,
    nombre varchar(250) not null,
    activo bit not null
);
create table categoria (
    id integer not null primary key,
    nombre varchar(250) not null
);
create table noticia (
    id integer not null primary key,
    titulo varchar(250) not null,
    fecha date not null,
    id_categoria integer not null,
    foreign key (id_categoria) references categoria(id),
    id_usuario integer not null,
    foreign key (id_usuario) references usuario(id)
);
create table comentario (
    id integer not null primary key,
    texto varchar(250) not null,
    fecha date not null,
    id_noticia integer not null,
    foreign key (id_noticia) references noticia(id),
    id_usuario integer not null,
    foreign key (id_usuario) references usuario(id)
);

