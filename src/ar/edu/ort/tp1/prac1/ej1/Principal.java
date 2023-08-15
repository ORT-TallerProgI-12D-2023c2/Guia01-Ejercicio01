package ar.edu.ort.tp1.prac1.ej1;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Principal {

	public static void main(String[] args) {
		OrtDemy ortdemy = new OrtDemy();
		cargarUniverso(ortdemy);
				
		System.out.println( ortdemy.suscribirseACurso("gosling3", "java1") ); // ES_AUTOR
		System.out.println( ortdemy.suscribirseACurso("CosmeFulanito", "pasteleria3") ); // SUSCRIPTO_OK
		System.out.println( ortdemy.suscribirseACurso("CosmeFulanito", "pasteleria3") ); // YA_SUSCRIPTO
		System.out.println( ortdemy.suscribirseACurso("fakeUser", "java1") ); // USUARIO_INEX
		System.out.println( ortdemy.suscribirseACurso("CosmeFulanito", "fakeCurso") ); // CURSO_INEX
		System.out.println( ortdemy.suscribirseACurso("becado123", "pasteleria3") ); // SUSCRIPTO_OK
	}
	
	private static void cargarUniverso(OrtDemy ortdemy) {
		Usuario u1 = new Usuario("gosling3", false);
		Usuario u2 = new Usuario("CosmeFulanito", false);
		Usuario u3 = new Usuario("becado123", true);
		
		Categoria cat1 = new Categoria("Programación");
		Categoria cat2 = new Categoria("Cocina");
		
		Curso c1 = new Curso("java1", u1);
		Curso c2 = new Curso("python2", u1);
		Curso c3 = new Curso("pasteleria3", u1);
		Curso c4 = new Curso("sushi4", u1);
		
		cat1.agregarCurso(c1);
		cat1.agregarCurso(c2);
		cat2.agregarCurso(c3);
		cat2.agregarCurso(c4);
		
		ortdemy.agregarCategoria(cat1);
		ortdemy.agregarCategoria(cat2);
		
		ortdemy.agregarUsuario(u1);
		ortdemy.agregarUsuario(u2);
		ortdemy.agregarUsuario(u3);
	}

}