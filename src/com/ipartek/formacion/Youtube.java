package com.ipartek.formacion;

public class Youtube {

	private static final int LONGITUD_CODIGO = 11;
	private static final String URL = "https://www.youtube.com/watch?v=";
	private static final int LONGITUD_MIN_TITULO = 2;
	private static final int LONGITUD_MAX_TITULO = 150;
	// https://www.youtube.com/watch?v=

	// atributos

	private String titulo; // minimo 2 letras & m�ximo 150 letras
	private String codigo; // exactamente 11 d�gitos
	private int reproducciones;

	// constructores

	public Youtube() {
		super();
		this.titulo = "Sin t�tulo";
		this.codigo = "XXXXXXXXXXX";
		this.reproducciones = 0;
	}

	public Youtube(String titulo, String codigo) throws Exception {
		this();
		// this.titulo = titulo;
		// this.codigo = codigo;
		this.setTitulo(titulo);
		this.setCodigo(codigo);
	}

	// getters & setters

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) throws Exception {
		if ((titulo != null) && (titulo.length() >= LONGITUD_MIN_TITULO) && (titulo.length() <= LONGITUD_MAX_TITULO)) {
			this.titulo = titulo;
		} else {
			throw new Exception("La longitud del t�tulo debe estar entre " + LONGITUD_MIN_TITULO + " y "
					+ LONGITUD_MAX_TITULO + ".");
		}
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) throws Exception {
		if ((codigo != null) && (codigo.length() == LONGITUD_CODIGO)) {
			this.codigo = codigo;
		} else {
			throw new Exception("La longitud del c�digo debe ser " + LONGITUD_CODIGO + ".");
		}
	}

	public int getReproducciones() {
		return reproducciones;
	}

	public void setReproducciones(int reproducciones) {
		this.reproducciones = reproducciones;
	}

	// resto de funciones

	@Override
	public String toString() {
		return "Youtube [titulo=" + titulo + ", codigo=" + codigo + ", reproducciones=" + reproducciones + "]";
	}

	public String getUrl() {
		return URL + this.codigo;
	}
}
