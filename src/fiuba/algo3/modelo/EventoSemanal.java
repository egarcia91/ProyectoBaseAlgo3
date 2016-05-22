package fiuba.algo3.modelo;

import java.util.Calendar;

public class EventoSemanal extends Evento {

	private int cantidadSemanas;

	@Override
	public boolean mismoTiempoEnFecha(Calendar fecha) {
		Calendar copiaFecha = (Calendar) this.fecha.clone();
		for(int i = 0; i < cantidadSemanas; i++){
			if(copiaFecha.equals(fecha)){
				return true;
			}
			copiaFecha.add(Calendar.DATE, 7);
		}
		return false;
	}

	public void setCantidadSemanas(int unaCantidadSemanas){
		this.cantidadSemanas = unaCantidadSemanas;
	}

}
