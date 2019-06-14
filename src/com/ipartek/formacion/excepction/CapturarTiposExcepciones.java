package com.ipartek.formacion.excepction;

import com.ipartek.formacion.Perro;
import com.ipartek.formacion.PerroException;
import com.ipartek.formacion.Person;
import com.ipartek.formacion.PersonException;

/**
 * Se pueden capturar m�s de un tipo de excepciones. Siempre la �ltima en
 * capturar que sea Exception que es la m�s gen�rica.
 * 
 * @author Curso
 *
 */
public class CapturarTiposExcepciones {
	public static void main(String[] args) {

		try {
			Person persona = new Person();
			persona.setNombre(null);
			Perro[] p = new Perro[3];
			System.out.println(p[3].toString());

		} catch (PersonException e) {
			System.out.println("Excepci�n de Persona.");
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Excepci�n de �ndice del Array.");
			e.printStackTrace();
		} catch (PerroException e) {
			System.out.println("Excepci�n de Perro.");
			e.printStackTrace();
		} catch (NullPointerException e) {
			System.out.println("Excepci�n NULL.");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Excepci�n gen�rica. Siempre la �ltima.");
			e.printStackTrace();
		}
	}
}
