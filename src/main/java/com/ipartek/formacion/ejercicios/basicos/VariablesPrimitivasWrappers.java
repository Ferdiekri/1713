package com.ipartek.formacion.ejercicios.basicos;

import java.util.Scanner;

/**
 * 
 * @author Eder Ibáñez Rojo
 * @see http://www.campus.formacion.ipartek.com/moodle/mod/page/view.php?id=882
 *
 */
public class VariablesPrimitivasWrappers {

	public static void main(String[] args) {
		// declarar todas los posibles tipos de variables primitivas que existen.
		// números enteros.
		/*byte b = 5;
		short s = 4;
		int i = 0;
		long l = 8;

		// números reales
		float f = 2.43f;
		double d = 4.56;

		char c = 'a';

		boolean bo = true;

		// Wrappers: clases que envuelven a los datos primitivos.
		int numeroParseado = Integer.parseInt("3");*/

		System.out.printf("El rango de un int %d %d", Integer.MIN_VALUE, Integer.MAX_VALUE);
		System.out.println("\n\n-----------------\n-----------------\n-----------------\n\n");

		// Indicar si el caracter introducido por pantalla es MAYÚSCULAS o MINÚSCULAS,
		// LETRA o NÚMERO
		Scanner entrada = new Scanner(System.in);
		System.out.print("Por favor, introduce in caracter: ");
		char caracter = entrada.next().charAt(0);

		System.out.println("Has escrito \"" + caracter + "\".");
		if (Character.isDigit(caracter)) {
			System.out.println("El caracter introducido es un NÚMERO.");
		} else if (Character.isLetter(caracter)) {
			System.out.println("El caracter introducido es una LETRA.");
			System.out.println("El caracter introducido es una "
					+ (Character.isLowerCase(caracter) ? "MINÚSCULA" : "MAYÚSCULA") + ".");

		} else {
			System.out.println("El caracter introducido es un CARACTER ESPECIAL.");
		}
		entrada.close();

	}

}
