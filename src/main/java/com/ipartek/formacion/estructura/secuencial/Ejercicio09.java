package com.ipartek.formacion.estructura.secuencial;

import java.util.Scanner;

public class Ejercicio09 {
	/**
	 * 9. Programa que calcula el área de un triángulo a partir de la longitud de
	 * sus lados. Area = RaizCuadrada(p*(p-a)*(p-b)*(p-c)) donde p = (a+b+c)/2
	 */
	public static void main(String[] args) {
		int lado1, lado2, lado3;
		float p, base;
		Scanner entrada = new Scanner(System.in);

		System.out.print("Introduce la longitud del primer lado: ");
		lado1 = entrada.nextInt();
		System.out.print("Introduce la longitud del segundo lado: ");
		lado2 = entrada.nextInt();
		System.out.print("Introduce la longitud del tercer lado: ");
		lado3 = entrada.nextInt();

		p = (lado1 + lado2 + lado3) / 2;
		base = (p * (p - lado1) * (p - lado2) * (p - lado3));

		System.out.println("El área del triangulo es: " + (Math.sqrt(base)));

		entrada.close();

	}

}
