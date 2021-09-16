package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Alquiler;

public interface IAlquilerDao {

	public void insertar(Alquiler alquiler);
	public List<Alquiler> listar();
	public void eliminar(int idAlquiler);	
	
}
