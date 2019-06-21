package com.ipartek.formacion.excepction;

import java.util.Scanner;

import com.ipartek.formacion.Youtube;

public class CrearVideoYoutube {

	public static void main(String[] args) {

		System.out.println("Vamos a crear un vídeo de YouTube.");

		Scanner sc = new Scanner(System.in);
		boolean repetir = true;
		Youtube video = null;

		do {
			System.out.print("Introduce el título del vídeo: (2/150 caracteres) ");
			String titulo = sc.nextLine();
			System.out.print("Introduce el código del vídeo: (11 caracteres)");
			String codigo = sc.nextLine();
			try {
				video = new Youtube(titulo, codigo);
				repetir = false;
			} catch (Exception e) {
				System.out.println("Error. " + e.getMessage());
				System.out.println("Vuelve a empezar.");
			}
		} while (repetir);

		System.out.println("Vídeo creado correctamente.");
		System.out.println(video);
		sc.close();
	}
	//
}
