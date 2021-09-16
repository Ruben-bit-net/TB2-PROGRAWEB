package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Habitacion;

public interface HabitacionService {
	public void insertar(Habitacion habitacion);
	public List<Habitacion> listar();
	public void eliminar(int idHabitacion);
}
