package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IPropiedadDao;
import pe.edu.upc.entity.Propiedad;
import pe.edu.upc.service.PropiedadService;

@Named
@RequestScoped
public class PropiedadServiceImpl implements PropiedadService, Serializable{

private static final long serialVersionUID = 1L;
	
	@Inject
	private IPropiedadDao mD;

	@Override
	public void insertar(Propiedad propiedad) {
		mD.insertar(propiedad);		
	}

	@Override
	public List<Propiedad> listar() {
		return mD.listar();
	}

	@Override
	public void eliminar(int idPropiedad) {
		mD.eliminar(idPropiedad);
	}
}
