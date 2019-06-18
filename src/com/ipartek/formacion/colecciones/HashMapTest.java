package com.ipartek.formacion.colecciones;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.HashMap;
import java.util.Iterator;

import org.junit.Test;

public class HashMapTest {

	@Test
	public void test() {
		HashMap<String, String> paises = new HashMap<String, String>();

		paises.put("bk", "Barakaldo");
		paises.put("eu", "EE UU");
		paises.put("ko", "Korea");
		
		assertEquals(3, paises.size());
		
		
		assertEquals("Barakaldo", paises.get("bk"));
		assertNull(paises.get("No existe Key"));
		
		
		paises.put("bk", "Barakaldo");
		
		int cont=0;
		// paises.keySet(); //array de la columna KEY
		// paises.values(); //array de la columna VALUES
		
		Iterator<String> it = paises.values().iterator(); // @see paises.keySet()
		while (it.hasNext() ) {
			String pais = it.next();
			if ("Barakaldo".toUpperCase().equals(pais.toUpperCase())) {
				cont++;
			}
		}
		
		assertEquals(1, cont); 
		
		
		
		
	}

}
