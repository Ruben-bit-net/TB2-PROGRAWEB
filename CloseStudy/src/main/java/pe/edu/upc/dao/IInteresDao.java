package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Interes;

public interface IInteresDao {
	public void insertar(Interes interes);
	public List<Interes> listar();
	public void eliminar(int idInteres);
}
