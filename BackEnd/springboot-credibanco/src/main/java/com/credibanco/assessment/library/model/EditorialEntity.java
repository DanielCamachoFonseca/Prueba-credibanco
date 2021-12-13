package com.credibanco.assessment.library.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "EDITORIAL")
public class EditorialEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "libtid_generator")
	@SequenceGenerator(name = "libtid_generator", sequenceName = "editorial_seq", allocationSize = 1)
	@Column(name = "ID_EDITORIAL")
	private Long id_editorial;
	
	@Column(name = "NOMBRE")
	private String nombre;
	
	@Column(name = "DIRECC_CORRES")
	private String direcc_corres;
	
	@Column(name = "TELEFONO")
	private Long telefono;
	
	@Column(name = "CORREO_ELEC")
	private String correo_elec;
	
	@Column(name = "MAX_LIBROS_REG")
	private int max_libros_reg;

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

	@Override
	public String toString() {
		return "Editorial [id_editorial=" + id_editorial + ", nombre=" + nombre + ", direcc_corres="
				+ direcc_corres + ", telefono=" + telefono + ", correo_elec=" + correo_elec + ", max_libros_reg="
				+ max_libros_reg + "]";
	}
	
	

}
