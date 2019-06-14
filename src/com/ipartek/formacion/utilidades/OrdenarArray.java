package com.ipartek.formacion.utilidades;

/**
 * Una clase que nos ordene los números de una Array[10]. Ordenar con
 * Bubbleshort 3018725469
 * 
 * @author Curso
 *
 */
public class OrdenarArray {

	/**
	 * Una clase que nos ordene los números de una Array[] de menor a mayor. Ordenar con Bubbleshort.
	 * @param matriz(Array) números desordenados. 3018725469
	 * @throws Exception si matriz == null.
	 * @return (int[]) ordenado de menor a mayor.
	 * @throws Exception
	 */
	public static int[] ordenarMatriz(int[] matriz) throws Exception {
		int volcado;
		
		if (matriz==null) {
			throw new Exception("La matriz no puede tener valor NULL.");
			
		}

		for (int i = 0; i < matriz.length; i++) {
			for (int j = i; j < matriz.length; j++) {
				if (matriz[i] == matriz[j]) {
					throw new Exception("No se puede ordenar la matriz con números repetidos.");
				} else if (matriz[i] > matriz[j]) {
					volcado = matriz[i];
					matriz[i] = matriz[j];
					matriz[j] = volcado;
				}
			}
		}
		return matriz;
	}

}
