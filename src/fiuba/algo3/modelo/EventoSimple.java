package fiuba.algo3.modelo;

import java.util.Calendar;

public class EventoSimple extends Evento {

	@Override
	public boolean mismoTiempoEnFecha(Calendar fecha) {
		return this.fecha.equals(fecha);
	}

}
