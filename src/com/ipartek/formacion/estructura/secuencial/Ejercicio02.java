package com.ipartek.formacion.estructura.secuencial;

import java.util.Scanner;

public class Ejercicio02 {

	/**
	 * Programa Java que lea un nombre y muestre por pantalla: “Buenos dias
	 * nombre_introducido”.
	 */

	public static void main(String[] args) {
		String nombre;
		Scanner entrada = new Scanner(System.in);

		System.out.print("Introduce tu nombre: ");
		nombre = entrada.nextLine();

		System.out.println("Buenos días " + nombre + ".");

		entrada.close();

	}

}
