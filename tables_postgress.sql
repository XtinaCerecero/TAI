create table Escuela_Xavier(
	clave_escolar int not null,
	direccion varchar(100),
	cant_alumnos int,
	cant_profesores int,
	constraint pk_Escuela_Xavier primary key (clave_escolar),
	unique(clave_escolar)
	);

create table Mutantes(
	curp varchar(18) not null,
	nombre varchar(100),
	edad int,
	constraint pk_Mutantes primary key (curp),
	unique(curp)
	);

create table tipo_contrato (
	id_contrato int not null,
	contrato varchar(15),
	constraint pk_tipo_contrato primary key (id_contrato),
	unique(id_contrato)
	);

create table tipo_sueldo (
	id_sueldo int not null,
	sueldo varchar(10),
	constraint pk_tipo_sueldo primary key (id_sueldo),
	unique(id_sueldo)
	);

create table Presentaciones(
	id_presentacion int not null,
	cant_asistentes int,
	dia Date,
	constraint pk_presentacion primary key (id_presentacion),
	unique(id_presentacion)
	);

create table Profesores(
	no_personal int not null,
	total_clases_imp int,
	fk_sueldo int not null,
	fk_contrato int not null,
	constraint pk_Profesores primary key (no_personal),
	unique(no_personal),
	foreign key (fk_sueldo) references tipo_sueldo(id_sueldo),
	foreign key (fk_contrato) references tipo_contrato(id_contrato)
	)INHERITS (Mutantes);

create table Alumnos(
	matricula int not null,
	constraint pk_Alumnos primary key (matricula),
	unique(matricula)
	)INHERITS (Mutantes);

create table Invitados(
	no_invitado int not null,
	constraint pk_Invitados primary key (no_invitado),
	unique(no_invitado)
	)INHERITS (Mutantes);

create table Clases(
	cod_clase int not null,
	nombre_clase varchar(50),
	constraint pk_Clases primary key (cod_clase),
	unique(cod_clase)
	);
create table class_privadas(
	id_priv int not null,
	horario time,
	fk_prof_imp int not null,
	constraint pk_class_privadas primary key (id_priv),
	unique(id_priv),
	foreign key (fk_prof_imp) references Profesores(no_personal)
	)INHERITS (Clases);

create table class_grupales(
	id_grup int not null,
	horario time,
	fk_prof_imp int not null,
	constraint pk_class_grupales primary key (id_grup),
	unique(id_grup),
	foreign key (fk_prof_imp) references Profesores(no_personal)
	)INHERITS (Clases);

--tablas relacion mutante presentación
create table alumn_asist_present(
	fk_present int not null,
	fk_alumno int not null,
	foreign key (fk_present) references Presentaciones(id_presentacion),
	foreign key (fk_alumno) references Alumnos(matricula)
	);
create table prof_asist_present(
	fk_present int not null,
	fk_prof int not null,
	foreign key (fk_present) references Presentaciones(id_presentacion),
	foreign key (fk_prof) references Profesores(no_personal)
	);
create table inv_asist_present(
	fk_present int not null,
	fk_inv int not null,
	foreign key (fk_present) references Presentaciones(id_presentacion),
	foreign key (fk_inv) references Invitados(no_invitado)
	);

--tablas relacion alumnos clases
create table alumn_clas_priv(
	fk_clase_priv int not null,
	fk_alumno int not null,
	foreign key (fk_clase_priv) references class_privadas(id_priv),
	foreign key (fk_alumno) references Alumnos(matricula)
	);

create table alumn_clas_grup(
	fk_clase_grup int not null,
	fk_alumno int not null,
	foreign key (fk_clase_grup) references class_grupales(id_grup),
	foreign key (fk_alumno) references Alumnos(matricula)
	);