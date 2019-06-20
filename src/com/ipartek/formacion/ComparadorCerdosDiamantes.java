package com.ipartek.formacion;

import java.util.ArrayList;
import java.util.Comparator;

public class ComparadorCerdosDiamantes implements Comparator<Ordenable> {


	@Override
	public int compare(Ordenable o1, Ordenable o2) {
		return o2.getValor() - o1.getValor();
	}

}
