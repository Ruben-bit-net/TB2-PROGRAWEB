package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IUniversidadDao;
import pe.edu.upc.entity.Universidad;
import pe.edu.upc.service.UniversidadService;

@Named
@RequestScoped
public class UniversidadServiceImpl implements UniversidadService, Serializable{

private static final long serialVersionUID = 1L;
	
	@Inject
	private IUniversidadDao mD;

	@Override
	public void insertar(Universidad universidad) {
		mD.insertar(universidad);		
	}

	@Override
	public List<Universidad> listar() {
		return mD.listar();
	}

	@Override
	public void eliminar(int idUniversidad) {
		mD.eliminar(idUniversidad);
	}
}
