package fiuba.algo3.modelo;

import java.util.Calendar;

public class EventoSemanal extends Evento {

	private int cantidadSemanas;

	@Override
	public boolean mismoTiempoEnFecha(Calendar unaFecha) {
		Calendar copiaFecha = Calendar.getInstance();
		copiaFecha.set(Calendar.YEAR,this.fecha.get(Calendar.YEAR));
		copiaFecha.set(Calendar.MONTH,this.fecha.get(Calendar.MONTH));
		copiaFecha.set(Calendar.DAY_OF_MONTH,this.fecha.get(Calendar.DAY_OF_MONTH));
		copiaFecha.set(Calendar.HOUR,this.fecha.get(Calendar.HOUR));
		for(int i = 0; i < this.cantidadSemanas; i++){
			if(copiaFecha.equals(unaFecha)){
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
