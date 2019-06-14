package com.ipartek.formacion.excepction;

import java.util.Scanner;

import com.ipartek.formacion.Youtube;

public class CrearVideoYoutube {

	public static void main(String[] args) {

		System.out.println("Vamos a crear un v�deo de YouTube.");

		Scanner sc = new Scanner(System.in);
		boolean repetir = true;
		Youtube video = null;

		do {
			System.out.print("Introduce el t�tulo del v�deo: (2/150 caracteres) ");
			String titulo = sc.nextLine();
			System.out.print("Introduce el c�digo del v�deo: (11 caracteres)");
			String codigo = sc.nextLine();
			try {
				video = new Youtube(titulo, codigo);
				repetir = false;
			} catch (Exception e) {
				System.out.println("Error. " + e.getMessage());
				System.out.println("Vuelve a empezar.");
			}
		} while (repetir);

		System.out.println("V�deo creado correctamente.");
		System.out.println(video);
		sc.close();
	}
	//
}
