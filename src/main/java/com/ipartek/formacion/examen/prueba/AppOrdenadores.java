package com.ipartek.formacion.examen.prueba;

import java.util.ArrayList;
import java.util.Scanner;

public class AppOrdenadores {

	static final int OPCION_CREAR_ORDENADOR = 1;
	static final int OPCION_CREAR_PORTATIL = 2;
	static final int OPCION_LISTAR_TODO = 3;
	static final int OPCION_SUBMENU_PORTATILES = 4;
	static final int OPCION_SALIR_GUARDAR = 5;
	static final int OPCION_SALIR = 6;
	static final int BUCLE_PORTATILES = 5; // Número de veces que se repetirá.

	public static int opcion = 0;
	public static Scanner sc = new Scanner(System.in);
	public static Ordenador ordenador = new Ordenador();
	public static Portatil portatil = new Portatil();

	public static void main(String[] args) throws Exception {

		do {

			dibujarMenu();

			switch (opcion) {
			case OPCION_CREAR_ORDENADOR:
				crearOrdenador();
				break;
			case OPCION_CREAR_PORTATIL:
				crearPortatil();
				break;
			case OPCION_LISTAR_TODO:
				listarTodo();
				break;
			case OPCION_SUBMENU_PORTATILES:
				menuPortatiles();
				break;
			case OPCION_SALIR_GUARDAR:
				guardarFichero();
				break;
			case OPCION_SALIR:
				System.out.println("Hasta la próxima.");
				break;
			default:
				System.out.println("Lo siento, pero esa opción no es válida. Vuelve a intentarlo.");
				break;
			}

		} while (opcion != OPCION_SALIR);

		System.out.println("### Fin del programa. ###");

		sc.close();

	} // main

	public static void dibujarMenu() throws Exception {

		System.out.println("\n\n *******************************");
		System.out.println("*****  MENÚ DE ORDENADORES  *****");
		System.out.println(" *******************************");
		System.out.println("** 1. Introducir un ordenador. ");
		System.out.println("** 2. Introducir un portatil.");
		System.out.println("** 3. Listar ordenadores & portátiles");
		System.out.println("** 4. Ir al submenú de portátiles.");
		System.out.println("** 5. Salir y guardar.");
		System.out.println("** 6. Salir sin guardar.");
		System.out.println("*****************************");
		System.out.print("\nElige una opción: ");

		try {
			opcion = Integer.parseInt(sc.nextLine());
		} catch (Exception e) {
			System.out.println("Opción incorrecta. Vuelva a intentarlo.");
			dibujarMenu();
		}
	} // dibujarMenu

	private static void crearOrdenador() {

		System.out.println("\n\n ***************************");
		System.out.println("*****  NUEVO ORDENADOR  *****");
		System.out.println(" ***************************");
		
		try {
		System.out.print("Introduce el nombre del modelo: ");
		ordenador.setNombre(sc.nextLine());

		System.out.print("Introduce el nombre de la placa base: ");
		ordenador.setPlacaBase(sc.nextLine());

		System.out.print("Introduce los MHz de la CPU: ");
		ordenador.setCpu(Float.parseFloat(sc.nextLine()));

		System.out.print("Introduce la velocidad del procesador (32/64 bits): ");
		ordenador.setCpu(Float.parseFloat(sc.nextLine()));

		System.out.println("Ordenador creado correctamente.");
		
		} catch (Exception e) {
			System.out.println("Dato incorrecto. Vuelva a intentarlo.");
			crearOrdenador();
		}

	} // crearOrdenador

	private static void crearPortatil() {

		System.out.println("\n\n **************************");
		System.out.println("*****  NUEVO PORTATIL  *****");
		System.out.println(" **************************");
		try {
			System.out.print("Introduce la resolución de la pantalla: ");
			portatil.setResolucion(Float.parseFloat(sc.nextLine()));

			System.out.print("Introduce la carga de la batería: ");
			portatil.setBateria(Integer.parseInt(sc.nextLine()));

			System.out.println("Portatil creado correctamente.");
			
		} catch (Exception e) {
			System.out.println("Dato incorrecto. Vuelva a intentarlo.");
			crearPortatil();
		}

	} // crearPortatil

	private static void listarTodo() {
		System.out.println(ordenador.toString());
		System.out.println(portatil.toString());

	} // listarTodo

	private static void menuPortatiles() {

		System.out.println("\n\n ******************************");
		System.out.println("*****  ORDENAR PORTATILES  *****");
		System.out.println(" ******************************");

		ArrayList<Portatil> laptops = new ArrayList<Portatil>();
		for (int i = 0; i < BUCLE_PORTATILES; i++) {
			crearPortatil();
			laptops.add(portatil);
		}

		// Collections.sort(portatiles);

		for (Portatil lt : laptops) {
			System.out.println(lt.toString());
		}

	} // menuPortatiles

	private static void guardarFichero() {
		// TODO Auto-generated method stub

	} // guardarFichero
}
