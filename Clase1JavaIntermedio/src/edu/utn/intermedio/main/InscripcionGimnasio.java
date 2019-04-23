 package edu.utn.intermedio.main;

import java.util.ArrayList;
import java.util.Collection;

import edu.utn.intermedio.modelo.Boxeador;
import edu.utn.intermedio.modelo.Categoria;
import edu.utn.intermedio.modelo.Entrenador;
import edu.utn.intermedio.modelo.Identificable;
import edu.utn.intermedio.modelo.Recurso;

public class InscripcionGimnasio {

	public static void main(String[] args) {
		
		
		Collection<Identificable> activosGimnasio = new ArrayList();
		
		Boxeador box = new Boxeador("Pepe");
		box.setCategoria(Categoria.mediano);
		Boxeador box2 = new Boxeador("Pipo");
		box2.setCategoria(Categoria.welter);
		Boxeador box3 = new Boxeador("Peppo");
		
		
		System.out.println(box3);
		System.out.println(box2);

		
		Entrenador ent = new Entrenador("maximiliano", Categoria.mediano, Categoria.pesado,3);
		
		
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
		
		/*
		System.out.println("SOBRECARGA...");
		box.setCantMinutosEntrenamiento(6);
		box.entrenarse();
		box.entrenarse(8);
		box.entrenarse(8,true);
		*/
		System.out.println("Entrenador comienza a entrenar a sus boxeadores ");
		ent.entrenar();
		
		Recurso recurso1 = new Recurso();
		recurso1.setEtiqueta("MN-0419");
		activosGimnasio.add(recurso1);
		
		Recurso recurso2 = new Recurso();
		recurso1.setEtiqueta("MN-0419");
		activosGimnasio.add(recurso2);
		
		Recurso recurso3 = new Recurso();
		recurso1.setEtiqueta("MN-0419");
		activosGimnasio.add(recurso3);
		
	}

}
