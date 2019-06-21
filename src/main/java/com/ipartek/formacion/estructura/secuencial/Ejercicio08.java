package com.ipartek.formacion.estructura.secuencial;

import java.util.Scanner;

public class Ejercicio08 {
	/**
	 * 8. Programa que calcula el volumen de una esfera. La fórmula para calcular el
	 * volumen de la esfera es v = (4/3)*PI*r^3
	 */
	public static void main(String[] args) {
		int radio;
		Scanner entrada = new Scanner(System.in);

		System.out.print("Introduce el radio de la esfera: ");
		radio = entrada.nextInt();

		System.out.println("El volumen de la esfera es: " + ((4 / 3) * Math.PI * Math.pow(radio, 3)));

		entrada.close();

	}

}
