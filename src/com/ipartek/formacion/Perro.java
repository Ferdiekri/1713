package com.ipartek.formacion;

/**
 * Esto es JavaDoc para documentar.
 *
 */
public class Perro {
	// nombre, raza, edad, vacunado
	// atributos encapsulados
	// getters, setters & toString
	// edad negativa --> 0

	// atributos privados para encapsular
	private String nombre;
	private String raza;
	private int edad;
	private boolean vacunado;

	// constructores

	public Perro() {
		super();
		// TODO Auto-generated constructor stub
		nombre = "Sin Nombre";
		raza = "Cruce";
		edad = 0;
		vacunado = false;
	}

	public Perro(String nombre) {
		this();
		this.nombre = nombre;
	}

	public Perro(String nombre, String raza, int edad, boolean vacunado) {
		super();
		this.nombre = nombre;
		this.raza = raza;
		this.edad = edad;
		this.vacunado = vacunado;
	}

	// getters & setters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public int getEdad() {
		return edad;
	}

	/**
	 * Seteamos la edad del perro. En caso de ser menor que 0, ponemos un 0.
	 * 
	 * @param edad int valor en años.
	 * @throws Exception edad < 0
	 */
	public void setEdad(int edad) throws Exception {
		if (edad < 0) {
			// this.edad = 0;
			throw new PerroException(PerroException.ERROR_EDAD);
		} else {
			this.edad = edad;
		}
	}

	public boolean isVacunado() {
		return vacunado;
	}

	public void setVacunado(boolean vacunado) {
		this.vacunado = vacunado;
	}

	@Override
	public String toString() {
		return "Perro [nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", vacunado=" + vacunado + "]";
	}

}


