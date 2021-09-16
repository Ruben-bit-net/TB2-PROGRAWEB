package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Propiedad;

public interface IPropiedadDao {
	public void insertar(Propiedad propiedad);
	public List<Propiedad> listar();
	public void eliminar(int idPropiedad);
}
