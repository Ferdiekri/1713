package com.ipartek.formacion;

/**
 * Exception personalizada para el POJO de Persona.
 * 
 * @author Curso
 *
 */
public class PersonException extends Exception {
	private static final long serialVersionUID = 1L;

	public static final String ERROR_NOMBRE = "El nombre de la persona no puede ser NULL.";

	public PersonException(String error) {
		super(error);
	}
}
