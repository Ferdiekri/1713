package com.ipartek.formacion;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.Test;

public class AlumnoTest {

	@Test
	public void testSortNumVecesLeer() throws Exception {

		ArrayList<Alumno> alumnos = new ArrayList<Alumno>();

		Alumno a = new Alumno("Pepe");
		a.setVoluntario(0);
		alumnos.add(a);

		a = new Alumno("Manoli");
		a.setVoluntario(2);
		alumnos.add(a);

		a = new Alumno("Antton");
		a.setVoluntario(20);
		alumnos.add(a);

		Collections.sort(alumnos);

		assertEquals("Antton", alumnos.get(0).getNombre());
		assertEquals("Manoli", alumnos.get(1).getNombre());
		assertEquals("Pepe", alumnos.get(2).getNombre());

	}

	@Test
	public void testSortNombre() throws Exception {

		ArrayList<Alumno> alumnos = new ArrayList<Alumno>();

		Alumno a = new Alumno("Zapatero");
		a.setVoluntario(0);
		alumnos.add(a);

		a = new Alumno("Anastasia");
		a.setVoluntario(2);
		alumnos.add(a);

		a = new Alumno("Burrito");
		a.setVoluntario(20);
		alumnos.add(a);

		Collections.sort(alumnos, new ComparatorNombre());

		assertEquals("Anastasia", alumnos.get(0).getNombre());
		assertEquals("Burrito", alumnos.get(1).getNombre());
		assertEquals("Zapatero", alumnos.get(2).getNombre());

	}

}