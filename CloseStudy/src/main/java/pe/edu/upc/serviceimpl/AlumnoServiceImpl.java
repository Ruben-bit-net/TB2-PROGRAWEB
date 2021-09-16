package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IAlumnoDao;
import pe.edu.upc.entity.Alumno;
import pe.edu.upc.service.AlumnoService;

@Named
@RequestScoped
public class AlumnoServiceImpl implements AlumnoService, Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Inject
	private IAlumnoDao mD;

	@Override
	public void insertar(Alumno alumno) {
		mD.insertar(alumno);		
	}

	@Override
	public List<Alumno> listar() {
		return mD.listar();
	}

	@Override
	public void eliminar(int idAlumno) {
		mD.eliminar(idAlumno);		
	}
}
