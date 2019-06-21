package com.ipartek.formacion.estructura.repetitivos;

public class Ejercicio040506 {

	/**
	 * 4. Programa Java que muestre los números del 100 al 1 utilizando la
	 * instrucción while 5. Programa Java que muestre los números del 100 al 1
	 * utilizando la instrucción do..while 6. Programa Java que muestre los números
	 * del 100 al 1 utilizando la instrucción for
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int cont = 100;

		System.out.println("Los números del 1 al 100 con un bucle WHILE.");
		while (cont >= 1) {
			if(cont%10==0) {
				System.out.print(cont + "\n");
			}else {
				System.out.print(cont + " - ");
			}
			cont--;
		}
		
		cont=100;
		System.out.println("\n-------------------------------------\n");
		
		System.out.println("Los números del 1 al 100 con un bucle DO WHILE.");
		do {
			if(cont%10==0) {
				System.out.print(cont + "\n");
			}else {
				System.out.print(cont + " - ");
			}			
			cont--;
		} while (cont>1);
		
		System.out.println("\n-------------------------------------\n");
		
		System.out.println("Los números del 1 al 100 con un bucle FOR.");
		for (int i = 100; i >= 1; i--) {
			if(i%10==0) {
				System.out.print(i + "\n");
			}else {
				System.out.print(i + " - ");
			}	
		}

	}

}
