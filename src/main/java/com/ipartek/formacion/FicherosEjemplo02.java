package com.ipartek.formacion;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FicherosEjemplo02 {

	public static void main(String[] args) throws Exception {

		// TODO leer objketo del fichero
		// @see http://www.chuidiang.org/java/ficheros/ObjetosFichero.php

		System.out.println("Ejercicio Ficheros (Separado por ;)");

		String ficheroNombre = "C:\\1713\\eclipse-workspace\\1713\\ejemploFicheroPuntoYComa.txt";

		Person p1 = new Person("Eder", 34, 'H');
		Person p2 = new Person("Pepa", 13, 'M');

		String registro1 = null;
		registro1 = p1.getNombre() + ";";
		registro1 += p1.getEdad() + ";";
		registro1 += p1.getSexo();

		String registro2 = null;
		registro2 = p2.getNombre() + ";";
		registro2 += p2.getEdad() + ";";
		registro2 += p2.getSexo();

		System.out.println("El registro1 es: " + registro1);
		System.out.println("El registro2 es: " + registro2);
		System.out.println("------------------------------");
		
		try (FileWriter fw = new FileWriter(ficheroNombre);
				BufferedWriter bf = new BufferedWriter(fw);
				BufferedReader br = new BufferedReader(new FileReader(ficheroNombre));) {

			bf.write(registro1);
			bf.newLine();
			bf.write(registro2);
			bf.close();
			// TODO mirar para no resetear

			String linea;
			System.out.println("Empezamos a leer");
			Person p3= new Person();
			
			
			while ((linea = br.readLine()) != null) {
				System.out.println("Línea leida: " + linea);
				
				String[] campos = linea.split(";");
					p3.setNombre(campos[0]);
					p3.setEdad(Integer.parseInt(campos[1]));
					p3.setSexo(campos[2].charAt(0));

			}
			System.out.println("Terminamos de leer");
			
			System.out.println("------------------------------");
			System.out.println("Vamos a leer Persona3");
			System.out.println(p3.toString());
			
			// String[] campos = lineaSimulada.split(";");
		}

	}

}
