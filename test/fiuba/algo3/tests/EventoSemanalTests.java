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
		fecha.set(Calendar.HOUR_OF_DAY, 10);
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
		fecha.set(Calendar.HOUR_OF_DAY, 10);

		EventoSemanal unEvento = new EventoSemanal();
		unEvento.setNombre("Estudiar algebra");
		unEvento.setFecha(fecha);
		unEvento.setCantidadSemanas(2);

		Assert.assertTrue(unEvento.mismoTiempoEnFecha(fecha));

		Calendar otraFecha = Calendar.getInstance();
		otraFecha.set(Calendar.YEAR, 2016);
		otraFecha.set(Calendar.MONTH, 6);
		otraFecha.set(Calendar.DAY_OF_MONTH, 9);
		otraFecha.set(Calendar.HOUR_OF_DAY, 10);

		Assert.assertTrue(unEvento.mismoTiempoEnFecha(otraFecha));

		Calendar tercerFecha = Calendar.getInstance();
		tercerFecha.set(Calendar.YEAR, 2016);
		tercerFecha.set(Calendar.MONTH, 6);
		tercerFecha.set(Calendar.DAY_OF_MONTH, 16);
		tercerFecha.set(Calendar.HOUR_OF_DAY, 10);

		Assert.assertFalse(unEvento.mismoTiempoEnFecha(tercerFecha));

	}
}
