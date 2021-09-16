package pe.edu.upc.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "propiedades")
public class Propiedad implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "propiedad_id")
	private Integer id;
	
	@Column(name = "propiedad_name", length = 60)
	private String name;

	private List<Habitacion> habitaciones;
	
	public Propiedad() {
		super();
		setHabitaciones(new ArrayList<Habitacion>());
	}
	
	
	public Propiedad(Integer id, String name, List<Habitacion> habitaciones) {
		super();
		this.id = id;
		this.name = name;
		this.setHabitaciones(habitaciones);
	}


	public List<Habitacion> getHabitaciones() {
		return habitaciones;
	}


	public void setHabitaciones(List<Habitacion> habitaciones) {
		this.habitaciones = habitaciones;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

}

