package com.ipartek.formacion.estructura.secuencial;

import java.util.Scanner;

public class Ejercicio12 {
	/**
	 * 12. Programa que lea un n�mero entero N de 5 cifras y muestre sus cifras
	 * desde el final igual que en el ejemplo.
	 */
	public static void main(String[] args) {
		int numero;
		Scanner entrada = new Scanner(System.in);

		System.out.print("Introduce un n�mero de 5 cifras: ");
		numero = entrada.nextInt();

		System.out.println("El n�mero introducido es: " + numero);
		System.out.println(numero / 1);
		System.out.println(numero / 10);
		System.out.println(numero / 100);
		System.out.println(numero / 1000);
		System.out.println(numero / 10000);
		
		entrada.close();

	}

}
