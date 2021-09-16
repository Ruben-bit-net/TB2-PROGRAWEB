package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Alumno;

public interface IAlumnoDao {
	public void insertar(Alumno alumno);
	public List<Alumno> listar();
	public void eliminar(int idAlumno);	
}
