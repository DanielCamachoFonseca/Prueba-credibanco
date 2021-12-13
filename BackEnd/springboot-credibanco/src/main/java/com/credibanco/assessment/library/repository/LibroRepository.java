package com.credibanco.assessment.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface LibroRepository extends JpaRepository<LibroRepository, Long> {
	
	@Query("SELECT COUNT(l) FROM LibroEntity l WHERE l.id_editorial =:id_editorial")
	long contarLibros(Long editorial_id);

}
