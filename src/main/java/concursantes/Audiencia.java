package concursantes;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

@Component("audiencia")
public class Audiencia {
	
	/*
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
	}*/
	
	public void monitorearShow(ProceedingJoinPoint joinpoint) throws Throwable {
		
		try {
			System.out.println("El Show está por comenzar, favor de tomar asiento...");
			System.out.println("Favor de apagar celulares...");
			
			// Anotamos la hora de inicio
			long horaInicio = System.currentTimeMillis();
			
			// Se llama al método de negocio (método Objetivo)
			joinpoint.proceed();
			
			Thread.sleep(1000); // 1 segundo
			// Este delay en limisegundos es opcional y se puede poner en los métodos
			// de negocio para simular la duración del método
			
			long horaTermino = System.currentTimeMillis();
			
			System.out.println("El show ha terminado, aplausos");
			System.out.println("El show tuvo una duración: " + (horaTermino - horaInicio));
			
		} catch (Exception e) {
			System.out.println("El show fue terrible, se devolverán las entradas");
		}
	}
}
