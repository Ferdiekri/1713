package com.ipartek.formacion;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FicherosEjemplo01 {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		// String ficheroNombrePersonas = "C:\\1713\\eclipse-workspace\\1713\\personas.txt";
		// ObjectOutputStream oos = new ObjectOutputStream(new
		// FileOutputStream(ficheroNombrePersonas));
		// oos.writeObject(new Person("Manolito"));
		// oos.flush();

		// TODO leer objketo del fichero
		// @see http://www.chuidiang.org/java/ficheros/ObjetosFichero.php

		
		

		System.out.println("Ejercicio Ficheros");
		String ficheroNombre = "C:\\1713\\eclipse-workspace\\1713\\ejemploFichero.txt";

		try (Scanner sc = new Scanner(System.in);
				FileWriter fw = new FileWriter(ficheroNombre);
				BufferedWriter bf = new BufferedWriter(fw);
				BufferedReader br = new BufferedReader(new FileReader(ficheroNombre));) {

			System.out.println("Escribe algo");
			String linea1 = sc.nextLine();
			System.out.println("Escribe algo mas por favor");
			String linea2 = sc.nextLine();

			bf.write(linea1);
			bf.newLine();
			bf.write(linea2);
			// TODO mirar para no resetear

			String linea;
			while ((linea = br.readLine()) != null) {

				System.out.println(linea);

			}

			System.out.println("Terminamos de leer");
		}

	}

}
