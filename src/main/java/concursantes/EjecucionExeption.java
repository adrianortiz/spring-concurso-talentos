package concursantes;

public class EjecucionExeption extends RuntimeException {
	
	public EjecucionExeption() {
		
	}
	
	public EjecucionExeption(String msg) {
		super(msg);
	}
}
