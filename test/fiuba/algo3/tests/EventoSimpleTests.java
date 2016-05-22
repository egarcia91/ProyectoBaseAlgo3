package fiuba.algo3.tests;

import java.util.ArrayList;
import java.util.List;
import java.util.Calendar;

import org.junit.Assert;
import org.junit.Test;

import fiuba.algo3.modelo.EventoSimple;

public class EventoSimpleTests {

	@Test
	public void testCrearEvento(){

		Calendar fecha = Calendar.getInstance();
		fecha.set(Calendar.YEAR, 2016);
		fecha.set(Calendar.MONTH, 6);
		fecha.set(Calendar.DAY_OF_MONTH, 2);
		EventoSimple unEvento = new EventoSimple();
		unEvento.setNombre("Estudiar algebra");
		unEvento.setFecha(fecha);

		Assert.assertTrue(unEvento.getNombre() == "Estudiar algebra");
		Assert.assertTrue(unEvento.getFecha() == fecha);
	}

	@Test
	public void testMismoTiempo(){

		Calendar fecha = Calendar.getInstance();
		fecha.set(Calendar.YEAR, 2016);
		fecha.set(Calendar.MONTH, 6);
		fecha.set(Calendar.DAY_OF_MONTH, 2);

		EventoSimple unEvento = new EventoSimple();
		unEvento.setNombre("Estudiar algebra");
		unEvento.setFecha(fecha);

		Assert.assertTrue(unEvento.mismoTiempoEnFecha(fecha));

		Calendar otraFecha = Calendar.getInstance();
		otraFecha.set(Calendar.YEAR, 2016);
		otraFecha.set(Calendar.MONTH, 6);
		otraFecha.set(Calendar.DAY_OF_MONTH, 9);

		Assert.assertFalse(unEvento.mismoTiempoEnFecha(otraFecha));
	}
}
