package com.ipartek.formacion;

public class Alumno extends Person implements Comparable<Alumno> {
	private int voluntario;

	public Alumno() {
		super();
		super.setId(-1);
		this.voluntario = 0;
	}

	public Alumno(int id, String nombre) throws Exception {
		this();
		super.setId(id);
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
