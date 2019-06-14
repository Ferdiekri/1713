package com.ipartek.formacion.estructura.secuencial;

import java.util.Scanner;

public class Ejercicio04 {
	/**
	 * 4. Programa que lea una cantidad de grados cent�grados y la pase a grados
	 * Fahrenheit. La f�rmula correspondiente es: F = 32 + ( 9 * C / 5)
	 */

	public static void main(String[] args) {
		int grados;
		Scanner entrada = new Scanner(System.in);

		System.out.print("Introduce una temperatura (�C): ");
		grados = entrada.nextInt();

		System.out.println("La temperatura en �C es: " + grados);
		System.out.println("La temperatura en �F es: " + (32 + (9 * grados / 5)));

		entrada.close();

	}

}
