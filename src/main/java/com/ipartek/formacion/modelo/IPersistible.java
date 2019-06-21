package com.ipartek.formacion.modelo;

import java.util.List;

/**
 * Operaciones básicas de CRUD para POJOs.
 * @author Eder Ibáñez Rojo
 *
 */
public interface IPersistible<P> {
	
	// Operaciones básicas para leer.
	
	List<P> getAll();
	
	P getById(int id);
	
	// Crear
	
	boolean insert(P pojo);
	
	// Borrar
	
	boolean delete (int id);
	
	// Actualizar
	
	boolean update (int id);

}
