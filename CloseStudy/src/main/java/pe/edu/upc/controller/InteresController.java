package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import pe.edu.upc.entity.Interes;
import pe.edu.upc.service.InteresService;

public class InteresController implements Serializable{

private static final long serialVersionUID = 1L;
	
	@Inject
	private InteresService mService;
	private Interes interes;
	List<Interes> listaIntereses;
	
	@PostConstruct
	public void init() {
		this.listaIntereses = new ArrayList<Interes>();
		this.interes = new Interes();
		this.listar();
	}
	
	public String nuevoInteres() {
		this.setInteres(new Interes());
		return "interes.xhtml";
	}
	
	public void insertar() {
		mService.insertar(interes);
		limpiarInteres();
	}
	
	public void listar() {
		listaIntereses = mService.listar();
	}

	public void limpiarInteres() {
		this.init();
	}
	
	public void eliminar(Interes interes) {
		mService.eliminar(interes.getId());
		this.listar();
	}
	
	public Interes getInteres() {
		return interes;
	}

	public void setInteres(Interes interes) {
		this.interes = interes;
	}

	public List<Interes> getlistaIntereses() {
		return listaIntereses;
	}

	public void setlistaIntereses(List<Interes> listaIntereses) {
		this.listaIntereses = listaIntereses;
	}
}
