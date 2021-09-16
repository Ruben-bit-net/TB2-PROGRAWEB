package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IAlquilerDao;
import pe.edu.upc.entity.Alquiler;
import pe.edu.upc.service.AlquilerService;

@Named
@RequestScoped
public class AlquilerServiceImpl implements AlquilerService, Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IAlquilerDao mD;

	@Override
	public void insertar(Alquiler alquiler) {
		mD.insertar(alquiler);		
	}

	@Override
	public List<Alquiler> listar() {
		return mD.listar();
	}

	@Override
	public void eliminar(int idAlquiler) {
		mD.eliminar(idAlquiler);		
	}
}
