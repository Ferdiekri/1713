package com.ipartek.formacion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import com.ipartek.formacion.modelo.DAOAlumnoArrayList;

public class MenuAlumnos {

	public static ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
	public static Scanner sc = new Scanner(System.in);
	public static String nombre = "";
	public static int opcion = 0;
	public static String anterior = "";

	static DAOAlumnoArrayList dao;

	static final int OPCION_LISTAR = 1;
	static final int OPCION_CREAR = 2;
	static final int OPCION_ELIMINAR = 3;
	static final int OPCION_BUSCAR = 4;
	static final int OPCION_SALIR = 5;

	/**
	 * Programa que cree un men� para los alumnos y elija qui�n es el voluntario.
	 * Tiene que estar encapsulado en m�todos.
	 * 
	 * // Men�: // 1. Listar alumnos. Ordenado por Ranking. // 2. Crear alumno
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
				System.out.println("Hasta la pr�xima.");
				break;
			default:
				System.out.println("Lo siento, pero esa opci�n no es v�lida. Vuelve a intentarlo.");
				break;
			}

		} while (opcion != OPCION_SALIR);

		System.out.println("### Fin del programa. ###");

		sc.close();
	}

	public static void iniciarAlumnos() throws Exception {

		dao = new DAOAlumnoArrayList();

		/*
		 * ArrayList<Person> alumnos = new ArrayList<Person>(); alumnos.add(new
		 * Alumno(1, "Gaizka")); alumnos.add(new Alumno(3, "Jon A.")); alumnos.add(new
		 * Alumno(5, "Arkaitz")); alumnos.add(new Alumno(7, "Andoni")); alumnos.add(new
		 * Alumno(9, "Ver�nica")); alumnos.add(new Alumno(11, "Manuel"));
		 * alumnos.add(new Alumno(13, "Mounir")); // alumnos.add(new Alumno(0,
		 * "Ander")); // alumnos.add(new Alumno(2, "Eder I.")); alumnos.add(new
		 * Alumno(4, "Jos� Luis")); alumnos.add(new Alumno(6, "Aritz")); alumnos.add(new
		 * Alumno(8, "Jon C.")); alumnos.add(new Alumno(10, "Asier")); alumnos.add(new
		 * Alumno(12, "Borja")); alumnos.add(new Alumno(14, "Eder S."));
		 */

	}

	public static void limpiarPantalla() {

		try {
			final String os = System.getProperty("os.name");

			if (os.contains("Windows")) {
				Runtime.getRuntime().exec("cls");
			} else {
				Runtime.getRuntime().exec("clear");
			}
		} catch (final Exception e) {
			// Handle any exceptions.
		}

		/*
		 * for (int i = 0; i < 50; i++) { System.out.println("\n"); }
		 */
	}

	public static void dibujarMenu() throws Exception {

		limpiarPantalla();

		System.out.println("\n\n*****************************");
		System.out.println("*****  MEN� DE ALUMNOS  *****");
		System.out.println("*****************************");
		System.out.println("** 1. Listar alumnos ordenados por ranking. ");
		System.out.println("** 2. Crear alumno");
		System.out.println("** 3. Eliminar alumno.");
		System.out.println("** 4. Elegir voluntario.");
		System.out.println("** 5. Salir.");
		System.out.println("*****************************");
		System.out.print("\nElige una opci�n: ");

		try {
			opcion = Integer.parseInt(sc.nextLine());
		} catch (Exception e) {
			System.out.println("Opci�n incorrecta. Vuelva a intentarlo.");
			dibujarMenu();
		}
	}

	public static void listarAlumnos() {

		System.out.println("\n\n*****  LISTADO DE ALUMNOS  *****");
		System.out.println("********************************");
		alumnos = (ArrayList<Alumno>) dao.getAll();
		Collections.sort(alumnos, new ComparatorNombre());
		Collections.sort(alumnos);

		System.out.println("id\tNOMBRE\t\tRANKING\n---\t------\t\t-------");

		for (Alumno alumno : dao.getAll()) {
			System.out.println(alumno.getId() + "\t" + alumno.getNombre() + "   \t" + alumno.getVoluntario());
		}

	}

	public static void crearAlumno() throws Exception {

		int identificador = 0;
		
		System.out.println("\n\n*****  CREAR ALUMNO  *****");
		System.out.println("**************************");

		try {
			System.out.print("\n Introduce el identificador para " + nombre + ": ");
			identificador = Integer.parseInt(sc.nextLine());
			
			for (Alumno alumno : dao.getAll()) {
				if (alumno.getId() == identificador) {
					System.out.println("Ya existe un alumno con ese identificador. Por favor, vuelva a intentarlo.");
					crearAlumno();
				}	
			}
			
			System.out.print("\n Introduce el nombre del nuevo alumno: ");
			nombre = sc.nextLine();
			
			

			Alumno nuevoAlumno = new Alumno(identificador, nombre);
			dao.insert(nuevoAlumno);
			System.out.print("\n Alumno creado correctamente.");
		} catch (Exception e) {
			System.out.println("Opci�n incorrecta. Vuelve a intentarlo.");
			crearAlumno();
		}
	}

	public static void eliminarAlumno() {
		System.out.println("\n\n*****  ELIMINAR ALUMNO  *****");
		System.out.println("*****************************");

		try {
			System.out.print("\n Introduce el n�mero del alumno a eliminar: ");
			listarAlumnos();
			System.out.print("N�mero: ");
			opcion = Integer.parseInt(sc.nextLine());

			if (dao.delete(opcion)) {
				System.out.print("\n Alumno eliminado correctamente.");
			} else {
				System.out.print("\n No se ha podido eliminar al alumno.");
			}
		} catch (Exception e) {
			System.out.println("Opci�n incorrecta. Vuelve a intentarlo.");
			eliminarAlumno();
		}

	}

	public static void buscarVoluntario() {

		int volunt = (int) Math.floor((Math.random() * dao.getAll().size()));

		System.out.println("\n\n*****  BUSCAR VOLUNTARIO  *****");
		System.out.println("*******************************");

		// anterior=alumnos.get(volunt).getNombre();

		;

		if (anterior.equals(dao.getAll().get(volunt).getNombre())) {
			buscarVoluntario();
		} else {
			anterior = dao.getAll().get(volunt).getNombre();
			alumnos.get(volunt).setVoluntario(1);
			System.out.println("Voluntario elegido: " + dao.getAll().get(volunt).getNombre());
		}
		/*
		 * if (anterior.equals(alumnos.get(volunt).getNombre())) { buscarVoluntario(); }
		 * else { anterior = alumnos.get(volunt).getNombre();
		 * alumnos.get(volunt).setVoluntario(1); System.out.println("Voluntario: " +
		 * alumnos.get(volunt).getNombre()); }
		 */

	}

}
