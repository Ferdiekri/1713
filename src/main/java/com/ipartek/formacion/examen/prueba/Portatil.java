package com.ipartek.formacion.examen.prueba;

public class Portatil extends Ordenador {

	// Atributos

	private float resolucion; // xx.x pixels
	private int bateria; // 0 - 100 %

	public static final int MINIMO_BATERIA = 0;
	public static final int PELIGRO_BATERIA = 20;
	public static final int MAXIMO_BATERIA = 100;

	// Contsructores

	public Portatil() {
		super();
		this.resolucion = 0.0f;
		this.bateria = MAXIMO_BATERIA;
	}

	public Portatil(String nombre, String placaBase, float cpu, int procesador, float resolucion, int bateria) {
		this();
		this.setNombre(nombre);
		this.setPlacaBase(placaBase);
		this.setCpu(cpu);
		this.setProcesador(procesador);
		this.setResolucion(resolucion);
		this.setBateria(bateria);
	}

	public Portatil(float resolucion, int bateria) {
		this();
		this.setResolucion(resolucion);
		this.setBateria(bateria);
	}

	// Getters & Setters

	public float getResolucion() {
		return resolucion;
	}

	public void setResolucion(float resolucion) {
		this.resolucion = resolucion;
	}

	public int getBateria() {
		return bateria;
	}

	public void setBateria(int bateria) {
		this.bateria = bateria;
	}

	// Resto de métodos

	@Override
	public String toString() {
		return "Portatil [resolucion=" + resolucion + ", bateria=" + bateria + "]";
	}

	public boolean bateriaCorrecta() {
		boolean correcto = false;
		if (this.getBateria() > 20) {
			correcto = true;
		}
		return correcto;
	}
}
