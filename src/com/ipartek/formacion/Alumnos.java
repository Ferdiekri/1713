package com.ipartek.formacion;

public class Alumnos extends Person {

	// Atributos
	private String nombre;
	private int edad;

	// Constructores
	public Alumnos(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Alumnos [nombre=" + nombre + ", edad=" + edad + "]";
	}

}
