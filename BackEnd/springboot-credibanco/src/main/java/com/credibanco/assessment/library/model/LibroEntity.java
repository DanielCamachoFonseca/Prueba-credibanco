package com.credibanco.assessment.library.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity //Clase entidad
@Table(name = "LIBRO") //Indico el nombre de la tabla al que le apunta esta clase
public class LibroEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "libtid_generator")
	@SequenceGenerator(name = "libtid_generator", sequenceName = "libro_seq", allocationSize = 1)
	@Column(name = "ID_LIBRO")
	private Long id_libro;
	
	@Column(name = "TITULO")
	private String titulo;
	
	@Column(name = "ANIO")
	private String anio;
	
	@Column(name = "GENERO")
	private String genero;
	
	@Column(name = "NUM_PAG")
	private int num_pag;
	
	@Column(name = "ID_EDITORIAL")
	private Long id_editorial;
	
	@Column(name = "ID_AUTOR")
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

	public String getAnio() {
		return anio;
	}

	public void setAnio(String anio) {
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
	
	@Override
	public String toString() {
		return "Libro [id_libro=" + id_libro + ", titulo=" + titulo + ", anio=" + anio + ", genero=" + genero
				+ ", num_pag=" + num_pag + ", id_editorial=" + id_editorial + ", id_autor=" + id_autor + "]";
	}
}
