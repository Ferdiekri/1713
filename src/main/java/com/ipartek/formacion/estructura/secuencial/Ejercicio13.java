package com.ipartek.formacion.estructura.secuencial;

import java.util.Scanner;

public class Ejercicio13 {
	/**
	 * 13. Programa que pida por teclado la fecha de nacimiento de una persona (dia,
	 * mes, a�o) y calcule su n�mero de la suerte. El n�mero de la suerte se calcula
	 * sumando el d�a, mes y a�o de la fecha de nacimiento y a continuaci�n sumando
	 * las cifras obtenidas en la suma. Por ejemplo: Si la fecha de nacimiento es
	 * 12/07/1980 Calculamos el n�mero de la suerte as�: 12+7+1980 = 1999 1+9+9+9 =
	 * 28 N�mero de la suerte: 28
	 */
	public static void main(String[] args) {
		int dia = 0;
		int mes = 0;
		int anno = 0;
		int suma = 0;
		int suerte;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Vamos a calcular tu n�mero de la suerte.\n");
		System.out.print("Introduce el d�a en el que naciste: ");
		dia = entrada.nextInt();
		System.out.print("Introduce el mes en el que naciste: ");
		mes = entrada.nextInt();
		System.out.print("Introduce el a�o en el que naciste: ");
		anno = entrada.nextInt();

		suma = dia + mes + anno;
		suerte = ((suma / 1000) + (suma / 100 % 10) + (suma / 10 % 10) + (suma % 10));

		System.out.println("Tu n�mero de la suerte es: " + suerte);

		entrada.close();
	}

}
