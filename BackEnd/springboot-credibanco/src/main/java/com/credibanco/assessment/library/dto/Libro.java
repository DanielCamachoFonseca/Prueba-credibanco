package com.credibanco.assessment.library.dto;

import java.io.Serializable;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
public class Libro implements Serializable {
		
	private static final long serialVersionUID = 1L;
	
	private Long id_libro;
	
	@Size(max = 50, message = "El titulo del libro solo puede tener hasta 50 caracteres")
	@NotNull(message = "El titulo del libro es obligatorio")
	private String titulo;
	
	@Max(value=2021, message = "El año del libro no puede ser mayor a 2021")
	private int anio;
	
	@NotNull(message="El genero del libro es obligatorio")
	private String genero;
	
	@Min(value = 1, message = "Debe haber mínimo una página del libro")
	@NotNull(message = "El número de páginas es obligatorio")
	private int num_pag;
	
	@Min(value = 1, message = "El ID de la editorial debe ser mayor o igual a 1")
	@NotNull(message = "Se debe indicar el ID de la editorial")
	private Long id_editorial;
	
	@Min(value = 1, message = "El ID del autor debe ser mayor o igual a 1")
	@NotNull(message = "Se debe indicar el ID del autor")
	private Long id_autor;

	public Long getId_libro() {
		return id_libro;
	}

	public void setId_libro(Long id_libro) {
		this.id_libro = id_libro;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getNum_pag() {
		return num_pag;
	}

	public void setNum_pag(int num_pag) {
		this.num_pag = num_pag;
	}

	public Long getId_editorial() {
		return id_editorial;
	}

	public void setId_editorial(Long id_editorial) {
		this.id_editorial = id_editorial;
	}

	public Long getId_autor() {
		return id_autor;
	}


	public void setId_autor(Long id_autor) {
		this.id_autor = id_autor;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
