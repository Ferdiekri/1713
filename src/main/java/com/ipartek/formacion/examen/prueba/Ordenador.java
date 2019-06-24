package com.ipartek.formacion.examen.prueba;

public class Ordenador implements Comparable<Ordenador> {

	// Atributos

	private String nombre; // Nombre del modelo.
	private String placaBase; // Nombre de la placa base.
	private float cpu; // X.XX GHz.
	private int procesador; // 32 ó 64 bits

	public static final int PROCESADOR_32 = 32;
	public static final int PROCESADOR_64 = 64;

	// Constructores

	public Ordenador() {
		super();
		this.nombre = "Modelo básico";
		this.placaBase = "Sin placa base";
		this.cpu = 1.20f;
		this.procesador = PROCESADOR_64;
	}

	public Ordenador(String nombre, String placaBase, float cpu, int procesador) {
		this();
		this.setNombre(nombre);
		this.setPlacaBase(placaBase);
		this.setCpu(cpu);
		this.setProcesador(procesador);
	}

	// Getters & Setters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPlacaBase() {
		return placaBase;
	}

	public void setPlacaBase(String placaBase) {
		this.placaBase = placaBase;
	}

	public float getCpu() {
		return cpu;
	}

	public void setCpu(float cpu) {
		this.cpu = cpu;
	}

	public int getProcesador() {
		return procesador;
	}

	public void setProcesador(int procesador) {
		if ((procesador != 32) || (procesador != 64)) {

		} else {
			this.procesador = procesador;
		}
	}

	// Resto de métodos

	@Override
	public String toString() {
		return "Ordenador [nombre=" + nombre + ", placaBase=" + placaBase + ", cpu=" + cpu + "]";
	}

	@Override
	public int compareTo(Ordenador o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
