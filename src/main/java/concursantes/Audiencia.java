package concursantes;

import org.springframework.stereotype.Component;

@Component("audiencia")
public class Audiencia {
	
	public void sentarse() {
		System.out.println("El Show está por comenzar, favor de tomar asiento...");
	}
	
	public void apagarCelulares() {
		System.out.println("Favor de apagar celulares...");
	}
	
	public void aplaudir() {
		System.out.println("El show ha terminado, clap, clap, clap");
	}
	
	public void devolucion() {
		System.out.println("El show fue terrible, se devolverán las entradas");
	}
}
