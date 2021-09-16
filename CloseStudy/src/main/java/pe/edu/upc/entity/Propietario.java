package pe.edu.upc.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Propietario")
public class Propietario implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "propietario_id")
	private Integer id;
	
	@Column(name = "propietario_name", length = 20)
	private String name;
	
	@Column(name = "propietario_last_name", length = 20)
	private String last_name;
	
	@Column(name = "propietario_dni",columnDefinition = "NUMERIC(8)")
	private Integer dni;
	
	@Column(name = "propietario_mail", length = 30)
	private String mail;
	
	@Column(name = "propietario_psword", length = 12)
	private String psword;
	
	@Column(name = "propietario_born")
	
	private Date born;
	
	@Column(name = "propietario_cell",columnDefinition = "NUMERIC(9)")
	private Integer cell;
	
	@Column(name = "propietario_status")
	private Boolean status ;
	

	private List<Propiedad> propiedades;
	
	
	public Propietario() {
		super();
		propiedades = new ArrayList<Propiedad>();
	}
	
	public Propietario(Integer id, String name, String last_name, Integer dni, String mail, String psword, Date born,
			Integer cell, Boolean status, List<Propiedad> propiedades) {
		super();
		this.id = id;
		this.name = name;
		this.last_name = last_name;
		this.dni = dni;
		this.mail = mail;
		this.psword = psword;
		this.born = born;
		this.cell = cell;
		this.status = status;
		this.propiedades = propiedades;
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

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPsword() {
		return psword;
	}

	public void setPsword(String psword) {
		this.psword = psword;
	}

	public Date getBorn() {
		return born;
	}

	public void setBorn(Date born) {
		this.born = born;
	}

	public Integer getCell() {
		return cell;
	}

	public void setCell(Integer cell) {
		this.cell = cell;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public List<Propiedad> getPropiedades() {
		return propiedades;
	}

	public void setPropiedades(List<Propiedad> propiedades) {
		this.propiedades = propiedades;
	}
	
}

