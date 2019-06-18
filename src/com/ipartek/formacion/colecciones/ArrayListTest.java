package com.ipartek.formacion.colecciones;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import org.junit.Test;

public class ArrayListTest {

	@Test
	public void test() {
		// String[] paises = new String[3];
		ArrayList<String> paises = new ArrayList<String>();

		assertTrue(paises.isEmpty());

		paises.add("Barakaldo");
		paises.add("EEUU");
		paises.add("Korea la buena");

		assertEquals(3, paises.size());// La longitud de los paises sea 3

		paises.add(1, "Kuala lumpur");// insetar "Kuala lumpur" entre Barakaldo y EEUU
		assertEquals("Kuala lumpur", paises.get(1));

		paises.add("Barakaldo");// Insertar Barakaldo de nuevo para comprobar que se puede repetir.

		int cont = 0;

		Iterator<String> it = paises.iterator();
		while (it.hasNext()) {
			String pais = it.next();
			if ("Barakaldo".equals(pais)) {
				cont++;
			}
		}
		assertEquals(2, cont);

		assertTrue(paises.remove("Korea la buena"));// Probar a eliminar "Korea la buena"
		assertFalse(paises.remove("Korea la buena"));

		paises.clear();// Porbar a eliminar todo.
		assertTrue(paises.isEmpty());

		assertFalse(paises.contains("Barakaldo")); // Usar CONTAINS para saber existe "Barakaldo" y "Korea la buena".
		assertFalse(paises.contains("Korea la buena"));

		// Mirar cómo ordenar alfabetiacmente.
		paises.add("EEUU");
		paises.add("Korea la buena");
		paises.add("Barakaldo");

		Collections.sort(paises);

		assertEquals("Barakaldo", paises.get(0));
		assertEquals("EEUU", paises.get(1));
		assertEquals("Korea la buena", paises.get(2));

		Collections.reverse(paises);

		assertEquals("Barakaldo", paises.get(2));
		assertEquals("EEUU", paises.get(1));
		assertEquals("Korea la buena", paises.get(0));

	}

}
