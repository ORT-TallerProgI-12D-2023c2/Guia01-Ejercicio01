package ar.edu.ort.tp1.prac1.ej1;

import java.util.ArrayList;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Curso {

	private final static int MAX_BECADOS = 5;
	private String id;
	private ArrayList<Leccion> lecciones;
	private Usuario autor;
	private ArrayList<Usuario> suscriptos;
	private int contBecados;
	
	public Curso(String id, Usuario autor) {
		this.id = id;
		this.autor = autor;
		this.contBecados = 0;
		lecciones = new ArrayList<>();
		suscriptos = new ArrayList<>();
	}

	public boolean mismoId(String idCurso) {
		return this.id.equals(idCurso);
	}

	public boolean hayVacantesParaBecados() {
		return contBecados < MAX_BECADOS;
	}

	public Resultado suscribir(Usuario u) {
		Resultado res;
		if (this.esAutor(u)) {
			res = Resultado.ES_AUTOR;
		} else if (u.isBecado() && !this.hayVacantesParaBecados()) {
			res = Resultado.MAX_BECADOS;
		} else if (this.estaSuscripto(u)) {
			res = Resultado.YA_SUSCRIPTO;
		} else {
			this.suscriptos.add(u);	
			res = Resultado.SUSCRIPTO_OK;
			if ( u.isBecado() ) {		
				contBecados++;
			}	
		}
		
		return res;		
	}

	private boolean estaSuscripto(Usuario u) {
		return suscriptos.contains(u);
	}

	private boolean esAutor(Usuario u) {
		return this.autor == u;
	}

}