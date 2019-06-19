package com.ipartek.formacion;

public class Alumno extends Person implements Comparable<Alumno> {
	private int voluntario;

	public Alumno() {
		super();
		this.voluntario = 0;
	}

	public Alumno(String nombre) throws Exception {
		this();
		this.setNombre(nombre);
	}

	public int getVoluntario() {
		return voluntario;
	}

	public void setVoluntario(int num) {
		this.voluntario += num;
	}

	@Override
	public int compareTo(Alumno o) {
		return o.getVoluntario() - this.voluntario;
	}

}
