package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IUniversidadDao;
import pe.edu.upc.entity.Universidad;

public class UniversidadDaoImpl implements IUniversidadDao, Serializable{

private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="pu")
	private EntityManager em;

	@Transactional
	@Override
	public void insertar(Universidad universidad) {
		em.persist(universidad);		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Universidad> listar() {
		List<Universidad> lista = new ArrayList<Universidad>();
		Query q = em.createQuery("select a from Pais a");
		lista = (List<Universidad>) q.getResultList();
		return lista;
	}

	@Transactional
	@Override	
	public void eliminar(int idUniversidad) {
		Universidad universidad = new Universidad();
		universidad = em.getReference(Universidad.class, idUniversidad);
		em.remove(universidad);		
	}
}
