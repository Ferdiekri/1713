package com.ipartek.formacion;

import java.util.Scanner;

public class MenuAlumnos {

	/**
	 * Programa que cree un men� para los alumnos y elija qui�n es el voluntario.
	 * Tiene que estar encapsulado en m�todos.
	 * 
	 * // Men�: // 1. Listar alumnos. Ordenado por Ranking. // 2. Crear alumno
	 * (nombre & edad). // 3. Eliminar alumno. // 4. Buscar voluntario (no puede
	 * salir el anterior). // 5. Ranking de voluntarios
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion = 0;

		dibujarMenu();
		opcion = Integer.parseInt(sc.nextLine().charAt(0));

		do {

			switch (opcion) {
			case 1:
				listarAlumnos();
				break;
			case 2:
				crearAlumno();
				break;
			case 3:
				eliminarAlumno();
				break;
			case 4:
				buscarVoluntario();
				break;
			case 5:
				System.out.println("Hasta la pr�xima.");
				break;

			default:
				System.out.println("Lo siento, pero esa opci�n no es v�lida. Vuelve a intentarlo.");
				break;
			}

		} while (opcion != 5);

		sc.close();
	}

	public static void dibujarMenu() {
		System.out.println("*****************************");
		System.out.println("*****  MEN� DE ALUMNOS  *****");
		System.out.println("*****************************");
		System.out.println("** 1. Listar alumnos ordenados por ranking. ");
		System.out.println("** 2. Crear alumno (nombre & edad).");
		System.out.println("** 3. Eliminar alumno.");
		System.out.println("** 4. Buscar voluntario (no puede salir el anterior).");
		System.out.println("** 5. Salir.");
		System.out.println("*****************************");
		System.out.print("\nElige una opci�n: ");
	}

	public static void listarAlumnos() {
		System.out.println("*****  LISTADO DE ALUMNOS  *****");
		System.out.println("********************************");
	}

	public static void crearAlumno() {
		System.out.println("*****  CREAR ALUMNO  *****");
		System.out.println("**************************");
	}

	public static void eliminarAlumno() {
		System.out.println("*****  ELIMINAR ALUMNO  *****");
		System.out.println("*****************************");
	}

	public static void buscarVoluntario() {
		System.out.println("*****  BUSCAR VOLUNTARIO  *****");
		System.out.println("*******************************");
	}

}
