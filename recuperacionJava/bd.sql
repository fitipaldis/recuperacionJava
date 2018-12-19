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
	codigo integer not null,
	descripcion varchar(50) not null,
	preciototal numeric(5,2) not null,	
	codcoche integer not null,
	fecha date not null,
	constraint pk_codreparacion primary key (codcoche),
	constraint fk_coche foreign key (codcoche) references coche (codigo)
);

