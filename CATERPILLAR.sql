CREATE DATABASE Caterpillar;

CREATE TABLE tipo_documento(
id_tipo_documento INT AUTO_INCREMENT,
inicial VARCHAR(10) NOT NULL UNIQUE,
nombre_documento VARCHAR(40) NOT NULL UNIQUE,
estado_tipo_documento VARCHAR(15),
PRIMARY KEY (id_tipo_documento));

CREATE TABLE usuario(
id_usuario INT AUTO_INCREMENT,
numero_documento VARCHAR(40) NOT NULL UNIQUE,
nombres VARCHAR(40) NOT NULL,
apellidos VARCHAR(40) NOT NULL,
correo VARCHAR(50) NOT NULL,
contrasenia VARCHAR(40) NOT NULL,
rol VARCHAR(40) NOT NULL,
tipo_documento_id INT NOT NULL UNIQUE,
PRIMARY KEY (id_usuario));

CREATE TABLE producto(
id_producto INT AUTO_INCREMENT,
imagen_producto longblob NOT NULL,
nombre_producto VARCHAR(40) NOT NULL,
precio int NOT NULL,
PRIMARY KEY (id_producto)
);

CREATE TABLE alquiler(
id_alquiler INT AUTO_INCREMENT,
precio_alquiler INT NOT NULL,
fecha_alquiler DATE NOT NULL,
fecha_devolucion DATE NOT NULL,
usuario_id INT NOT NULL ,
PRIMARY KEY (id_alquiler));

CREATE TABLE alquiler_productos(
producto_id INT NOT NULL,
alquiler_id INT NOT NULL,
PRIMARY KEY (producto_id, alquiler_id));


ALTER TABLE alquiler_productos ADD FOREIGN KEY (producto_id) REFERENCES producto(id_producto);
ALTER TABLE alquiler_productos ADD FOREIGN KEY (alquiler_id) REFERENCES alquiler(id_alquiler);

ALTER TABLE usuario ADD FOREIGN KEY (tipo_documento_id) REFERENCES tipo_documento(id_tipo_documento);

ALTER TABLE alquiler ADD FOREIGN KEY (usuario_id) REFERENCES usuario(id_usuario);

INSERT INTO tipo_documento (id_tipo_documento, inicial, nombre_documento, estado_tipo_documento) VALUES
(1, 'CC', 'Cedula de ciudadania', 'Activo'),
(2, 'CE', 'Cedula de extranjeria', 'Activo'),
(3, 'DNI', 'Documento nacional de identidad', 'Activo'),
(4, 'TP', 'Tarjeta pasaporte', 'Activo'),
(5, 'TI', 'Tarjeta de identidad', 'Activo');


INSERT INTO usuario (numero_documento, nombres, apellidos, correo, contrasenia, rol ,tipo_documento_id) VALUES
('1001823866', 'Alfonso Rafael', 'Botia Alviz', 'alfonsobotia8@gmail.com','12345', 'Administrador', 3);



