package edu.utn.intermedio.modelo;

import java.time.LocalDateTime;
import java.util.Collection;

public interface Identificable {
	public String identificate();
	
	public default void saludar() {
		LocalDateTime fechaHora =LocalDateTime.now();
		int horaActual= fechaHora.getHour()*100 + fechaHora.getMinute();
		
		Collection<String> coleccion;
						
		if (600<=horaActual&&horaActual<=1200) {
	    	System.out.println("Buenos dias...");
	    }else if (1200<horaActual&&horaActual<2000) {
	    	System.out.println("Buenos tardes...");
	    }else System.out.println("Buenos noches...");
	    	
	}	

}
