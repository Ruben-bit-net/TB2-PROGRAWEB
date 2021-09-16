package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Alumno;

public interface AlumnoService {
	public void insertar(Alumno alumno);
	public List<Alumno> listar();
	public void eliminar(int idAlumno);	
}
