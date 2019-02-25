package com.prueba.service;

import java.util.List;

import com.prueba.model.Libro;

public interface LibroService {

	Libro saveLibro(Libro lb);
	
	Libro updateLibro(Libro lb);
	
	List<Libro> getAllLibroList();
	
	Libro getLibro(Long id);
	
	void deleteLibro(Long id);
}
