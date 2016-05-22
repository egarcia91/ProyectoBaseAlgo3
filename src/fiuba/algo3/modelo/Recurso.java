package fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Calendar;

public class Recurso extends Miembro {

	@Override
	public void agregarEvento(Evento unEvento) {
		if(this.estaOcupadoEnFecha(unEvento.getFecha())){
			throw new RecursoOcupadoException();
		} else {
			this.eventos.add(unEvento);
		}
	}

}
