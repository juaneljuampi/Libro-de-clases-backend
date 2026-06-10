-- =========================================
-- ADMIN
-- =========================================



INSERT INTO usuarios(nombre, email, password, rol)
VALUES
('Juan Admin', 'admin@colegio.com', '1234', 'ADMIN');



-- =========================================
-- PROFESORES
-- =========================================

INSERT INTO usuarios(nombre, email, password, rol)
VALUES

('Carlos Fuentes', 'matematicas@colegio.com', '1234', 'PROFESOR'),

('Ana Lopez', 'lenguaje@colegio.com', '1234', 'PROFESOR'),

('Pedro Rojas', 'ingles@colegio.com', '1234', 'PROFESOR'),

('Maria Torres', 'historia@colegio.com', '1234', 'PROFESOR'),

('Sofia Martinez', 'ciencias@colegio.com', '1234', 'PROFESOR');



-- =========================================
-- CURSOS
-- =========================================

INSERT INTO cursos(nombre, descripcion, profesor)
VALUES

('1° Medio A', 'Curso primero medio A', 'Carlos Fuentes'),

('1° Medio B', 'Curso primero medio B', 'Ana Lopez'),

('2° Medio A', 'Curso segundo medio A', 'Pedro Rojas'),

('3° Medio A', 'Curso tercero medio A', 'Maria Torres'),

('4° Medio A', 'Curso cuarto medio A', 'Sofia Martinez');



-- =========================================
-- ASIGNATURAS
-- =========================================

INSERT INTO asignaturas(nombre)
VALUES

('Matemáticas'),
('Lenguaje'),
('Inglés'),
('Historia'),
('Ciencias');



-- =========================================
-- ALUMNOS
-- =========================================

INSERT INTO usuarios(nombre, email, password, rol)
VALUES

('Matías Rojas', 'matias.rojas@colegio.com', '1234', 'ALUMNO'),
('Camila Torres', 'camila.torres@colegio.com', '1234', 'ALUMNO'),
('Benjamín Soto', 'benjamin.soto@colegio.com', '1234', 'ALUMNO'),
('Valentina Díaz', 'valentina.diaz@colegio.com', '1234', 'ALUMNO'),
('Tomás Herrera', 'tomas.herrera@colegio.com', '1234', 'ALUMNO'),

('Javiera Morales', 'javiera.morales@colegio.com', '1234', 'ALUMNO'),
('Vicente Silva', 'vicente.silva@colegio.com', '1234', 'ALUMNO'),
('Florencia Castro', 'florencia.castro@colegio.com', '1234', 'ALUMNO'),
('Cristóbal Vega', 'cristobal.vega@colegio.com', '1234', 'ALUMNO'),
('Antonia Fuentes', 'antonia.fuentes@colegio.com', '1234', 'ALUMNO'),

('Martín Navarro', 'martin.navarro@colegio.com', '1234', 'ALUMNO'),
('Josefa Ramírez', 'josefa.ramirez@colegio.com', '1234', 'ALUMNO'),
('Ignacio Paredes', 'ignacio.paredes@colegio.com', '1234', 'ALUMNO'),
('Catalina Reyes', 'catalina.reyes@colegio.com', '1234', 'ALUMNO'),
('Sebastián Contreras', 'sebastian.contreras@colegio.com', '1234', 'ALUMNO'),

('Amanda Núñez', 'amanda.nunez@colegio.com', '1234', 'ALUMNO'),
('Diego Araya', 'diego.araya@colegio.com', '1234', 'ALUMNO'),
('Fernanda Molina', 'fernanda.molina@colegio.com', '1234', 'ALUMNO'),
('Lucas Espinoza', 'lucas.espinoza@colegio.com', '1234', 'ALUMNO'),
('Isidora Campos', 'isidora.campos@colegio.com', '1234', 'ALUMNO'),

