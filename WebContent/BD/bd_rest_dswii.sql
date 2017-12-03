DROP DATABASE IF EXISTS bd_rest_dswii;

CREATE DATABASE bd_rest_dswii;

USE bd_rest_dswii;

CREATE TABLE tb_persona (
id int auto_increment primary key,
nombre varchar(50),
apellido varchar(50),
edad int,
dni varchar(8),
celular int,
direccion varchar(40)
);

INSERT INTO tb_persona VALUES (null,'Michell','Ramirez',23,'47935387',999202852,'Mz C Lt 10');
INSERT INTO tb_persona VALUES (null,'Patricia','Leon',23,'48261445',941793343,'Mz E Lt 20');
INSERT INTO tb_persona VALUES (null,'Enrique','Ramirez',53,'10480659',992536784,'Mz E lt 2');
INSERT INTO tb_persona VALUES (null,'Lastenia','Quispe',47,'08879500',987904691,'Mz C Lt 10');
INSERT INTO tb_persona VALUES (null,'Steven','Ramirez',21,'74381127',910899567,'Mz C Lt 10');
INSERT INTO tb_persona VALUES (null,'Gian','Villodas',21,'88881231',954376123,'Mz C Lt 10');
INSERT INTO tb_persona VALUES (null,'Jennifer','Villodas',21,'8881230',973615893,'Mz C Lt 10');
INSERT INTO tb_persona VALUES (null,'Kate','Aylas',3,'10039431',912346785,'Mz E Lt 3');
INSERT INTO tb_persona VALUES (null,'Mishel','Quispe',10,'89568712',998123458,'Mz J Lt 26');
INSERT INTO tb_persona VALUES (null,'Ses Junior','Quispe',16,'86124987',975318642,'Jr Las Orquideas 1745');

select id, nombre, apellido, edad, dni, celular, direccion from tb_persona;
