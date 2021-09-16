package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Habitacion;

public interface IHabitacionDao {
	public void insertar(Habitacion habitacion);
	public List<Habitacion> listar();
	public void eliminar(int idHabitacion);
}
