package fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Calendar;

public class Miembro {
	private String nombre;
	protected List<Evento> eventos = new ArrayList<Evento>();

	public void setNombre(String unNombre) {
		this.nombre = unNombre;
	}

	public String getNombre() {
		return this.nombre;
	}

	public boolean existeEvento(Evento unEvento) {
		for (Evento evento: this.eventos) {
			if(evento.esMismo(unEvento))
				return true;
		}
		return false;
	}

	public void agregarEvento(Evento unEvento) {
		this.eventos.add(unEvento);
	}

	public boolean estaOcupadoEnFecha(Calendar unaFecha) {
		for (Evento evento: this.eventos) {
			if(evento.mismoTiempoEnFecha(unaFecha))
				return true;
		}
		return false;
	}
}

