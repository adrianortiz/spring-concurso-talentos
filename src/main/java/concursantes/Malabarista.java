package concursantes;

import org.springframework.stereotype.Component;

// @Component
// Por defecto es el nombre de la clase "malabarista"

@Component("solei")
public class Malabarista implements Concursante {

	private int pelotas = 10;
	
	public Malabarista() {}
	
	public Malabarista(int pelotas) {
		this.pelotas = pelotas;
	}
	
	public void ejecutar() throws EjecucionExeption {
		System.out.println("Malabareo " + pelotas + " pelotas");
	}

	public int getPelotas() {
		return pelotas;
	}

	public void setPelotas(int pelotas) {
		this.pelotas = pelotas;
	}
}
