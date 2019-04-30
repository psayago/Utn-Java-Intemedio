package edu.utn.intermedio.main;

import java.util.ArrayList;
import java.lang.Math;
import java.util.List;


public class TestLambda {

	public static void main(String[] args) {
		
		List <Integer> enteros = new ArrayList<>();
		
		for (int i = 1; i<=10;i++) {
			enteros.add(i);
		}
		
		enteros.forEach(ent -> System.out.println(ent));
		/*
		enteros.replaceAll(ent-> {
		                   double potencia = Math.pow(ent, 2);
		                   Double cuadrado=Double.valueOf(potencia);
		                   return cuadrado.intValue();
		                   });
		System.out.println("Los valores al cuadrado son:");
		enteros.forEach(ent -> {
			             if(ent%2==1)   System.out.println(ent);
			                    	
			            });
		*/
		enteros.removeIf(ent-> esMultiploDeCuatro(ent));
		System.out.println("Sacando los multiplos de cuatro:");
		enteros.forEach(i -> System.out.println(i));
		
	}

	public static boolean esMultiploDeCuatro(Integer entero) {
		return entero%4==0;
	}
                   	
           
}
