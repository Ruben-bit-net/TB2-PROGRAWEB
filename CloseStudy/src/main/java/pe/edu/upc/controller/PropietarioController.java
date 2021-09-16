package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import pe.edu.upc.entity.Propietario;
import pe.edu.upc.service.PropietarioService;

public class PropietarioController implements Serializable {

private static final long serialVersionUID = 1L;
	
	@Inject
	private PropietarioService mService;
	private Propietario propietario;
	List<Propietario> listaPropietarios;
	
	@PostConstruct
	public void init() {
		this.listaPropietarios = new ArrayList<Propietario>();
		this.propietario = new Propietario();
		this.listar();
	}
	
	public String nuevoPropietario() {
		this.setPropietario(new Propietario());
		return "propietario.xhtml";
	}
	
	public void insertar() {
		mService.insertar(propietario);
		limpiarPropietario();
	}
	
	public void listar() {
		listaPropietarios = mService.listar();
	}

	public void limpiarPropietario() {
		this.init();
	}
	
	public void eliminar(Propietario propietario) {
		mService.eliminar(propietario.getId());
		this.listar();
	}
	
	public Propietario getPropietario() {
		return propietario;
	}

	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}

	public List<Propietario> getlistaPropietarios() {
		return listaPropietarios;
	}

	public void setlistaPropietarios(List<Propietario> listaPropietarios) {
		this.listaPropietarios = listaPropietarios;
	}
}
