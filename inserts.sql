--Inserts tabla Escuela Xavier
insert into Escuela_Xavier values (01,'CALLE 4 CP. 91750 VERACRUZ, VER.', 50, 15);

--Inserts tabla tipo contrato
insert into tipo_contrato values (01,'tiempo completo');
insert into tipo_contrato values (02,'medio tiempo');

--Inserts tabla tipo sueldo
insert into tipo_sueldo values (01,'fijo');
insert into tipo_sueldo values (02,'por clase');

--Inserts tabla presentaciones
insert into Presentaciones values (06,6,'2023-06-10');
insert into Presentaciones values (07,5,'2023-06-11');

--Inserts tabla Profesores
insert into Profesores values ('RAMI750510MDFXNQ02', 'JUAN RAMIREZ FLORES', 40, 15005064, 3, 02, 02);	--PROFESOR
insert into Profesores values ('BENC880825MDFXRS03', 'CARLA BENAVIDES TORRES', 42, 12004096, 6, 01, 01);	--PROFESOR

--Inserts tabla Alumnos
insert into Alumnos values ('CEAC011203MVZRMRA4','MARIA CRISTINA CERECERO AMADOR', 21, 19003092);	--ALUMNO
insert into Alumnos values ('FRAP980622MVZRMRA4', 'PAULINA FERNADEZ AGUILAR', 21, 20154012);	--ALUMNO
insert into Alumnos values ('GONZ900715MDFXRR01', 'MARINA GONZALEZ CANTU', 20, 18005084);	--ALUMNO

--Inserts tabla Invitados
insert into Invitados values ('LOPE980321MDFXRR06', 'ANA LOPEZ MARTINEZ', 17, 061);	--INVITADA

--Inserts tabla clases privadas
insert into class_privadas values (0001, 'MATEMATICAS BASICAS', 1001, '07:00', 15005064);
insert into class_privadas values (0002, 'ALGEBRA', 1002, '08:00', 15005064);
insert into class_privadas values (0003, 'QUIMICA',1003, '16:00', 12004096);
insert into class_privadas values (0004, 'METODOS NUMERICOS',1004, '17:00', 12004096);

--Inserts tabla clases grupales
insert into class_grupales values (0003, 'FÍSICA',2001, '9:00', 12004096);
insert into class_grupales values (0004, 'PROGRAMACION',2002, '10:00', 12004096);
insert into class_grupales values (0004, 'GEOMETRIA',2003, '11:00', 12004096);
insert into class_grupales values (0005, 'CALCULO', 2004, '12:00', 15005064);
insert into class_grupales values (0006, 'ECUACIONES DIFERENCIALES',2005, '13:00', 12004096);

--Inserts tabla alumnos asisten a presentaciones
insert into alumn_asist_present values (06, 19003092);
insert into alumn_asist_present values (06, 20154012);
insert into alumn_asist_present values (06, 18005084);

insert into alumn_asist_present values (07, 19003092);
insert into alumn_asist_present values (07, 20154012);
insert into alumn_asist_present values (07, 18005084);

--Inserts tabla profesores asisten a presentaciones
insert into prof_asist_present values (06, 15005064);
insert into prof_asist_present values (06, 12004096);

insert into prof_asist_present values (07, 15005064);
insert into prof_asist_present values (07, 12004096);

--Inserts tabla invitados asisten a presentaciones
insert into inv_asist_present values (06, 061);

--Inserts tabla alumnos que toman clases privadas
insert into alumn_clas_priv values (1001, 19003092);
insert into alumn_clas_priv values (1002, 19003092);

insert into alumn_clas_priv values (1002, 20154012);
insert into alumn_clas_priv values (1003, 20154012);
insert into alumn_clas_priv values (1004, 20154012);

insert into alumn_clas_priv values (1001, 18005084);
insert into alumn_clas_priv values (1003, 18005084);
insert into alumn_clas_priv values (1004, 18005084);

--Inserts tabla alumnos que toman clases grupales
insert into alumn_clas_grup values (2001, 19003092);
insert into alumn_clas_grup values (2003, 19003092);
insert into alumn_clas_grup values (2004, 19003092);
insert into alumn_clas_grup values (2002, 19003092);

insert into alumn_clas_grup values (2002, 20154012);
insert into alumn_clas_grup values (2003, 20154012);
insert into alumn_clas_grup values (2004, 20154012);

insert into alumn_clas_grup values (2001, 18005084);
insert into alumn_clas_grup values (2002, 18005084);
insert into alumn_clas_grup values (2005, 18005084);

