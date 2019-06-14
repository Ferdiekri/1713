package com.ipartek.formacion.estructura.repetitivos;

import java.util.Scanner;

public class Ejercicio10 {

	/**
	 * 10. Programa Java que lea dos números y muestre los números pares entre ellos
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce un número : ");
		num1 = sc.nextInt();
		System.out.print("Introduce otro número : ");
		num2 = sc.nextInt();

		if (num1 < num2) {
			mostrar(num1, num2);

		}
		if (num1 > num2) {
			mostrar(num2, num1);
		} else if (num1 == num2) {
			System.out.println("Los 2 números son iguales");
		}
		sc.close();
	}

	public static void mostrar(int a, int b) {
		for (int i = a; i <= b; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " - ");
			}
		}
	}

}
