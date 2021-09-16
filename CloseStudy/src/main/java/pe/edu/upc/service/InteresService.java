package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Interes;

public interface InteresService {
	public void insertar(Interes interes);
	public List<Interes> listar();
	public void eliminar(int idInteres);
}
