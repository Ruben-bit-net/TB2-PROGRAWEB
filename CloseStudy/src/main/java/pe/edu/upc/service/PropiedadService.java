package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Propiedad;

public interface PropiedadService {
	public void insertar(Propiedad propiedad);
	public List<Propiedad> listar();
	public void eliminar(int idPropiedad);
}
