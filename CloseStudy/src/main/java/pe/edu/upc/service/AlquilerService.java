package pe.edu.upc.service;
import java.util.List;

import pe.edu.upc.entity.Alquiler;


public interface AlquilerService {
	
	public void insertar(Alquiler alquiler);
	public List<Alquiler> listar();
	public void eliminar(int idAlquiler);	
	
}
