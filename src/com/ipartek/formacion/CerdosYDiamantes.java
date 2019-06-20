package com.ipartek.formacion;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.Test;

public class CerdosYDiamantes {

	@Test
	public void test() {
		ArrayList<Ordenable> lista = new ArrayList<Ordenable>();

		Cerdo c1 = new Cerdo(500,"Tiberio");
		Cerdo c2 = new Cerdo(300,"Peggy");
		Diamante d1 = new Diamante(1000,"Rojo");
		Diamante d2 = new Diamante(200,"Verde");

		lista.add(d2);
		lista.add(d1);
		lista.add(c1);
		lista.add(c2);

		for (Ordenable elemento : lista) {
			if (elemento instanceof Diamante) {
				Diamante diamante = (Diamante)elemento;
				diamante.getColor();
			}

			if (elemento instanceof Cerdo) {
				Cerdo cerdo = (Cerdo)elemento;
				cerdo.getNombre();
			}
		}
		
		Collections.sort(lista, new ComparadorCerdosDiamantes());
		
		assertEquals(d1, lista.get(0));
		assertEquals(c1, lista.get(1));
		assertEquals(c2, lista.get(2));
		assertEquals(d2, lista.get(3));
	}

}
