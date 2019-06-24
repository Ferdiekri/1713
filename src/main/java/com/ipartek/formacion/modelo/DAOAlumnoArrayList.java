package com.ipartek.formacion.modelo;

import java.util.ArrayList;
import java.util.List;

import com.ipartek.formacion.Alumno;

public class DAOAlumnoArrayList implements IPersistible<Alumno> {

	private ArrayList<Alumno> lista;

	public DAOAlumnoArrayList(ArrayList<Alumno> lista) {
		super();
		this.lista = lista;
	}

	public DAOAlumnoArrayList() throws Exception {
		super();
		lista = new ArrayList<Alumno>();
		lista.add(new Alumno(1, "Gaizka"));
		lista.add(new Alumno(3, "Jon A."));
		lista.add(new Alumno(5, "Arkaitz"));
		lista.add(new Alumno(7, "Andoni"));
		lista.add(new Alumno(9, "Ver�nica"));
		lista.add(new Alumno(11, "Manuel"));
		lista.add(new Alumno(13, "Mounir"));
		//
		lista.add(new Alumno(0, "Ander"));
		//
		lista.add(new Alumno(2, "Eder I."));
		lista.add(new Alumno(4, "Jos� Luis"));
		lista.add(new Alumno(6, "Aritz"));
		lista.add(new Alumno(8, "Jon C."));
		lista.add(new Alumno(10, "Asier"));
		lista.add(new Alumno(12, "Borja"));
		lista.add(new Alumno(14, "Eder S."));

	}

	@Override
	public List<Alumno> getAll() {
		return lista;
	}

	@Override
	public Alumno getById(int id) {
		Alumno resul = null;
		for (Alumno a : lista) {
			if (a.getId() == id) {
				resul = a;
				break;
			}
		}
		return resul;
	}

	@Override
	public boolean insert(Alumno pojo) {
		return lista.add(pojo);
	}

	@Override
	public boolean delete(int id) {
		return lista.remove(this.getById(id));
	}

	@Override
	public boolean update(Alumno pojo) {
		boolean resul = false;

		if (pojo != null) {

			for (Alumno a : lista) {

				if (a.getId() == pojo.getId()) {
					// modificar
					int pos = lista.indexOf(a);
					lista.set(pos, pojo);
					resul = true;
					break;
				}
			}
		}

		return resul;
	}

}
