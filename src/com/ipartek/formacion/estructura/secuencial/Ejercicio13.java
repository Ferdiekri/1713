package com.ipartek.formacion.estructura.secuencial;

import java.util.Scanner;

public class Ejercicio13 {
	/**
	 * 13. Programa que pida por teclado la fecha de nacimiento de una persona (dia,
	 * mes, año) y calcule su número de la suerte. El número de la suerte se calcula
	 * sumando el día, mes y año de la fecha de nacimiento y a continuación sumando
	 * las cifras obtenidas en la suma. Por ejemplo: Si la fecha de nacimiento es
	 * 12/07/1980 Calculamos el número de la suerte así: 12+7+1980 = 1999 1+9+9+9 =
	 * 28 Número de la suerte: 28
	 */
	public static void main(String[] args) {
		int dia = 0;
		int mes = 0;
		int anno = 0;
		int suma = 0;
		int suerte;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Vamos a calcular tu número de la suerte.\n");
		System.out.print("Introduce el día en el que naciste: ");
		dia = entrada.nextInt();
		System.out.print("Introduce el mes en el que naciste: ");
		mes = entrada.nextInt();
		System.out.print("Introduce el año en el que naciste: ");
		anno = entrada.nextInt();

		suma = dia + mes + anno;
		suerte = ((suma / 1000) + (suma / 100 % 10) + (suma / 10 % 10) + (suma % 10));

		System.out.println("Tu número de la suerte es: " + suerte);

		entrada.close();
	}

}
