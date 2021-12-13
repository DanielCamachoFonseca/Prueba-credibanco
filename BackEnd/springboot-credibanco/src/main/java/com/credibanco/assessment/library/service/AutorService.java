package com.credibanco.assessment.library.service;

import java.util.List;

import com.credibanco.assessment.library.dto.Autor;
import com.credibanco.assessment.library.model.AutorEntity;

public interface AutorService {

	public Autor registrarAutor(Autor autorDto);

	public AutorEntity buscarAutor(Long id_autor);

	public List<Autor> listarAutores();

}