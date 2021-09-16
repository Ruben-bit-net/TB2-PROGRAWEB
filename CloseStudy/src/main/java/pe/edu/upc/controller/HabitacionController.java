package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import pe.edu.upc.entity.Habitacion;
import pe.edu.upc.service.HabitacionService;

public class HabitacionController implements Serializable {

private static final long serialVersionUID = 1L;
	
	@Inject
	private HabitacionService mService;
	private Habitacion habitacion;
	List<Habitacion> listaHabitaciones;
	
	@PostConstruct
	public void init() {
		this.listaHabitaciones = new ArrayList<Habitacion>();
		this.habitacion = new Habitacion();
		this.listar();
	}
	
	public String nuevoHabitacion() {
		this.setHabitacion(new Habitacion());
		return "habitacion.xhtml";
	}
	
	public void insertar() {
		mService.insertar(habitacion);
		limpiarHabitacion();
	}
	
	public void listar() {
		listaHabitaciones = mService.listar();
	}

	public void limpiarHabitacion() {
		this.init();
	}
	
	public void eliminar(Habitacion habitacion) {
		mService.eliminar(habitacion.getId());
		this.listar();
	}
	
	public Habitacion getHabitacion() {
		return habitacion;
	}

	public void setHabitacion(Habitacion habitacion) {
		this.habitacion = habitacion;
	}

	public List<Habitacion> getlistaHabitaciones() {
		return listaHabitaciones;
	}

	public void setlistaHabitaciones(List<Habitacion> listaHabitaciones) {
		this.listaHabitaciones = listaHabitaciones;
	}
}
