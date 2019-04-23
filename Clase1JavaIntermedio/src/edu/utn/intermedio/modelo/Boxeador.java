package edu.utn.intermedio.modelo;

import java.time.LocalDate;

public class Boxeador extends Persona implements Identificable{
	private Categoria categoria;
	private int cantMinutosEntrenamiento;
	
	public Boxeador(String x) {
		this.setNombre(x);
	}	

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	public int getCantMinutosEntrenamiento() {
		return cantMinutosEntrenamiento;
	}

	public void setCantMinutosEntrenamiento(int cant_minutos_entrenamiento) {
		this.cantMinutosEntrenamiento = cant_minutos_entrenamiento;
	}
	//SOBRECARGA
	//********************************************************************
	public void entrenarse() {
		System.out.println("Comienzo entrenamiento:");
		for (int i=0;i<cantMinutosEntrenamiento;i++) {
			System.out.print("x");	
			try {
				Thread.sleep(500);			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("");
		System.out.println("Fin Entrenamiento");
	}
	
	public void entrenarse(int minutos) {
		System.out.println("Comienzo entrenamiento:");
		for (int i=0;i<minutos;i++) {
			System.out.print("x");
			try {
				Thread.sleep(500);			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("");
		System.out.println("Fin Entrenamiento");
	}
	
	public void entrenarse(int cantMinutos, boolean intenso) {
		System.out.println("Comienzo entrenamiento:");
		String marcaEntrenamiento = intenso?"X":"x";
		for (int i=0;i<cantMinutos;i++) {
			System.out.print(marcaEntrenamiento);
			try {
				Thread.sleep(500);			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("");
		System.out.println("Fin Entrenamiento");
	}
	//*********************************************************************  
	//SOBRECARGA
	@Override
	public String toString() {
		String laCategoria =(categoria == null?"sincategoria":categoria.toString());
		return this.getNombre() + " " + laCategoria;
	}
	

	@Override
	public void presentarse() {
		String presentacion = String.format("%s : %s : %s",getNombre(),getCategoria().toString(),getIdentificacion());
		System.out.println(presentacion);
		
	}

	@Override
	public boolean esMayorDeEdad() {
		LocalDate fecha = LocalDate.now();
		int anioActual = fecha.getYear();
		return anioActual-this.getAnioNacimiento() >= 15;
	}

	@Override
	public String identificacion() {
		return this.getIdentificacion();
	}
	

}
