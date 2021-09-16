package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import pe.edu.upc.entity.Alumno;
import pe.edu.upc.service.AlumnoService;

public class AlumnoController implements Serializable{

private static final long serialVersionUID = 1L;
	
	@Inject
	private AlumnoService mService;
	private Alumno alumno;
	List<Alumno> listaAlumnos;
	
	@PostConstruct
	public void init() {
		this.listaAlumnos = new ArrayList<Alumno>();
		this.alumno = new Alumno();
		this.listar();
	}
	
	public String nuevoAlumno() {
		this.setAlumno(new Alumno());
		return "alumno.xhtml";
	}
	
	public void insertar() {
		mService.insertar(alumno);
		limpiarAlumno();
	}
	
	public void listar() {
		listaAlumnos = mService.listar();
	}

	public void limpiarAlumno() {
		this.init();
	}
	
	public void eliminar(Alumno alumno) {
		mService.eliminar(alumno.getId());
		this.listar();
	}
	
	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	public List<Alumno> getlistaAlumnos() {
		return listaAlumnos;
	}

	public void setlistaAlumnos(List<Alumno> listaAlumnos) {
		this.listaAlumnos = listaAlumnos;
	}
}
