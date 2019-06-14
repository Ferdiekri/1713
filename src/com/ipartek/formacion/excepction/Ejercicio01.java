package com.ipartek.formacion.excepction;

import java.util.Scanner;

public class Ejercicio01 {
//Programa que pida todos los datos para crear un perro.
	public static void main(String[] args) {

		System.out.println("Comienza programa");
		Scanner sc = new Scanner(System.in);
		boolean correcto = false;
		String sNumero;
		int num1 = 0;
		int num2 = 0;
		//int suma = 0;

		while (!correcto) {
			System.out.print("Por favor, introduce el primer número: ");
			sNumero = sc.nextLine();

			try {
				num1 = Integer.parseInt(sNumero);
				correcto = true;
				System.out.println("Número guardado.");
			} catch (Exception e) {
				System.out.println("Por favor, eso no es un número. Vuelve a intentarlo. Gracias.");
			}
		}

		correcto = false;
		sNumero = "";

		while (!correcto) {
			System.out.print("Por favor, introduce el segundo número: ");
			sNumero = sc.nextLine();

			try {
				num2 = Integer.parseInt(sNumero);
				correcto = true;
				System.out.println("Número guardado.");
			} catch (Exception e) {
				System.out.println("Por favor, eso no es un número. Vuelve a intentarlo. Gracias.");
			}
		}

		System.out.println("El primer número es: " + num1);
		System.out.println("El segundo número es: " + num2);
		System.out.println("La suma de los dos números es: " + (num1 + num2));
		sc.close();
		System.out.println("Finaliza programa");
		/*
		 * System.out.print("Introduce un número del 0 al 9: ");
		 * 
		 * try { String sNumero = sc.nextLine(); int numero = Integer.parseInt(sNumero);
		 * System.out.println("Su número es: " + numero); } catch (Exception e) {
		 * e.printStackTrace(); System.out.println("Mensaje de excepción: " +
		 * e.getMessage());
		 * System.out.println("¡¡¡TE DIJE QUE METIERAS UN NÚMERO QUE SI NO FALLA!!!"); }
		 * finally { sc.close(); }
		 */
	}

}