('Gabriel Valdés', 'gabriel.valdes@colegio.com', '1234', 'ALUMNO'),
('Emilia Salazar', 'emilia.salazar@colegio.com', '1234', 'ALUMNO'),
('Nicolás Cifuentes', 'nicolas.cifuentes@colegio.com', '1234', 'ALUMNO'),
('Trinidad Leiva', 'trinidad.leiva@colegio.com', '1234', 'ALUMNO'),
('Alonso Muñoz', 'alonso.munoz@colegio.com', '1234', 'ALUMNO'),

('Constanza Vidal', 'constanza.vidal@colegio.com', '1234', 'ALUMNO'),
('Renato Godoy', 'renato.godoy@colegio.com', '1234', 'ALUMNO'),
('Maite Figueroa', 'maite.figueroa@colegio.com', '1234', 'ALUMNO'),
('Felipe Bustos', 'felipe.bustos@colegio.com', '1234', 'ALUMNO'),
('Daniela Peña', 'daniela.pena@colegio.com', '1234', 'ALUMNO'),

('Agustín Vera', 'agustin.vera@colegio.com', '1234', 'ALUMNO'),
('Francisca Riquelme', 'francisca.riquelme@colegio.com', '1234', 'ALUMNO'),
('Maximiliano Alarcón', 'maximiliano.alarcon@colegio.com', '1234', 'ALUMNO'),
('María José Soto', 'mariajose.soto@colegio.com', '1234', 'ALUMNO'),
('Bastián Carrasco', 'bastian.carrasco@colegio.com', '1234', 'ALUMNO'),

('Pía Mendoza', 'pia.mendoza@colegio.com', '1234', 'ALUMNO'),
('Rodrigo Farías', 'rodrigo.farias@colegio.com', '1234', 'ALUMNO'),
('Julieta Aravena', 'julieta.aravena@colegio.com', '1234', 'ALUMNO'),
('Samuel Cáceres', 'samuel.caceres@colegio.com', '1234', 'ALUMNO'),
('Martina Lagos', 'martina.lagos@colegio.com', '1234', 'ALUMNO'),

('Leonardo Saavedra', 'leonardo.saavedra@colegio.com', '1234', 'ALUMNO'),
('Sara Escobar', 'sara.escobar@colegio.com', '1234', 'ALUMNO'),
('Álvaro Sepúlveda', 'alvaro.sepulveda@colegio.com', '1234', 'ALUMNO'),
('Violeta Pino', 'violeta.pino@colegio.com', '1234', 'ALUMNO'),
('Emiliano Tapia', 'emiliano.tapia@colegio.com', '1234', 'ALUMNO'),

('Celeste Olivares', 'celeste.olivares@colegio.com', '1234', 'ALUMNO'),
('Bruno Gallardo', 'bruno.gallardo@colegio.com', '1234', 'ALUMNO'),
('Antonella Toledo', 'antonella.toledo@colegio.com', '1234', 'ALUMNO'),
('Joaquín Sanhueza', 'joaquin.sanhueza@colegio.com', '1234', 'ALUMNO'),
('Millaray Yáñez', 'millaray.yanez@colegio.com', '1234', 'ALUMNO'),

('Kevin Orellana', 'kevin.orellana@colegio.com', '1234', 'ALUMNO'),
('Noelia Henríquez', 'noelia.henriquez@colegio.com', '1234', 'ALUMNO'),
('Matheo Palma', 'matheo.palma@colegio.com', '1234', 'ALUMNO'),
('Amanda Zúñiga', 'amanda.zuniga@colegio.com', '1234', 'ALUMNO'),
('Vicente Jara', 'vicente.jara@colegio.com', '1234', 'ALUMNO'),

('Emma Venegas', 'emma.venegas@colegio.com', '1234', 'ALUMNO'),
('Cristian Ulloa', 'cristian.ulloa@colegio.com', '1234', 'ALUMNO'),
('Ariadna Neira', 'ariadna.neira@colegio.com', '1234', 'ALUMNO'),
('Gael Bravo', 'gael.bravo@colegio.com', '1234', 'ALUMNO'),
('Dominga Cuevas', 'dominga.cuevas@colegio.com', '1234', 'ALUMNO'),

