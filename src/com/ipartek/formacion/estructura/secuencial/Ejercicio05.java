package com.ipartek.formacion.estructura.secuencial;

import java.util.Scanner;

public class Ejercicio05 {
	/**
	 * 5. Programa que lee por teclado el valor del radio de una circunferencia y
	 * calcula y muestra por pantalla la longitud y el área de la circunferencia.
	 * Longitud de la circunferencia = 2*PI*Radio, Area de la circunferencia =
	 * PI*Radio^2
	 */

	public static void main(String[] args) {
		int radio;
		Scanner entrada = new Scanner(System.in);

		System.out.print("Introduce el radio de una circunferencia: ");
		radio = entrada.nextInt();

		System.out.println("El radio de la circunferencia es: " + radio);
		System.out.println("La longitud de la circunferencia es: " + (2 * Math.PI * radio));
		System.out.println("El área de la circunferencia es: " + (Math.PI * radio / 2));

		entrada.close();

	}

}
