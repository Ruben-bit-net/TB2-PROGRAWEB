package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import pe.edu.upc.entity.Propiedad;
import pe.edu.upc.service.PropiedadService;

public class PropiedadController implements Serializable{

private static final long serialVersionUID = 1L;
	
	@Inject
	private PropiedadService mService;
	private Propiedad propiedad;
	List<Propiedad> listaPropiedades;
	
	@PostConstruct
	public void init() {
		this.listaPropiedades = new ArrayList<Propiedad>();
		this.propiedad = new Propiedad();
		this.listar();
	}
	
	public String nuevoPropiedad() {
		this.setPropiedad(new Propiedad());
		return "propiedad.xhtml";
	}
	
	public void insertar() {
		mService.insertar(propiedad);
		limpiarPropiedad();
	}
	
	public void listar() {
		listaPropiedades = mService.listar();
	}

	public void limpiarPropiedad() {
		this.init();
	}
	
	public void eliminar(Propiedad propiedad) {
		mService.eliminar(propiedad.getId());
		this.listar();
	}
	
	public Propiedad getPropiedad() {
		return propiedad;
	}

	public void setPropiedad(Propiedad propiedad) {
		this.propiedad = propiedad;
	}

	public List<Propiedad> getlistaPropiedades() {
		return listaPropiedades;
	}

	public void setlistaPropiedades(List<Propiedad> listaPropiedades) {
		this.listaPropiedades = listaPropiedades;
	}
}
