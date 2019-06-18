package com.ipartek.formacion;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class YouTubeTest {

	Youtube yt;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		yt = new Youtube("Título", "12345678901");
	}

	@After
	public void tearDown() throws Exception {
		yt = null;
	}

	@Test
	public void testYoutube() {
		Youtube ytNull = new Youtube();

		try {
			ytNull.setTitulo(null);
			ytNull.setCodigo(null);
			fail("Datos erroneos.");
		} catch (Exception e) {
		}
	}

	@Test
	public void testYoutubeStringString() throws Exception {
		assertEquals("Título", yt.getTitulo());
		assertEquals("12345678901", yt.getCodigo());
		assertEquals(0, yt.getReproducciones());

		try {
			Youtube ytNull = new Youtube(null, null);
			fail("Datos erroneos.");
		} catch (Exception e) {
		}
	}

	@Test
	public void testGetTitulo() {
		assertEquals("Título", yt.getTitulo());
	}

	@Test
	public void testSetTitulo() throws Exception {
		yt.setTitulo("algo");
		assertEquals("algo", yt.getTitulo());

		try {
			yt.setTitulo("a");
			fail("Título demasiado corto.");
		} catch (Exception e) {

		}

		yt.setTitulo(
				"123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890");
		assertEquals(
				"123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890",
				yt.getTitulo());

		try {
			yt.setTitulo(
					"1234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901");
			fail("Título demasiado largo.");
		} catch (Exception e) {

		}

		try {
			yt.setTitulo(null);
			fail("Título erroneo");
		} catch (Exception e) {
		}
	}

	@Test
	public void testGetCodigo() {
		assertEquals("12345678901", yt.getCodigo());
	}

	@Test
	public void testSetCodigo() throws Exception {

		yt.setCodigo("12345678901");
		assertEquals("12345678901", yt.getCodigo());

		try {
			yt.setCodigo("1234567890");
			fail("Código demasiado corto.");
		} catch (Exception e) {

		}

		try {
			yt.setCodigo("123456789012");
			fail("Código demasiado largo.");
		} catch (Exception e) {

		}

		try {
			yt.setCodigo(null);
			fail("Código erroneo.");
		} catch (Exception e) {

		}
	}

	@Test
	public void testGetReproducciones() {
		assertEquals(0, yt.getReproducciones());
	}

	@Test
	public void testSetReproducciones() throws Exception {
		yt.setReproducciones(0);
		assertEquals(0, yt.getReproducciones());

		yt.setReproducciones(-5);
		assertEquals(-5, yt.getReproducciones());

		yt.setReproducciones(6);
		assertEquals(6, yt.getReproducciones());
	}

	@Ignore
	public void testToString() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetUrl() throws Exception {
		assertEquals((Youtube.URL + yt.getCodigo()), yt.getUrl());

		try {
			yt.setCodigo(null);
			assertEquals((Youtube.URL + yt.getCodigo()), yt.getUrl());
			fail("Código erroneo");
		} catch (Exception e) {

		}

		try {
			yt.setCodigo("1234567890");
			assertEquals((Youtube.URL + yt.getCodigo()), yt.getUrl());
			fail("Código demasiado corto.");
		} catch (Exception e) {

		}

		try {
			yt.setCodigo("123456789012");
			assertEquals((Youtube.URL + yt.getCodigo()), yt.getUrl());
			fail("Código demasiado largo.");
		} catch (Exception e) {

		}
	}

}
