package ar.edu.ort.tp1.prac1.ej1;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Usuario {
	
	private String id;
	private boolean becado;	

	public Usuario(String id, boolean becado) {
		this.id = id;
		this.becado = becado;
	}

	public boolean isBecado() {
		return becado;
	}

	public boolean mismoId(String idUsuario) {
		return this.id.equals(idUsuario);
	}

}