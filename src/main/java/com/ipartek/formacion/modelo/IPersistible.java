package com.ipartek.formacion.modelo;

import java.util.List;

import com.ipartek.formacion.Alumno;

/**
 * Operaciones b�sicas de CRUD para POJOs.
 * @author Eder Ib��ez Rojo
 *
 */
public interface IPersistible<P> {
	
	// Operaciones b�sicas para leer.
	
	List<P> getAll();
	
	P getById(int id);
	
	// Crear
	
	boolean insert(P pojo);
	
	// Borrar
	
	boolean delete (int id);
	
	// Actualizar

	boolean update(Alumno pojo);

}
