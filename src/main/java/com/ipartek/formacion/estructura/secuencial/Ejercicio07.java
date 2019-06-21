package com.ipartek.formacion.estructura.secuencial;

import java.util.Scanner;

public class Ejercicio07 {
	/**
	 * 7. Programa lea la longitud de los catetos de un triángulo rectángulo y
	 * calcule la longitud de la hipotenusa según el teorema de Pitágoras.
	 */
	public static void main(String[] args) {
		int cateto1,cateto2;
		Scanner entrada = new Scanner(System.in);

		System.out.print("Introduce la longitud del primer cateto: ");
		cateto1 = entrada.nextInt();
		System.out.print("Introduce la longitud del segundo cateto: ");
		cateto2 = entrada.nextInt();

		System.out.println("La hipotenusa es: " + Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2)));
	

		entrada.close();

	}

}
