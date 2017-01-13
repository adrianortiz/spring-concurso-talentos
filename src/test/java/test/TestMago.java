package test;

import static org.junit.Assert.assertEquals;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import concursantes.Adivinador;
import concursantes.Pensador;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class TestMago {
	
	private static Log logger = LogFactory.getLog("TestMago");
	@Autowired
	private Pensador voluntario;
	@Autowired
	private Adivinador mago;

	@Test
	public void testMagoAdivinador() {
		logger.info("Inicio de la adivinacion");
		voluntario.pensarEnAlgo("Hoy ganare la loteria");
		assertEquals("Hoy ganare la loteria", mago.getPensamientos());
		logger.info("Fin de Adivinacion");
	}
}