package com.ipartek.formacion.utilidades;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculadoraDevolucionTest {

	@Test(expected = Exception.class)
	public void entregadoMenorImporteException() throws Exception {
		CalculadoraDevolucion.vueltas(100, 2);
	}

	@Test(expected = Exception.class)
	public void ImporteNegativoException() throws Exception {
		CalculadoraDevolucion.vueltas(-100, 2);
	}

	@Test(expected = Exception.class)
	public void EntregadoNegativoException() throws Exception {
		CalculadoraDevolucion.vueltas(100, -2);
	}

	@Test
	public void importeExacto() throws Exception {
		int[] vueltas = CalculadoraDevolucion.vueltas(100, 100);
		for (int i = 0; i < CalculadoraDevolucion.BILLETES_MONEDAS.length; i++) {
			assertEquals(0, vueltas[i]);
		}
	}

	@Test
	public void importeNoExacto() throws Exception {
		/*int[] vueltas = CalculadoraDevolucion.vueltas(500, 501);
		assertEquals("500 €", 0, vueltas[0]);
		assertEquals("200 €", 0, vueltas[1]);
		assertEquals("100 €", 0, vueltas[2]);
		assertEquals("50 €", 0, vueltas[3]);
		assertEquals("20 €", 0, vueltas[4]);
		assertEquals("10 €", 0, vueltas[5]);
		assertEquals("5 €", 0, vueltas[6]);
		assertEquals("2 €", 0, vueltas[7]);
		assertEquals("1 €", 1, vueltas[8]);
		assertEquals("0.50 €", 0, vueltas[9]);
		assertEquals("0.20 €", 0, vueltas[10]);
		assertEquals("0.10 €", 0, vueltas[11]);
		assertEquals("0.05 €", 0, vueltas[12]);
		assertEquals("0.02 €", 0, vueltas[13]);
		assertEquals("0.01 €", 0, vueltas[14]);*/
		
		int[] vueltas2 = CalculadoraDevolucion.vueltas(150.23f, 200);
		assertEquals("500 €", 0, vueltas2[0]);
		assertEquals("200 €", 0, vueltas2[1]);
		assertEquals("100 €", 0, vueltas2[2]);
		assertEquals("50 €", 0, vueltas2[3]);
		assertEquals("20 €", 2, vueltas2[4]);
		assertEquals("10 €", 0, vueltas2[5]);
		assertEquals("5 €", 1, vueltas2[6]);
		assertEquals("2 €", 2, vueltas2[7]);
		assertEquals("1 €", 0, vueltas2[8]);
		assertEquals("0.50 €", 1, vueltas2[9]);
		assertEquals("0.20 €", 1, vueltas2[10]);
		assertEquals("0.10 €", 0, vueltas2[11]);
		assertEquals("0.05 €", 1, vueltas2[12]);
		assertEquals("0.02 €", 1, vueltas2[13]);
		assertEquals("0.01 €", 0, vueltas2[14]);
	}

}
