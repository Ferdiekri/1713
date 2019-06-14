package com.ipartek.formacion.estructura.secuencial;

import java.util.Scanner;

public class Ejercicio10 {
	/**
	 * 10. Programa que lee un número de 3 cifras y muestra sus cifras por separado.
	 */
	public static void main(String[] args) {
		int numero;
		Scanner entrada = new Scanner(System.in);

		System.out.print("Introduce un número de 3 cifras: ");
		numero = entrada.nextInt();

		System.out.println("El número se compone de: " + numero / 100 + " - " + (numero / 10) % 10 + " - " + numero % 10);

		entrada.close();

	}

}
