package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IAlumnoDao;
import pe.edu.upc.entity.Alumno;

public class AlumnoDaoImpl implements IAlumnoDao, Serializable{

private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="pu")
	private EntityManager em;

	@Transactional
	@Override
	public void insertar(Alumno alumno) {
		em.persist(alumno);		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Alumno> listar() {
		List<Alumno> lista = new ArrayList<Alumno>();
		Query q = em.createQuery("select al from Pais al");
		lista = (List<Alumno>) q.getResultList();
		return lista;
	}

	@Transactional
	@Override	
	public void eliminar(int idAlumno) {
		Alumno alumno = new Alumno();
		alumno = em.getReference(Alumno.class, idAlumno);
		em.remove(alumno);		
	}
}
