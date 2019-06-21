package com.ipartek.formacion.utilidades;

/**
 * Una clase que devuelva la devolucion de una compra con las monedas y los
 * billetes óptimos.
 * 
 * @author Eder Ibáñez Rojo
 *
 */
public class CalculadoraDevolucion {

	public static final float[] BILLETES_MONEDAS = {
			// billetes
			500, 200, 100, 50, 20, 10, 5,
			// monedas
			2, 1, 0.50f, 0.20f, 0.10f, 0.05f, 0.02f, 0.01f };

	/**
	 * Calcula las vueltas óptimas para retornar el menor número de billetes y
	 * monedas.
	 * 
	 * @param importe   (float) costo del artículo a comprar.
	 * @param entregado (float) el dinero entregado entregado para comprar.
	 * @return (int[]) cantidad de billetes y monedas retornadas.
	 * @see public static final float[] BILLETES_MONEDAS
	 * @throws Exception importe > entregado o si importe < 0 o entregado < 0
	 */
	public static int[] vueltas(float importe, float entregado) throws Exception {
		int vueltas[] = new int[BILLETES_MONEDAS.length];
		float restante = entregado-importe;

		// System.out.println((int) Math.floor(9.8));

		if (entregado < importe) {
			throw new Exception("No has entregado suficiente dinero.");
		} else if (importe < 0) {
			throw new Exception("El importe del producto no puede ser negativo.");
		} else if (entregado < 0) {
			throw new Exception("No se puede pagar con dinero negativo.");
		} else if (entregado != importe) {
			for (int i = 0; i < vueltas.length; i++) {
				
				vueltas[i] = (int) Math.floor(restante/BILLETES_MONEDAS[i]);
				restante = restante - (vueltas[i] * BILLETES_MONEDAS[i]);
			}
		}
		
		//en java sólo puede haber un RETURN

		return vueltas; //en java sólo puede haber un RETURN
	}

}
