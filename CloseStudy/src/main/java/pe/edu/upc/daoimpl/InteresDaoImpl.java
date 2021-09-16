package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IInteresDao;
import pe.edu.upc.entity.Interes;

public class InteresDaoImpl implements IInteresDao, Serializable{

private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="pu")
	private EntityManager em;

	@Transactional
	@Override
	public void insertar(Interes interes) {
		em.persist(interes);		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Interes> listar() {
		List<Interes> lista = new ArrayList<Interes>();
		Query q = em.createQuery("select i from Pais i");
		lista = (List<Interes>) q.getResultList();
		return lista;
	}

	@Transactional
	@Override	
	public void eliminar(int idInteres) {
		Interes interes = new Interes();
		interes = em.getReference(Interes.class, idInteres);
		em.remove(interes);		
	}
}
