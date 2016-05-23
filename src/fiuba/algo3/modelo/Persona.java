package fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Calendar;

public class Persona extends Miembro {

	@Override
	public void agregarEvento(Evento unEvento) {
		this.eventos.add(unEvento);
	}

}
