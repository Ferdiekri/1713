package com.ipartek.formacion;

public class Cerdo implements Ordenable {

	private int kilos;
	private String nombre;

	public Cerdo() {
		super();
		this.kilos = 0;
		this.nombre = "Cerdo";
	}

	public Cerdo(int kilos, String nombre) {
		this();
		this.kilos = kilos;
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getKilos() {
		return kilos;
	}

	public void setKilos(int kilos) {
		this.kilos = kilos;
	}

	@Override
	public String toString() {
		return "Cerdo [kilos=" + kilos + ", nombre=" + nombre + "]";
	}

	@Override
	public int getValor() {
		return this.kilos;
	}

}
