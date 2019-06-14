package com.ipartek.formacion.estructura.secuencial;

import java.util.Scanner;

public class Ejercicio01 {
	/**
	 * Programa Java que lea dos números enteros por teclado y los muestre por
	 * pantalla.
	 */
	public static void main(String[] args) {
		int num1, num2;
		Scanner entrada = new Scanner(System.in);

		System.out.print("Introduce el primer número: ");
		num1 = entrada.nextInt();
		System.out.print("Introduce el segundo número: ");
		num2 = entrada.nextInt();

		System.out.println("Has introducido los números " + num1 + " y " + num2 + ".");

		entrada.close();

	}

}
