package ar.edu.ort.tp1.prac1.ej1;

import java.util.ArrayList;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Categoria {

	private String nombre;
	private ArrayList<Curso> cursos;
	
	public Categoria(String nombre) {
		this.nombre = nombre;
		this.cursos = new ArrayList<>();
	}

	public Curso buscarCurso(String idCurso) {
		int i = 0;
		Curso c = null;
		while(i < this.cursos.size() && !this.cursos.get(i).mismoId(idCurso)) {
			i++;
		}
		if (i < this.cursos.size()) {
			c = this.cursos.get(i);
		}		
		return c;
	}

	public void agregarCurso(Curso c) {
		this.cursos.add(c);		
	}

}