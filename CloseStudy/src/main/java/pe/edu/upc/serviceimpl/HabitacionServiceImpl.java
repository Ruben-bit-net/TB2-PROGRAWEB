package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IHabitacionDao;
import pe.edu.upc.entity.Habitacion;
import pe.edu.upc.service.HabitacionService;

@Named
@RequestScoped
public class HabitacionServiceImpl implements HabitacionService, Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IHabitacionDao mD;

	@Override
	public void insertar(Habitacion habitacion) {
		mD.insertar(habitacion);		
	}

	@Override
	public List<Habitacion> listar() {
		return mD.listar();
	}

	@Override
	public void eliminar(int idHabitacion) {
		mD.eliminar(idHabitacion);		
	}
}
