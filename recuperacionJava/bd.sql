/* TABLA A (CLIENTE)*/
create table cliente (
	codigo integer primary key not null, 
	dni varchar(9) not null,
	usuario varchar(30) not null,
	contraseña varchar(30) not null
);

/* TABLA B (COCHE)*/
create table coche (
	codigo integer primary key not null,
	marca varchar(50) not null,
	codcliente integer not null,
	imagen varchar(1000) not null,
	constraint fk_codcliente foreign key (codcliente) references cliente (codigo)
);

/* TABLA C (REPARACION)*/
create table reparacion (
	codigo integer primary key not null,
	descripcion varchar(50) not null,
	preciototal real not null,	
	codcoche integer not null,
	fecha date not null,
	constraint fk_coche foreign key (codcoche) references coche (codigo)
);

insert into cliente
values(1, '12345678A', 'alejandro', 'alejandro');

insert into cliente
values(2, '23546897B', 'maria', 'maria');


insert into reparacion values
(
3, 'cristal', 120, 1, '12/12/2018'
);

delete from reparacion where codcoche = 1;
delete from coche where codigo = 1;
