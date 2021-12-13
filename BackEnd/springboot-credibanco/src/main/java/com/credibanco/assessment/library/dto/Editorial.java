package com.credibanco.assessment.library.dto;

import java.io.Serializable;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Editorial implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Long id_editorial;
	
	@Size(max = 50, message = "El nombre de la editorial no puede sobrepasar los 50 caracteres")
	@NotNull(message = "El nombre de la editorial es obligatorio")
	private String nombre;
	
	@NotNull(message = "La dirección de correspondencia es obligatoria")
	@Size(min = 7, max = 50, message = "La dirección debe estar entre 7 a 50 caracteres")
	private String direcc_corres;
	
	@Digits(integer = 15, fraction = 0, message = "El número de teléfono no puede sobrepasar los 15 dígitos")
	@NotNull(message = "El teléfono de la editorial es obligatorio")
	private Long telefono;
	
	@Email(message = "El correo de la editorial debe ser válido")
	private String correo_elec;
	
	@Min(value = -1, message = "El número máximo de libros debe ser un número positivo")
	private int max_libros_reg = -1;

	public Long getId_editorial() {
		return id_editorial;
	}

	public void setId_editorial(Long id_editorial) {
		this.id_editorial = id_editorial;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDirecc_corres() {
		return direcc_corres;
	}

	public void setDirecc_corres(String direcc_corres) {
		this.direcc_corres = direcc_corres;
	}

	public Long getTelefono() {
		return telefono;
	}

	public void setTelefono(Long telefono) {
		this.telefono = telefono;
	}

	public String getCorreo_elec() {
		return correo_elec;
	}

	public void setCorreo_elec(String correo_elec) {
		this.correo_elec = correo_elec;
	}

	public int getMax_libros_reg() {
		return max_libros_reg;
	}

	public void setMax_libros_reg(int max_libros_reg) {
		this.max_libros_reg = max_libros_reg;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
