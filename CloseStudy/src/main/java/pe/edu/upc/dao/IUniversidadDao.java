package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Universidad;

public interface IUniversidadDao {
	public void insertar(Universidad universidad);
	public List<Universidad> listar();
	public void eliminar(int idUniversidad);
}
