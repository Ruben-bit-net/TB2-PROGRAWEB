package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Universidad;

public interface UniversidadService {
	public void insertar(Universidad universidad);
	public List<Universidad> listar();
	public void eliminar(int idUniversidad);
}
