package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IPropiedadDao;
import pe.edu.upc.entity.Propiedad;

public class PropiedadDaoImpl implements IPropiedadDao, Serializable {

private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="pu")
	private EntityManager em;

	@Transactional
	@Override
	public void insertar(Propiedad propiedad) {
		em.persist(propiedad);		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Propiedad> listar() {
		List<Propiedad> lista = new ArrayList<Propiedad>();
		Query q = em.createQuery("select pr from Pais pr");
		lista = (List<Propiedad>) q.getResultList();
		return lista;
	}

	@Transactional
	@Override	
	public void eliminar(int idPropiedad) {
		Propiedad propiedad = new Propiedad();
		propiedad = em.getReference(Propiedad.class, idPropiedad);
		em.remove(propiedad);		
	}
}
