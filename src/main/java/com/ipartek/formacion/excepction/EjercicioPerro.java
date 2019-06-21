package com.ipartek.formacion.excepction;

import java.util.Scanner;

import com.ipartek.formacion.Perro;

public class EjercicioPerro {

	public static void main(String[] args) throws Exception {

		Perro dog11 = new Perro();
		dog11.setEdad(-1);
		
		String nombre = "";
		String raza = "";
		int edad = 0;
		boolean vacunado = false;
		boolean correcto = false;
		String sEdad;
		char vacuna;
		Scanner sc = new Scanner(System.in);

		System.out.println("Vamos a guardar un perro.");

		System.out.println("¿Cómo se llama el perro?");
		nombre = sc.nextLine();
		System.out.println("¿De qué raza es el perro?");
		raza = sc.nextLine();

		while (!correcto) {
			System.out.println("¿Qué edad tiene el perro?");
			sEdad = sc.nextLine();
			try {
				edad = Integer.parseInt(sEdad);
				if (edad > 0) {
					correcto = true;
				} else {
					System.out.println("La edad no puede ser negativa. Vuelve a intentarlo. Gracias.");
				}
			} catch (Exception e) {
				System.out.println("Por favor, hay que introducir un número. Vuelve a intentarlo. Gracias.");
			}
		}

		correcto = false;

		while (!correcto) {
			System.out.println("¿El perro está vacunado? (S/N)");
			vacuna = sc.nextLine().charAt(0);
			if ((Character.toLowerCase(vacuna) == 's')) {
				vacunado = true;
				correcto = true;
			} else if ((Character.toLowerCase(vacuna) == 'n')) {
				vacunado = false;
				correcto = true;
			} else {
				System.out.println("Ha introducido un dato incorrecto. Vuelve a intentarlo. Gracias.");
			}
		}

		Perro dog1 = new Perro(nombre, raza, edad, vacunado);
		System.out.println(dog1.toString());

		sc.close();

	}

}
