package com.ipartek.formacion.utilidades;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class OrdenarArrayTest {

	@Test(expected = Exception.class)
	public void matrizOrdenada() throws Exception {
		int[] ordenada = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] matriz = { 3, 0, 1, 8, 7, 2, 5, 4, 6, 9 };
		assertArrayEquals(ordenada, OrdenarArray.ordenarMatriz(matriz));

		int[] ordenada2 = { 0, 1, 2, 3 };
		int[] matriz2 = { 3, 0, 1, 2 };
		assertArrayEquals(ordenada2, OrdenarArray.ordenarMatriz(matriz2));
		
		int[] ordenada3 = { -1, 1, 2, 3 };
		int[] matriz3 = { 3, -1, 1, 2 };
		assertArrayEquals(ordenada3, OrdenarArray.ordenarMatriz(matriz3));
	}

	@Test(expected = Exception.class)
	public void matrizSinRepes() throws Exception {
		int[] matriz = { 3, 0, 1, 8, 7, 2, 5, 4, 6, 9 };
		@SuppressWarnings("unused")
		int[] devuelta = OrdenarArray.ordenarMatriz(matriz);
	}
	
	@Test(expected = Exception.class)
	public void matrizNula() throws Exception {
		@SuppressWarnings("unused")
		int[] devuelta = OrdenarArray.ordenarMatriz(null);
	}

}