package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IAlquilerDao;
import pe.edu.upc.entity.Alquiler;


public class AlquilerDaoImpl implements IAlquilerDao, Serializable{

private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="pu")
	private EntityManager em;

	@Transactional
	@Override
	public void insertar(Alquiler alquiler) {
		em.persist(alquiler);		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Alquiler> listar() {
		List<Alquiler> lista = new ArrayList<Alquiler>();
		Query q = em.createQuery("select a from Pais a");
		lista = (List<Alquiler>) q.getResultList();
		return lista;
	}

	@Transactional
	@Override	
	public void eliminar(int idAlquiler) {
		Alquiler alquiler = new Alquiler();
		alquiler = em.getReference(Alquiler.class, idAlquiler);
		em.remove(alquiler);		
	}
}
