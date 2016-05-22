package fiuba.algo3.tests;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import fiuba.algo3.modelo.Persona;
import fiuba.algo3.modelo.Evento;
import java.util.Calendar;

public class PersonaTests {

	@Test
	public void testCrearPersona(){
		Persona unaPersona = new Persona();
		unaPersona.setNombre("Juan");
		
		Assert.assertTrue(unaPersona.getNombre() == "Juan");
	}

	@Test
	public void testEstaOcupado(){

		Calendar fecha = Calendar.getInstance();
		fecha.set(Calendar.YEAR, 2016);
		fecha.set(Calendar.MONTH, 6);
		fecha.set(Calendar.DAY_OF_MONTH, 2);

		Evento unEvento = new Evento();
		unEvento.setNombre("Estudiar algebra");
		unEvento.setFecha(fecha);

		Persona unaPersona = new Persona();
		unaPersona.setNombre("Juan");
		unaPersona.agregarEvento(unEvento);

		Assert.assertTrue(unaPersona.estaOcupadoEnFecha(fecha));
	}

	@Test
	public void testAgregarEvento(){

		Calendar fecha = Calendar.getInstance();
		fecha.set(Calendar.YEAR, 2016);
		fecha.set(Calendar.MONTH, 6);
		fecha.set(Calendar.DAY_OF_MONTH, 2);

		Evento unEvento = new Evento();
		unEvento.setNombre("Estudiar algebra");
		unEvento.setFecha(fecha);

		Persona unaPersona = new Persona();
		unaPersona.setNombre("Juan");
		unaPersona.agregarEvento(unEvento);

		Assert.assertTrue(unaPersona.existeEvento(unEvento));
	}

	@Test
	public void testSolaparEvento(){
		Calendar fecha = Calendar.getInstance();
		fecha.set(Calendar.YEAR, 2016);
		fecha.set(Calendar.MONTH, 6);
		fecha.set(Calendar.DAY_OF_MONTH, 2);

		Evento unEvento = new Evento();
		unEvento.setNombre("Estudiar algebra");
		unEvento.setFecha(fecha);

		Persona unaPersona = new Persona();
		unaPersona.setNombre("Juan");
		unaPersona.agregarEvento(unEvento);

		Assert.assertTrue(unaPersona.existeEvento(unEvento));

		Evento otroEvento = new Evento();
		otroEvento.setNombre("Jugar Plaza");
		otroEvento.setFecha(fecha);

		unaPersona.agregarEvento(otroEvento);

		Assert.assertTrue(unaPersona.existeEvento(unEvento));
		Assert.assertTrue(unaPersona.existeEvento(otroEvento));
	}
}
