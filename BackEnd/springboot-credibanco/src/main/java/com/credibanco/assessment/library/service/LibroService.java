package com.credibanco.assessment.library.service;
import java.util.List;
import com.credibanco.assessment.library.dto.Libro;

public interface LibroService {

	public Libro registrarLibro(Libro libroDto);

	public long contarLibros(Long id_editorial);

	public List<Libro> buscarLibros(String titulo, int anio, String nom_completo, Long editorial_id,
			Long autor_id);

}
