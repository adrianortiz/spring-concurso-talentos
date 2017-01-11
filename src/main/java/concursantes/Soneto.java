package concursantes;

import org.springframework.stereotype.Component;

@Component("poema")
public class Soneto implements Poema {

	public void recitar() {
		
		String sonetoPasionSorJuana =
				"Este, que ves, engaño colorido, \n"
				+ "que del arte ostentado los primores, \n"
				+ "es cadáver, es polvo, es sombra, es nada. \n";
		
		System.out.println("\nSoneto: " + sonetoPasionSorJuana);
	}
	
}