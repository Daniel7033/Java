Drop database if exists ubicacion;
create database if not exists ubicacion;
use ubicacion;
create table if not exists continente (
	id INT PRIMARY KEY auto_increment,
    codigo VARCHAR(20),
    nombre VARCHAR(20),
    estado BOOLEAN,
    fecha_creacion DATETIME, 
    fecha_modificacion DATETIME, 
    fecha_eliminacion DATETIME
);
create table if not exists pais(
	id INT PRIMARY KEY auto_increment,
    codigo VARCHAR(20),
    nombre VARCHAR(20),
    estado BOOLEAN,
    fecha_creacion DATETIME, 
    fecha_modificacion DATETIME, 
    fecha_eliminacion DATETIME,
    continente_id INT,
    foreign key (continente_id) references continente(id)
);
create table if not exists departamento (
	id INT PRIMARY KEY auto_increment,
    codigo VARCHAR(20),
    nombre VARCHAR(20),
    estado BOOLEAN,
    fecha_creacion DATETIME, 
    fecha_modificacion DATETIME, 
    fecha_eliminacion DATETIME,
    pais_id INT,
    foreign key (pais_id) references pais(id)
);
create table if not exists ciudad (
	id INT PRIMARY KEY auto_increment,
    codigo VARCHAR(20),
    nombre VARCHAR(20),
    estado BOOLEAN,
    fecha_creacion DATETIME, 
    fecha_modificacion DATETIME, 
    fecha_eliminacion DATETIME,
    departamento_id INT,
    foreign key (departamento_id) references departamento(id)
);
