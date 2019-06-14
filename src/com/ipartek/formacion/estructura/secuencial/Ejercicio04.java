package com.ipartek.formacion.estructura.secuencial;

import java.util.Scanner;

public class Ejercicio04 {
	/**
	 * 4. Programa que lea una cantidad de grados centígrados y la pase a grados
	 * Fahrenheit. La fórmula correspondiente es: F = 32 + ( 9 * C / 5)
	 */

	public static void main(String[] args) {
		int grados;
		Scanner entrada = new Scanner(System.in);

		System.out.print("Introduce una temperatura (ºC): ");
		grados = entrada.nextInt();

		System.out.println("La temperatura en ºC es: " + grados);
		System.out.println("La temperatura en ºF es: " + (32 + (9 * grados / 5)));

		entrada.close();

	}

}
