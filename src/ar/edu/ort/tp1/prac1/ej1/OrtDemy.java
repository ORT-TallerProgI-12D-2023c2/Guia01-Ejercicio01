package ar.edu.ort.tp1.prac1.ej1;

import java.util.ArrayList;

/**
 * Código generado por la app UXFtoJava by Charly Cimino
 * 
 * @see https://github.com/CharlyCimino/uxf-to-java
 */
public class OrtDemy {

	private ArrayList<Usuario> usuarios;
	private ArrayList<Categoria> categorias;

	public OrtDemy() {
		usuarios = new ArrayList<>();
		categorias = new ArrayList<>();
	}

	public Resultado suscribirseACurso(String idUsuario, String idCurso) {
		Resultado res;

		Usuario u = buscarUsuario(idUsuario);
		if (u == null) {
			res = Resultado.USUARIO_INEX;
		} else {
			Curso c = buscarCurso(idCurso);
			if (c == null) {
				res = Resultado.CURSO_INEX;
			} else {
				res = c.suscribir(u);				
			}			
		}
		return res;
	}

	private Curso buscarCurso(String idCurso) {
		Curso c = null;
		int i = 0;
		while (i < this.categorias.size() && c == null) {
			c = this.categorias.get(i).buscarCurso(idCurso);
			i++;
		}
		return c;
	}

	private Usuario buscarUsuario(String idUsuario) {
		int i = 0;
		Usuario u = null;
		while(i < this.usuarios.size() && !this.usuarios.get(i).mismoId(idUsuario)) {
			i++;
		}
		if (i < this.usuarios.size()) {
			u = this.usuarios.get(i);
		}		
		return u;
	}

	public void agregarCategoria(Categoria cat) {
		this.categorias.add(cat);		
	}

	public void agregarUsuario(Usuario u) {
		this.usuarios.add(u);		
	}

}