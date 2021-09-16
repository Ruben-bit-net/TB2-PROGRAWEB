package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IInteresDao;
import pe.edu.upc.entity.Interes;
import pe.edu.upc.service.InteresService;

@Named
@RequestScoped
public class InteresServiceImpl implements InteresService, Serializable {

private static final long serialVersionUID = 1L;
	
	@Inject
	private IInteresDao mD;

	@Override
	public void insertar(Interes interes) {
		mD.insertar(interes);		
	}

	@Override
	public List<Interes> listar() {
		return mD.listar();
	}

	@Override
	public void eliminar(int idInteres) {
		mD.eliminar(idInteres);		
	}
}
