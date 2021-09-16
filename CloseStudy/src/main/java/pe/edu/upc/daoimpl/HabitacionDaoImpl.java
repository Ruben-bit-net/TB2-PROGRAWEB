package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IHabitacionDao;
import pe.edu.upc.entity.Habitacion;

public class HabitacionDaoImpl implements IHabitacionDao, Serializable{

private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="pu")
	private EntityManager em;

	@Transactional
	@Override
	public void insertar(Habitacion habitacion) {
		em.persist(habitacion);		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Habitacion> listar() {
		List<Habitacion> lista = new ArrayList<Habitacion>();
		Query q = em.createQuery("select ha from Pais ha");
		lista = (List<Habitacion>) q.getResultList();
		return lista;
	}

	@Transactional
	@Override	
	public void eliminar(int idHabitacion) {
		Habitacion habitacion = new Habitacion();
		habitacion = em.getReference(Habitacion.class, idHabitacion);
		em.remove(habitacion);		
	}
}
