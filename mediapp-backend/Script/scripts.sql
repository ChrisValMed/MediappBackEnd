INSERT INTO Rol (id_rol, nombre, descripcion) VALUES (1, 'ADMIN', 'Administrador');
INSERT INTO Rol (id_rol, nombre, descripcion) VALUES (2, 'USER', 'Usuario');
INSERT INTO Rol (id_rol, nombre, descripcion) VALUES (3, 'DBA', 'Adminsitrador de base de datos');

INSERT INTO usuario_rol (id_usuario, id_rol) VALUES (1, 1);
INSERT INTO usuario_rol (id_usuario, id_rol) VALUES (1, 3);
INSERT INTO usuario_rol (id_usuario, id_rol) VALUES (2, 2);

INSERT INTO menu(id_menu, nombre, icono, url) VALUES (1, 'Buscar', 'search', '/buscar');
INSERT INTO menu(id_menu, nombre, icono, url) VALUES (2, 'Registrar', 'insert_drive_file', '/consulta');
INSERT INTO menu(id_menu, nombre, icono, url) VALUES (3, 'Registrar E.', 'insert_drive_file', '/consulta-especial');
INSERT INTO menu(id_menu, nombre, icono, url) VALUES (4, 'Especialiades', 'star_rate', '/especialidad');
INSERT INTO menu(id_menu, nombre, icono, url) VALUES (5, 'Médicos', 'healing', '/medico');
INSERT INTO menu(id_menu, nombre, icono, url) VALUES (6, 'Examenes', 'assignment', '/examen');
INSERT INTO menu(id_menu, nombre, icono, url) VALUES (7, 'Pacientes', 'accessibility', '/paciente');
INSERT INTO menu(id_menu, nombre, icono, url) VALUES (8, 'Reportes', 'assessment', '/reporte');

INSERT INTO menu_rol (id_menu, id_rol) VALUES (1, 1);
INSERT INTO menu_rol (id_menu, id_rol) VALUES (2, 1);
INSERT INTO menu_rol (id_menu, id_rol) VALUES (3, 1);
INSERT INTO menu_rol (id_menu, id_rol) VALUES (4, 1);
INSERT INTO menu_rol (id_menu, id_rol) VALUES (5, 1);
INSERT INTO menu_rol (id_menu, id_rol) VALUES (6, 1);
INSERT INTO menu_rol (id_menu, id_rol) VALUES (7, 1);
INSERT INTO menu_rol (id_menu, id_rol) VALUES (8, 1);
INSERT INTO menu_rol (id_menu, id_rol) VALUES (3, 2);
INSERT INTO menu_rol (id_menu, id_rol) VALUES (4, 2);
INSERT INTO menu_rol (id_menu, id_rol) VALUES (5, 2);
INSERT INTO menu_rol (id_menu, id_rol) VALUES (6, 2);

select m.* from menu_rol mr inner join usuario_rol ur 	on ur.id_rol = mr.id_rol
							inner join menu m 			on m.id_menu = mr.id_menu
							inner join usuario u 		on u.id_usuario = ur.id_usuario
where u.nombre = 'jaime';

create table oauth_access_token (
  token_id VARCHAR(256),
  token bytea,
  authentication_id VARCHAR(256),
  user_name VARCHAR(256),
  client_id VARCHAR(256),
  authentication bytea,
  refresh_token VARCHAR(256)
);
