package com.ipartek.formacion.ejercicios.basicos;

/**
 * 
 * @author Eder Ib��ez Rojo
 * @see http://puntocomnoesunlenguaje.blogspot.com/2012/10/java-ejercicios-iniciales-3.html
 * 
 *      Escribe un programa java que declare una variable A de tipo entero y
 *      as�gnale un valor. A continuaci�n muestra un mensaje indicando si A es
 *      par o impar. Utiliza el operador condicional ( CONDICION ? <TRUE> :
 *      <FALSE> ) dentro del println para resolverlo. Si por ejemplo A = 14 la
 *      salida ser� 14 es par. Si fuese por ejemplo A = 15 la salida ser�: 15 es
 *      impar
 *
 */

public class Ejercicio08 {

	public static void main(String[] args) {
		final String NOMBRE_EJERCICIO = "Ejercicio 8\n-----------"; // constante. Siempre may�sculas
		int num1 = 15;

		System.out.println(NOMBRE_EJERCICIO);
		System.out.println(num1 + ((num1 % 2 == 0) ? " es par." : " es impar."));
		num1 = 14;
		System.out.printf("El n�mero %s es %s", num1, (num1 % 2 == 0) ? " es par." : " es impar.");
		
		float numero1 = 3.1425936363f;
		float numero2 = (float) 	3.1425936363;
		System.out.printf("\nEl n�mero con 2 decimales: %.2f", numero1); 
		System.out.printf("\nEl n�mero con 4 decimales: %.4f", numero2); 

	}

}
