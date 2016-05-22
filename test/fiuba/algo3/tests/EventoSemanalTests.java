package fiuba.algo3.tests;

import java.util.ArrayList;
import java.util.List;
import java.util.Calendar;

import org.junit.Assert;
import org.junit.Test;

import fiuba.algo3.modelo.EventoSemanal;

public class EventoSemanalTests {

	@Test
	public void testCrearEvento(){

		Calendar fecha = Calendar.getInstance();
		fecha.set(Calendar.YEAR, 2016);
		fecha.set(Calendar.MONTH, 6);
		fecha.set(Calendar.DAY_OF_MONTH, 2);
		EventoSemanal unEvento = new EventoSemanal();
		unEvento.setNombre("Estudiar algebra");
		unEvento.setFecha(fecha);
		unEvento.setCantidadSemanas(5);

		Assert.assertTrue(unEvento.getNombre() == "Estudiar algebra");
	}

	@Test
	public void testMismoTiempo(){

		Calendar fecha = Calendar.getInstance();
		fecha.set(Calendar.YEAR, 2016);
		fecha.set(Calendar.MONTH, 6);
		fecha.set(Calendar.DAY_OF_MONTH, 2);

		EventoSemanal unEvento = new EventoSemanal();
		unEvento.setNombre("Estudiar algebra");
		unEvento.setFecha(fecha);
		unEvento.setCantidadSemanas(2);

		Assert.assertTrue(unEvento.mismoTiempoEnFecha(fecha));
/*
		fecha.add(Calendar.DATE, 7);
		Assert.assertTrue(unEvento.mismoTiempoEnFecha(fecha));

		fecha.add(Calendar.DATE, 7);
		Assert.assertFalse(unEvento.mismoTiempoEnFecha(fecha));
*/
	}
}
