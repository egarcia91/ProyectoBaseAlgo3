package fiuba.algo3.modelo;

import java.util.Calendar;

public class Evento {
	private String nombre;
	protected Calendar fecha;

	public boolean mismoTiempoEnFecha(Calendar fecha) {
		return false;
	}

	public boolean esMismo(Evento unEvento) {
		if(unEvento.getNombre() != this.nombre)
			return false;
		if(!this.mismoTiempoEnFecha(unEvento.getFecha()))
			return false;
		return true;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String unNombre) {
		this.nombre = unNombre;
	}

	public Calendar getFecha() {
		return this.fecha;
	}

	public void setFecha(Calendar unaFecha) {
		this.fecha = unaFecha;
	}
}
