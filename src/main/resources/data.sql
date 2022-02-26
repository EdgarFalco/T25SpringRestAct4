DROP table IF EXISTS sala;
DROP table IF EXISTS pelicula;

create table pelicula (
	codigo int AUTO_INCREMENT PRIMARY KEY,
    nombre nvarchar(100),
    calificacion_edad int
    );
    
create table sala (
    codigo int AUTO_INCREMENT PRIMARY KEY,
    nombre nvarchar(100),
    pelicula int,
    FOREIGN KEY (pelicula) REFERENCES pelicula (codigo) 
    ON DELETE CASCADE ON UPDATE CASCADE
);

insert into pelicula (nombre, calificacion_edad) values ('Piratas', 16);
insert into pelicula (nombre, calificacion_edad) values ('Terminator', 18);
insert into pelicula (nombre, calificacion_edad) values ('El mas', 13);
insert into pelicula (nombre, calificacion_edad) values ('Robots', 12);
insert into pelicula (nombre, calificacion_edad) values ('Yo Robot', 16);

insert into sala (nombre, pelicula)values('S1', 1);
insert into sala (nombre, pelicula)values('S2', 2);
insert into sala (nombre, pelicula)values('S3', 3);
insert into sala (nombre, pelicula)values('S4', 4);
insert into sala (nombre, pelicula)values('S5', 5);




