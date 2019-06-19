package com.ipartek.formacion.herencia;

public abstract class ObjetoGrafico {

	// atributos

	// constructores
	
	// métodos

	public void mover(int x, int y) {
		System.out.printf("Movemos el objeto a la posiciín (%d,%d).", x, y);
	}

	public abstract void dibujar();

}
