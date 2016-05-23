package fiuba.algo3.tests;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import fiuba.algo3.modelo.Recurso;
import fiuba.algo3.modelo.EventoSimple;
import fiuba.algo3.modelo.RecursoOcupadoException;
import java.util.Calendar;

public class RecursoTests {

	@Test
	public void testCrearRecurso(){
		Recurso unRecurso = new Recurso();
		unRecurso.setNombre("Proyector");
		
		Assert.assertTrue(unRecurso.getNombre() == "Proyector");
	}

	@Test
	public void testEstaOcupado(){

		Calendar fecha = Calendar.getInstance();
		fecha.set(Calendar.YEAR, 2016);
		fecha.set(Calendar.MONTH, 6);
		fecha.set(Calendar.DAY_OF_MONTH, 2);
		fecha.set(Calendar.HOUR_OF_DAY, 10);

		EventoSimple unEvento = new EventoSimple();
		unEvento.setNombre("Estudiar algebra");
		unEvento.setFecha(fecha);

		Recurso unRecurso = new Recurso();
		unRecurso.setNombre("Proyector");
		unRecurso.agregarEvento(unEvento);

		Assert.assertTrue(unRecurso.estaOcupadoEnFecha(fecha));
	}

	@Test
	public void testAgregarEvento(){
		Calendar fecha = Calendar.getInstance();
		fecha.set(Calendar.YEAR, 2016);
		fecha.set(Calendar.MONTH, 6);
		fecha.set(Calendar.DAY_OF_MONTH, 2);
		fecha.set(Calendar.HOUR_OF_DAY, 10);

		EventoSimple unEvento = new EventoSimple();
		unEvento.setNombre("Estudiar algebra");
		unEvento.setFecha(fecha);

		Recurso unRecurso = new Recurso();
		unRecurso.setNombre("Proyector");
		unRecurso.agregarEvento(unEvento);

		Assert.assertTrue(unRecurso.existeEvento(unEvento));
	}

	@Test(expected=RecursoOcupadoException.class)
	public void testSolaparEvento(){
		Calendar fecha = Calendar.getInstance();
		fecha.set(Calendar.YEAR, 2016);
		fecha.set(Calendar.MONTH, 6);
		fecha.set(Calendar.DAY_OF_MONTH, 2);
		fecha.set(Calendar.HOUR_OF_DAY, 10);

		EventoSimple unEvento = new EventoSimple();
		unEvento.setNombre("Estudiar algebra");
		unEvento.setFecha(fecha);

		Recurso unRecurso = new Recurso();
		unRecurso.setNombre("Proyector");
		unRecurso.agregarEvento(unEvento);

		Assert.assertTrue(unRecurso.existeEvento(unEvento));

		EventoSimple otroEvento = new EventoSimple();
		otroEvento.setNombre("Jugar Plaza");
		otroEvento.setFecha(fecha);

		unRecurso.agregarEvento(otroEvento);

		Assert.assertTrue(unRecurso.existeEvento(unEvento));
		Assert.assertFalse(unRecurso.existeEvento(otroEvento));
	}
}
