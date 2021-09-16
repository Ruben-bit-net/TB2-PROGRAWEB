package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Propietario;

public interface PropietarioService {
	public void insertar(Propietario propietario);
	public List<Propietario> listar();
	public void eliminar(int idPropietario);
}
