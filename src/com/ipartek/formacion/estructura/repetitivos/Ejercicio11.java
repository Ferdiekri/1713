package com.ipartek.formacion.estructura.repetitivos;

import java.util.Scanner;

public class Ejercicio11 {

	/**
	 * 11. Programa que muestre los múltiplos de un número desde 1 hasta M
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int num1 = 0;
		int multi = 0;
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce un número : ");
		num1 = sc.nextInt();
		System.out.print("¿Cuántos múltiplos quieres ver? : ");
		multi = sc.nextInt();

		for (int i = 1; i <= multi; i++) {
			if (i % multi == 0) {
				System.out.println("\n" + num1);
			}
		}

		sc.close();

	}

}
