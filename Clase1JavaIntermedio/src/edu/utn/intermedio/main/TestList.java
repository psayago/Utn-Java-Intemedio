package edu.utn.intermedio.main;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;


public class TestList {

	public static void main(String[] args) {
		
		String arreglo[]= {"a","bcb","asd"};
		
		Integer[] enteros = {15,0,12,44,42,21,32,22,7};
		
		List<Integer> listaEnteros = new ArrayList<Integer>(); 
		listaEnteros=Array.asList(enteros);
		
		List<String> lista = new ArrayList<>();
		List<String> lista1 = new ArrayList<>();
		
		for(int i = 0; i<10;i++) {
			lista.add("elemento-"+i);
		}
		
		for(int i = 0; i<10 ; i++) {
			lista1.add(i,"elemento-"+i);
		}
		
		lista.remove(5);
		lista1.remove(5);
		
//		for (int i=0;i<lista.size(); i++) {
//			System.out.println(String.format("lista: %s vs lista1: %s",lista.get(i),lista1.get(i)));
//		}
		
		lista1.forEach(elementoDeLista -> System.out.println(elementoDeLista));
		lista1.sort((a,b) -> a.length()- b.length());
		
		listaEnteros.sort(elem1,elem2);
		
		
	}

}
