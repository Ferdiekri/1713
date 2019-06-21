package com.ipartek.formacion.estructura.repetitivos;

public class Ejercicio010203 {

	/**
	 * 1. Programa Java que muestre los números del 1 al 100 utilizando la
	 * instrucción while 2. Programa Java que muestre los números del 1 al 100
	 * utilizando la instrucción do..while 3. Programa Java que muestre los números
	 * del 1 al 100 utilizando la instrucción for
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int cont = 1;

		System.out.println("Los números del 1 al 100 con un bucle WHILE.");
		while (cont <= 100) {
			if(cont%10==0) {
				System.out.print(cont + "\n");
			}else {
				System.out.print(cont + " - ");
			}
			cont++;
		}
		
		cont=1;
		System.out.println("\n-------------------------------------\n");
		
		System.out.println("Los números del 1 al 100 con un bucle DO WHILE.");
		do {
			if(cont%10==0) {
				System.out.print(cont + "\n");
			}else {
				System.out.print(cont + " - ");
			}			
			cont++;
		} while (cont<101);
		
		System.out.println("\n-------------------------------------\n");
		
		System.out.println("Los números del 1 al 100 con un bucle FOR.");
		for (int i = 1; i <= 100; i++) {
			if(i%10==0) {
				System.out.print(i + "\n");
			}else {
				System.out.print(i + " - ");
			}	
		}

	}

}
