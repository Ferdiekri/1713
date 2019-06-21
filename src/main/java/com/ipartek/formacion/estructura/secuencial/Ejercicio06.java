package com.ipartek.formacion.estructura.secuencial;

import java.util.Scanner;

public class Ejercicio06 {
	/**
	 * 6. Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por
	 * teclado.
	 */
	public static void main(String[] args) {
		int velocidad;
		Scanner entrada = new Scanner(System.in);

		System.out.print("Introduce una velocidad (Km/h): ");
		velocidad = entrada.nextInt();

		System.out.println("La velocidad introducida es: " + velocidad + " Km/h");
		System.out.println("Su equivalente es es: " + (velocidad * 5 / 18) + "m/s");

		entrada.close();

	}

}
