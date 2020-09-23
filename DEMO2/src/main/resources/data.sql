INSERT INTO persona (id, nombre, apellidos, edad) VALUES
  (1,'Andres', 'Antunez', 34),
  (2,'Beatriz', 'Benitez', 22),
  (3,'Conrado', 'Cabello', 65);

  
  INSERT INTO departamento (id,nombre, descripcion,responsable_id) values(1,'prueba','descr',2);
  
  insert into departamento_empleados(departamento_id, empleados_id) values(1,1);
  insert into departamento_empleados(departamento_id, empleados_id) values(1,3);