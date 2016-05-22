package fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Calendar;

public class Calendario {
	private List<Persona> personas = new ArrayList<Persona>();
	private List<Recurso> recursos = new ArrayList<Recurso>();

	public boolean existeRecurso(String unRecurso) {
		for (Recurso recurso: this.recursos) {
			if(recurso.getNombre() == unRecurso)
				return true;
		}
		return false;
	}

	public boolean existePersona(String unaPersona) {
		for (Persona persona: this.personas) {
			if(persona.getNombre() == unaPersona)
				return true;
		}
		return false;
	}

	public void agregarRecurso(String unRecurso) {
		Recurso recurso = new Recurso();
		recurso.setNombre(unRecurso);
		this.recursos.add(recurso);
	}

	public void agregarPersona(String unaPersona) {
		Persona persona = new Persona();
		persona.setNombre(unaPersona);
		this.personas.add(persona);
	}

	public void agregarEvento(String unNombre, List<String> listaInvitados, int unAnio, int unMes, int unDia, int unaHora) {
		Calendar fecha = Calendar.getInstance();
		fecha.set(Calendar.YEAR, unAnio);
		fecha.set(Calendar.MONTH, unMes);
		fecha.set(Calendar.DAY_OF_MONTH, unDia);
		fecha.set(Calendar.DAY_OF_MONTH, unDia);
		fecha.set(Calendar.HOUR, unaHora);

		EventoSimple unEvento = new EventoSimple();
		unEvento.setNombre(unNombre);
		unEvento.setFecha(fecha);

		for (String nombre: listaInvitados) {
			for (Persona persona: this.personas){
				if(persona.getNombre() == nombre){
					persona.agregarEvento(unEvento);
				}
			}
			for (Recurso recurso: this.recursos){
				if(recurso.getNombre() == nombre){
					recurso.agregarEvento(unEvento);
				}
			}
		}
	}

	public void agregarEventoSemanal(String unNombre, int cantidadSemanas, List<String> listaInvitados, int unAnio, int unMes, int unDia, int unaHora) {
		Calendar fecha = Calendar.getInstance();
		fecha.set(Calendar.YEAR, unAnio);
		fecha.set(Calendar.MONTH, unMes);
		fecha.set(Calendar.DAY_OF_MONTH, unDia);
		fecha.set(Calendar.DAY_OF_MONTH, unDia);
		fecha.set(Calendar.HOUR, unaHora);

		EventoSemanal unEvento = new EventoSemanal();
		unEvento.setNombre(unNombre);
		unEvento.setFecha(fecha);
		unEvento.setCantidadSemanas(cantidadSemanas);

		for (String nombre: listaInvitados) {
			for (Persona persona: this.personas){
				if(persona.getNombre() == nombre){
					persona.agregarEvento(unEvento);
				}
			}
			for (Recurso recurso: this.recursos){
				if(recurso.getNombre() == nombre){
					recurso.agregarEvento(unEvento);
				}
			}
		}
	}

	public boolean estaOcupado(String unNombre, int unAnio, int unMes, int unDia, int unaHora) {
		Calendar fecha = Calendar.getInstance();
		fecha.set(Calendar.YEAR, unAnio);
		fecha.set(Calendar.MONTH, unMes);
		fecha.set(Calendar.DAY_OF_MONTH, unDia);
		fecha.set(Calendar.DAY_OF_MONTH, unDia);
		fecha.set(Calendar.HOUR, unaHora);

		for (Persona persona: this.personas){
			if(persona.getNombre() == unNombre){
				return persona.estaOcupadoEnFecha(fecha);
			}
		}
		for (Recurso recurso: this.recursos){
			if(recurso.getNombre() == unNombre){
				return recurso.estaOcupadoEnFecha(fecha);
			}
		}

		return false;
	}
}