('Ian Valenzuela', 'ian.valenzuela@colegio.com', '1234', 'ALUMNO'),
('Josefina Cofré', 'josefina.cofre@colegio.com', '1234', 'ALUMNO'),
('Thiago Mella', 'thiago.mella@colegio.com', '1234', 'ALUMNO'),
('Renata Bustamante', 'renata.bustamante@colegio.com', '1234', 'ALUMNO'),
('Matías Lobos', 'matias.lobos@colegio.com', '1234', 'ALUMNO'),

('Isabel Gutiérrez', 'isabel.gutierrez@colegio.com', '1234', 'ALUMNO'),
('Damián Soto', 'damian.soto@colegio.com', '1234', 'ALUMNO'),
('Antonia Parra', 'antonia.parra@colegio.com', '1234', 'ALUMNO'),
('Cristófer Núñez', 'cristofer.nunez@colegio.com', '1234', 'ALUMNO'),
('Florencia Arias', 'florencia.arias@colegio.com', '1234', 'ALUMNO'),

('Matheo Contreras', 'matheo.contreras@colegio.com', '1234', 'ALUMNO'),
('Juliana Peña', 'juliana.pena@colegio.com', '1234', 'ALUMNO'),
('Bastián Fuenzalida', 'bastian.fuenzalida@colegio.com', '1234', 'ALUMNO'),
('Antonella Cortés', 'antonella.cortes@colegio.com', '1234', 'ALUMNO'),
('Vicente Moya', 'vicente.moya@colegio.com', '1234', 'ALUMNO'),

('Maura Navarro', 'maura.navarro@colegio.com', '1234', 'ALUMNO'),
('Julián Arriagada', 'julian.arriagada@colegio.com', '1234', 'ALUMNO'),
('Emily Rojas', 'emily.rojas@colegio.com', '1234', 'ALUMNO'),
('Facundo León', 'facundo.leon@colegio.com', '1234', 'ALUMNO'),
('Josefa Hidalgo', 'josefa.hidalgo@colegio.com', '1234', 'ALUMNO'),

('Tomás Arce', 'tomas.arce@colegio.com', '1234', 'ALUMNO'),
('Catalina Zamora', 'catalina.zamora@colegio.com', '1234', 'ALUMNO'),
('Benicio Carrillo', 'benicio.carrillo@colegio.com', '1234', 'ALUMNO'),
('Martina Fuenzalida', 'martina.fuenzalida@colegio.com', '1234', 'ALUMNO'),
('Lucas Riquelme', 'lucas.riquelme@colegio.com', '1234', 'ALUMNO');


-- =========================================
-- NOTAS
-- =========================================

INSERT INTO notas(calificacion, alumno_id, asignatura_id)
VALUES

(6.5, 7, 1),
(5.8, 7, 2),
(6.1, 7, 3),
(5.9, 7, 4),
(6.7, 7, 5),

(5.5, 8, 1),
(6.0, 8, 2),
(6.3, 8, 3),
(5.4, 8, 4),
(6.8, 8, 5),

(6.2, 9, 1),
(5.7, 9, 2),
(6.0, 9, 3),
(5.6, 9, 4),
(6.4, 9, 5);



-- =========================================
-- ASISTENCIA
-- =========================================

INSERT INTO asistencia(alumno_id, fecha, presente)
VALUES

(7, '2026-05-18', true),
(7, '2026-05-19', true),
(7, '2026-05-20', false),

(8, '2026-05-18', true),
(8, '2026-05-19', false),
(8, '2026-05-20', true),

(9, '2026-05-18', true),
(9, '2026-05-19', true),
(9, '2026-05-20', true);



-- =========================================
-- MENSAJES
-- =========================================

INSERT INTO mensajes(emisor_id, receptor_id, contenido)
VALUES

(1, 7, 'Bienvenido al sistema escolar'),

(2, 7, 'Recuerda estudiar matemáticas'),

(3, 8, 'Tienes prueba de inglés mañana'),

(4, 9, 'Traer trabajo de historia'),

(5, 7, 'Laboratorio de ciencias el viernes');