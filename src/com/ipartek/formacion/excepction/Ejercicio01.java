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
			System.out.print("Por favor, introduce el primer n�mero: ");
			sNumero = sc.nextLine();

			try {
				num1 = Integer.parseInt(sNumero);
				correcto = true;
				System.out.println("N�mero guardado.");
			} catch (Exception e) {
				System.out.println("Por favor, eso no es un n�mero. Vuelve a intentarlo. Gracias.");
			}
		}

		correcto = false;
		sNumero = "";

		while (!correcto) {
			System.out.print("Por favor, introduce el segundo n�mero: ");
			sNumero = sc.nextLine();

			try {
				num2 = Integer.parseInt(sNumero);
				correcto = true;
				System.out.println("N�mero guardado.");
			} catch (Exception e) {
				System.out.println("Por favor, eso no es un n�mero. Vuelve a intentarlo. Gracias.");
			}
		}

		System.out.println("El primer n�mero es: " + num1);
		System.out.println("El segundo n�mero es: " + num2);
		System.out.println("La suma de los dos n�meros es: " + (num1 + num2));
		sc.close();
		System.out.println("Finaliza programa");
		/*
		 * System.out.print("Introduce un n�mero del 0 al 9: ");
		 * 
		 * try { String sNumero = sc.nextLine(); int numero = Integer.parseInt(sNumero);
		 * System.out.println("Su n�mero es: " + numero); } catch (Exception e) {
		 * e.printStackTrace(); System.out.println("Mensaje de excepci�n: " +
		 * e.getMessage());
		 * System.out.println("���TE DIJE QUE METIERAS UN N�MERO QUE SI NO FALLA!!!"); }
		 * finally { sc.close(); }
		 */
	}

}
