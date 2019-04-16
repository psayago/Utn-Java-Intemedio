package edu.utn.intermedio.main;

import edu.utn.intermedio.modelo.Boxeador;
import edu.utn.intermedio.modelo.Categoria;
import edu.utn.intermedio.modelo.Entrenador;

public class InscripcionGimnasio {

	public static void main(String[] args) {
		
		Boxeador box = new Boxeador("Pepe");
		box.setCategoria(Categoria.LIGERO);
		Boxeador box2 = new Boxeador("Pipo");
		box2.setCategoria(Categoria.PESADO);
		Boxeador box3 = new Boxeador("Peppo");
		
		
		System.out.println(box3);
		System.out.println(box2);

		
		Entrenador ent = new Entrenador("Juan", Categoria.PLUMA, Categoria.PESADO,2 );
		System.out.println(ent.asignarBoxeador(box));
		System.out.println(ent.asignarBoxeador(box2));
		System.out.println(ent.asignarBoxeador(box3));
		
		System.out.println("");
		
		System.out.println("Mostrar boxeadores:");
		ent.imprimirBoxeadores();


	}

}
