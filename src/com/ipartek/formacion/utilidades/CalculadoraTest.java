package com.ipartek.formacion.utilidades;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void sumar() {

		int resultado = Calculadora.sumar(2, 3);
		assertEquals("No suma bien.", 5, resultado);
	}

	@Test
	public void restar() {
		assertEquals("No resta bien.", 0, Calculadora.restar(2, 2));
		assertEquals("No resta bien.", -1, Calculadora.restar(2, 3));
		assertEquals("No resta bien.", 1, Calculadora.restar(3, 2));
	}

	@Test
	public void multiplicar() {
		assertEquals(4, Calculadora.multiplicar(2, 2));
		assertEquals(0, Calculadora.multiplicar(2, 0));
		assertEquals(0, Calculadora.multiplicar(0, 2));
		assertEquals(-4, Calculadora.multiplicar(2, -2));
	}

	@Test(expected = ArithmeticException.class)
	public void dividir() {
		assertEquals(0, Calculadora.dividir(0, 2));
		assertEquals(2, Calculadora.dividir(5, 2)); // Porque la función devuelve int
		assertEquals(5, Calculadora.dividir(10, 2));
		assertEquals(-5, Calculadora.dividir(10, -2));

		// Calculadora.dividir(2, 0);
	}

}

// Cosas que funcionan así:
	// El orden de los Test no sigue el orden de lo que se ha declarado. Son pruebas aisladas de otros Test.
	// Otra cosa que no se acuerda.


