package com.ipartek.formacion;

public class Person {
	// Atributos
	private String nombre;
	private int edad;
	private float altura; // 1.70 m
	private float peso; // 50.5 kg
	private String ojos; // color
	private char sexo; // 'h' hombre, 'm' mujer, 'i' indefinido

	// Hacer un constructor de la clase PERSONA donde la persona por defecto va a
	// tener nombre ANONIMO, la edad 18 AÑOS, altura 0, peso 0, ojos MARRONES y sexo
	// I.
	// Sobrecargar el constructor para poder crear una persona indicando el NOMBRE,
	// la EDAD y el SEXO.

	public Person() {
		super(); // java.lang.Object
		this.nombre = "ANONIMO";
		this.edad = 18;
		this.altura = 0;
		this.peso = 0;
		this.ojos = "MARRONES";
		this.sexo = 'I';
	}

	public Person(String nombre, int edad, char sexo) {
		//super(); //no queremos llamar al padre. Queremos llamar al contructor anterior.
		this();
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}
	
	public Person(String nombre, int edad) {
		//super();
		this();
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) throws Exception {
		if (nombre == null) {
			//this.nombre = "Sin Nombre";
			throw new PersonException(PersonException.ERROR_NOMBRE);
		} else {
			this.nombre = nombre;
		}		
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public String getOjos() {
		return ojos;
	}

	public void setOjos(String ojos) {
		this.ojos = ojos;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Person [nombre=" + nombre + ", edad=" + edad + ", altura=" + altura + ", peso=" + peso + ", ojos="
				+ ojos + ", sexo=" + sexo + "]";
	}

	public String saludar() {
		return "Hola. Me llamo " + getNombre() + ".";
	}

}
