package com.ipartek.formacion;

public class Aula {

	public static void main(String[] args) {
		// Hay que declarar array con nombre alumnos.
		String[] alumnos = { "Ander", "Mounir", "Andoni", "Asier", "Jon C.", "Arkaitz", "Aritz", "Manuel", "Iker", "Eduardo", "Eder I.",
				"Eder S.", "Gaizka", "Borja", "Verónica", "Jon A.", "José Luis" };

		// Generar número aleatoro.
		int lee = (int) (Math.random() * alumnos.length);

		/*
		 * Mostramos todos los alumnos. for (int i = 0; i < alumnos.length; i++) { if (i
		 * == lee) { System.out.println("Le ha tocado leer a: " + alumnos[i]); } else {
		 * System.out.println(alumnos[i] + " se ha librado de leer."); } } // end for
		 */
		System.out.println("Le ha tocado leer a: " + alumnos[lee]);
	}

}
