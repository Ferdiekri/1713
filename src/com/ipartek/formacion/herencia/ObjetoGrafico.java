package com.ipartek.formacion.herencia;

public abstract class ObjetoGrafico {

	// atributos

	// constructores
	
	// m�todos

	public void mover(int x, int y) {
		System.out.printf("Movemos el objeto a la posici�n (%d,%d).", x, y);
	}

	public abstract void dibujar();

}
