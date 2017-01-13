package concursantes;

import org.springframework.stereotype.Component;

@Component
public class Voluntario implements Pensador {

	private String pensamientos;
	
	public void pensarEnAlgo(String pensamientos) {
		System.out.println("METHOD: pensarEnAlgo");
		this.pensamientos = pensamientos;
	}
	
	public String getPensamientos() {
		return this.pensamientos;
	}
}