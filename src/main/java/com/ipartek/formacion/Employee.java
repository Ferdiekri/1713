package com.ipartek.formacion;

import java.util.Date;

public class Employee extends Person {

	public final float SALARIO_MINIMO = 937.05f;
	private int numero;
	private Date fecha;
	private float salario;

	public Employee() {
		super();
		this.numero = 0;
		this.fecha = new Date();
		this.salario = SALARIO_MINIMO;
	}

	public Employee(String nombre, int edad, char sexo, float salario) {
		super(nombre, edad, sexo);
		this.salario = salario;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return getNombre() + "\t" + getEdad() + "\t" + getSexo() + "\t" + salario + " miles de millones";
	}

}
