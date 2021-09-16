package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import pe.edu.upc.entity.Universidad;
import pe.edu.upc.service.UniversidadService;

public class UniversidadController implements Serializable {

private static final long serialVersionUID = 1L;
	
	@Inject
	private UniversidadService mService;
	private Universidad universidad;
	List<Universidad> listaUniversidades;
	
	@PostConstruct
	public void init() {
		this.listaUniversidades = new ArrayList<Universidad>();
		this.universidad = new Universidad();
		this.listar();
	}
	
	public String nuevoUniversidad() {
		this.setUniversidad(new Universidad());
		return "universidad.xhtml";
	}
	
	public void insertar() {
		mService.insertar(universidad);
		limpiarUniversidad();
	}
	
	public void listar() {
		listaUniversidades = mService.listar();
	}

	public void limpiarUniversidad() {
		this.init();
	}
	
	public void eliminar(Universidad universidad) {
		mService.eliminar(universidad.getId());
		this.listar();
	}
	
	public Universidad getUniversidad() {
		return universidad;
	}

	public void setUniversidad(Universidad universidad) {
		this.universidad = universidad;
	}

	public List<Universidad> getlistaUniversidades() {
		return listaUniversidades;
	}

	public void setlistaUniversidades(List<Universidad> listaUniversidades) {
		this.listaUniversidades = listaUniversidades;
	}
}
