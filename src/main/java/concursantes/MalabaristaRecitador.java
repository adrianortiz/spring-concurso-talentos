package concursantes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("soleiRecitador")
public class MalabaristaRecitador extends Malabarista {

	private Poema poema;
	
	public MalabaristaRecitador(Poema poema) {
		super();
		this.poema = poema;
	}
	
	// Inyección automática por constructor, inyectamos valores primitivos y referencias
	// El @Autowired es para Poema también, esto no se aplica a valores primitivos
	// porque no es un objeto
	@Autowired
	public MalabaristaRecitador(@Value("15") int pelotas, Poema poema) {
		super(pelotas);
		this.poema = poema;
	}
	
	public void ejecutar() throws EjecucionExeption {
		super.ejecutar();
		System.out.println("Mientras recita..");
		poema.recitar();
		System.out.println("Termina recitación...");
	}
}
