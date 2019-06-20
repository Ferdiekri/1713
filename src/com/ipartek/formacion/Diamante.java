package com.ipartek.formacion;

public class Diamante implements Ordenable {

	private int kilates;
	private String color;

	public Diamante() {
		super();
		this.kilates = 0;
		this.color = "Transparente";

	}

	public Diamante(int kilates, String color) {
		this();
		this.kilates = kilates;
		this.color = color;

	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getKilates() {
		return kilates;
	}

	public void setKilates(int kilates) {
		this.kilates = kilates;
	}

	@Override
	public int getValor() {
		return this.kilates;
	}

	@Override
	public String toString() {
		return "Diamante [kilates=" + kilates + ", color=" + color + "]";
	}

}
