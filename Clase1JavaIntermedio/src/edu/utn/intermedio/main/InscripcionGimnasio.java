 package edu.utn.intermedio.main;

import edu.utn.intermedio.modelo.Boxeador;
import edu.utn.intermedio.modelo.Categoria;
import edu.utn.intermedio.modelo.Entrenador;

public class InscripcionGimnasio {

	public static void main(String[] args) {
		
		Boxeador box = new Boxeador("Pepe");
		box.setCategoria(Categoria.mediano);
		Boxeador box2 = new Boxeador("Pipo");
		box2.setCategoria(Categoria.welter);
		Boxeador box3 = new Boxeador("Peppo");
		
		
		System.out.println(box3);
		System.out.println(box2);

		
		Entrenador ent = new Entrenador("maximiliano", Categoria.mediano, Categoria.pesado,2 );
		
		
		ent.setAnioNacimiento(1999);		
		System.out.println(ent.esMayorDeEdad());
		
		box2.setAnioNacimiento(2002);
		System.out.println(box2.esMayorDeEdad());
		
		ent.setIdentificacion("1321321");
		
		
		
		System.out.println(ent.asignarBoxeador(box));
		System.out.println(ent.asignarBoxeador(box2));
		System.out.println(ent.asignarBoxeador(box3));
		
		
		System.out.println("");
		ent.presentarse();
		System.out.println("Mostrar boxeadores:");
		ent.imprimirBoxeadores();
		
		System.out.println(ent.esNombreValido());

	}

}
