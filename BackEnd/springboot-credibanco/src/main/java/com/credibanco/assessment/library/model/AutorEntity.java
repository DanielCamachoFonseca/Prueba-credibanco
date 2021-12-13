package com.credibanco.assessment.library.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "AUTOR")
public class AutorEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "libtid_generator")
	@SequenceGenerator(name = "libtid_generator", sequenceName = "autor_seq", allocationSize = 1)
	@Column(name = "ID_AUTOR")
	private Long id_autor;
	
	@Column(name = "NOM_COMPLETO")
	private String nom_completo;
	
	@Column(name = "FECH_NACIMIENTO")
	private String fech_nacimiento;
	
	@Column(name = "CIUDAD_PROCE")
	private String ciudad_proce;
	
	@Column(name = "CORREO_ELEC")
	private String correo_elec;

	public Long getId_autor() {
		return id_autor;
	}

	public void setId_autor(Long id_autor) {
		this.id_autor = id_autor;
	}

	public String getNom_completo() {
		return nom_completo;
	}

	public void setNom_completo(String nom_completo) {
		this.nom_completo = nom_completo;
	}

	public String getFech_nacimiento() {
		return fech_nacimiento;
	}

	public void setFech_nacimiento(String fech_nacimiento) {
		this.fech_nacimiento = fech_nacimiento;
	}

	public String getCiudad_proce() {
		return ciudad_proce;
	}

	public void setCiudad_proce(String ciudad_proce) {
		this.ciudad_proce = ciudad_proce;
	}

	public String getCorreo_elec() {
		return correo_elec;
	}

	public void setCorreo_elec(String correo_elec) {
		this.correo_elec = correo_elec;
	}

	@Override
	public String toString() {
		return "Autor [id_autor=" + id_autor + ", nom_completo=" + nom_completo + ", fech_nacimiento="
				+ fech_nacimiento + ", ciudad_proce=" + ciudad_proce + ", correo_elec=" + correo_elec + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
