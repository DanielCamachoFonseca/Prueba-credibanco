package com.credibanco.assessment.library.dto;

import java.io.Serializable;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

public class Autor implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Long id_autor;
	
	@Size(max = 50, message = "El nombre del autor no puede sobrepasar los 50 caracteres")
	@NotNull(message = "El nombre del autor es obligatorio")
	private String nom_completo;
	
	@JsonFormat(pattern = "dd-MM-yyyy", shape = Shape.STRING)
	private String fech_nacimiento;
	
	@Size(max = 50, message = "El nombre de la ciudad no puede sobrepasar los 50 caracteres")
	private String ciudad_proce;
	
	@Email(message = "El correo del autor debe ser válido")
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
