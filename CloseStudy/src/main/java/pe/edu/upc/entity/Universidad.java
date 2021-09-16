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
@Table(name = "Universidades")
public class Universidad implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "universidad_id")
	private Integer id;
	
	@Column(name = "universidad_name", length = 50)
	private String name;
	
	private List<Alumno> alumnos;
	
	public Universidad() {
		super();
		alumnos = new ArrayList<Alumno>();
	}

	public Universidad(Integer id, String name, List<Alumno> alumnos) {
		super();
		this.id = id;
		this.name = name;
		this.alumnos = alumnos;
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

	public List<Alumno> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(List<Alumno> alumnos) {
		this.alumnos = alumnos;
	}

}
