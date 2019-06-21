package com.ipartek.formacion.estructura.secuencial;

import java.util.Scanner;

public class Ejercicio03 {
	/**
	 * 3. Programa Java que lee un número entero por teclado y obtiene y muestra por
	 * pantalla el doble y el triple de ese número.
	 */
	public static void main(String[] args) {
		int num1;
		Scanner entrada = new Scanner(System.in);

		System.out.print("Introduce un número: ");
		num1 = entrada.nextInt();

		System.out.println("El número es: " + num1);
		System.out.println("El doble del número es: " + (num1 * 2));
		System.out.println("El triple del número número es: " + (num1 * 3));

		entrada.close();
	}

}
