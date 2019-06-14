package com.ipartek.formacion.estructura.repetitivos;

import java.util.Scanner;

public class Ejercicio0708 {

	/**
	 * 7. Programa Java que muestre los números desde 1 hasta N utilizando las
	 * instrucciones for, while y do .. while 8. Programa Java que muestre los
	 * números desde N hasta 1 utilizando las instrucciones for, while y do .. while
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int num = 0;
		int cont=1;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce un número (mayor que 1): ");
		num=sc.nextInt();
	

		System.out.println("Los números del 1 al 100 con un bucle WHILE.");

		while (cont<=num) {
			System.out.print(cont + " - ");
			cont++;
			
		}
		
		cont=1;
		System.out.println("\n-------------------------------------\n");

		System.out.println("Los números del 1 al 100 con un bucle DO WHILE.");
		do {
			System.out.print(cont + " - ");
			cont++;
		} while (cont<=num);
		
		System.out.println("\n-------------------------------------\n");

		System.out.println("Los números del 1 al 100 con un bucle FOR.");
		for (int i = 1; i <= num; i++) {
			System.out.print(i + " - ");
		}

		sc.close();

	}

}
