package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import pe.edu.upc.entity.Alquiler;
import pe.edu.upc.service.AlquilerService;

public class AlquilerController implements Serializable {

private static final long serialVersionUID = 1L;
	
	@Inject
	private AlquilerService mService;
	private Alquiler alquiler;
	List<Alquiler> listaAlquileres;
	
	@PostConstruct
	public void init() {
		this.listaAlquileres = new ArrayList<Alquiler>();
		this.alquiler = new Alquiler();
		this.listar();
	}
	
	public String nuevoAlquiler() {
		this.setAlquiler(new Alquiler());
		return "alquiler.xhtml";
	}
	
	public void insertar() {
		mService.insertar(alquiler);
		limpiarAlquiler();
	}
	
	public void listar() {
		listaAlquileres = mService.listar();
	}

	public void limpiarAlquiler() {
		this.init();
	}
	
	public void eliminar(Alquiler alquiler) {
		mService.eliminar(alquiler.getId());
		this.listar();
	}
	
	public Alquiler getAlquiler() {
		return alquiler;
	}

	public void setAlquiler(Alquiler alquiler) {
		this.alquiler = alquiler;
	}

	public List<Alquiler> getlistaAlquileres() {
		return listaAlquileres;
	}

	public void setlistaAlquileres(List<Alquiler> listaAlquileres) {
		this.listaAlquileres = listaAlquileres;
	}
}
