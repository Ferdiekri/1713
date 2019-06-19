package com.ipartek.formacion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MenuAlumnos {

	public static ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
	public static Scanner sc = new Scanner(System.in);
	public static String nombre = "";
	public static int opcion = 0;
	public static String anterior = "";

	static final int OPCION_LISTAR = 1;
	static final int OPCION_CREAR = 2;
	static final int OPCION_ELIMINAR = 3;
	static final int OPCION_BUSCAR = 4;
	static final int OPCION_SALIR = 5;

	/**
	 * Programa que cree un menú para los alumnos y elija quién es el voluntario.
	 * Tiene que estar encapsulado en métodos.
	 * 
	 * // Menú: // 1. Listar alumnos. Ordenado por Ranking. // 2. Crear alumno
	 * (nombre & edad). // 3. Eliminar alumno. // 4. Buscar voluntario (no puede
	 * salir el anterior). // 5. Ranking de voluntarios
	 * 
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {

		iniciarAlumnos();

		do {

			dibujarMenu();
			opcion = Integer.parseInt(sc.nextLine());

			switch (opcion) {
			case OPCION_LISTAR:
				listarAlumnos();
				break;
			case OPCION_CREAR:
				crearAlumno();
				break;
			case OPCION_ELIMINAR:
				eliminarAlumno();
				break;
			case OPCION_BUSCAR:
				buscarVoluntario();
				break;
			case OPCION_SALIR:
				System.out.println("Hasta la próxima.");
				break;
			default:
				System.out.println("Lo siento, pero esa opción no es válida. Vuelve a intentarlo.");
				break;
			}

		} while (opcion != 5);

		sc.close();
	}

	public static void iniciarAlumnos() throws Exception {

		// ArrayList<Person> alumnos = new ArrayList<Person>();
		alumnos.add(new Alumno("Gaizka"));
		alumnos.add(new Alumno("Jon A."));
		alumnos.add(new Alumno("Arkaitz"));
		alumnos.add(new Alumno("Andoni"));
		alumnos.add(new Alumno("Verónica"));
		alumnos.add(new Alumno("Manuel"));
		alumnos.add(new Alumno("Mounir"));
		//
		alumnos.add(new Alumno("Ander"));
		//
		alumnos.add(new Alumno("Eder I."));
		alumnos.add(new Alumno("José Luis"));
		alumnos.add(new Alumno("Aritz"));
		alumnos.add(new Alumno("Jon C."));
		alumnos.add(new Alumno("Asier"));
		alumnos.add(new Alumno("Borja"));
		alumnos.add(new Alumno("Eder S."));

	}

	public static void dibujarMenu() {
		System.out.println("\n\n*****************************");
		System.out.println("*****  MENÚ DE ALUMNOS  *****");
		System.out.println("*****************************");
		System.out.println("** 1. Listar alumnos ordenados por ranking. ");
		System.out.println("** 2. Crear alumno");
		System.out.println("** 3. Eliminar alumno.");
		System.out.println("** 4. Buscar voluntario.");
		System.out.println("** 5. Salir.");
		System.out.println("*****************************");
		System.out.print("\nElige una opción: ");
	}

	public static void listarAlumnos() {

		System.out.println("\n\n*****  LISTADO DE ALUMNOS  *****");
		System.out.println("********************************");

		Collections.sort(alumnos, new ComparatorNombre());
		Collections.sort(alumnos);

		System.out.println("###\tNOMBRE\t\tRANKING\n---\t------\t\t-------");
		for (int i = 0; i < alumnos.size(); i++) {
			System.out
					.println((i + 1) + ".\t" + alumnos.get(i).getNombre() + "     \t" + alumnos.get(i).getVoluntario());
		}

	}

	public static void crearAlumno() throws Exception {

		System.out.println("\n\n*****  CREAR ALUMNO  *****");
		System.out.println("**************************");

		System.out.print("\n Introduce el nombre del nuevo alumno: ");
		nombre = sc.nextLine();

		alumnos.add(new Alumno(nombre));
		System.out.print("\n Alumno creado correctamente.");
	}

	public static void eliminarAlumno() {
		System.out.println("\n\n*****  ELIMINAR ALUMNO  *****");
		System.out.println("*****************************");

		System.out.print("\n Introduce el número del alumno a eliminar: ");
		listarAlumnos();
		System.out.print("Número: ");
		opcion = Integer.parseInt(sc.nextLine());

		alumnos.remove(opcion - 1);
		System.out.print("\n Alumno eliminado correctamente.");
	}

	public static void buscarVoluntario() {

		int volunt = (int) Math.floor((Math.random() * alumnos.size()));

		System.out.println("\n\n*****  BUSCAR VOLUNTARIO  *****");
		System.out.println("*******************************");

		// anterior=alumnos.get(volunt).getNombre();

		if (anterior.equals(alumnos.get(volunt).getNombre())) {
			buscarVoluntario();
		} else {
			anterior = alumnos.get(volunt).getNombre();
			alumnos.get(volunt).setVoluntario(1);
			System.out.println("Voluntario: " + alumnos.get(volunt).getNombre());
		}

	}

}
