package test;

import static org.junit.Assert.*;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import concursantes.Concursante;
import concursantes.Malabarista;
import concursantes.Musico;

//Idicamos que vamos a correr una prueba de Spring y jUnit4
@RunWith(SpringJUnit4ClassRunner.class)
// Especificar la ubicacion de nuestro archivo de la fabrica de Spring
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class TestConcursoTalentos {

	private static Log logger = LogFactory.getLog("TestConcursoTalentos");
	
	// Recuperamos beans con @Autowired y usando su identificador @Qualifier
	@Autowired
	@Qualifier("solei")
	private Concursante malabarista1;
	
	@Autowired
	@Qualifier("soleiRecitador")
	private Concursante malabarista2;
	
	@Autowired
	@Qualifier("jasonPiano")
	private Concursante musico1;
	
	@Autowired
	@Qualifier("jasonSax")
	private Concursante musico2;
	
	
	/*
	// Ahora ya no se requiere esto
	@Before
	public void before() {
		// Levantamos la fabrica de Beans de Spring
		// Y solicitamos el Objeto Malabarista de la fabrica con identificador "solei"
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		malabarista1 = (Concursante) ctx.getBean("solei");
		malabarista2 = (Concursante) ctx.getBean("soleiRecitador");

		musico1 = (Concursante) ctx.getBean("jasonPiano");
		musico2 = (Concursante) ctx.getBean("jasonSax");
	}
	*/

	@Test
	public void testMalabarista() {
		
		// Declaración y configración de una prueba
		logger.info("Inicio de ejecutar Malabarista");
		
		// Concursantes Malabarista
		
		// Malabarista 1
		int noPelotas = 10;
		malabarista1.ejecutar();
		
		// Especificamos si el número de pelotas es 5
		// Si es igual al que está utilizando el Malabarista (5 == 5)
		assertEquals(noPelotas, ((Malabarista) malabarista1).getPelotas());
		

		// Malabarista 2
		noPelotas = 15;
		malabarista2.ejecutar();
		assertEquals(noPelotas, ((Malabarista) malabarista2).getPelotas());

		logger.info("Fin de Ejecutar Malabarista");
		
		
		// Concursantes Musico
		logger.info("Inicio de ejecutar Pianista");
		String cancion = "Noche de Paz";
		musico1.ejecutar();
		assertEquals(cancion, ((Musico) musico1).getCancion());
		logger.info("Fin de ejecutiar Pianista");

		logger.info("Inicio de ejecutar Saxofonista");
		cancion = "Equinox";
		musico2.ejecutar();
		assertEquals(cancion, ((Musico) musico2).getCancion());
		logger.info("Fin de ejecutar Saxofonista");
		
		logger.info("Fin de ejecutar Musico");
	}
}
