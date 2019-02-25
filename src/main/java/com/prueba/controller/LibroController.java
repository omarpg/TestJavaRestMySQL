package com.prueba.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.model.Libro;
import com.prueba.service.LibroService;

@RequestMapping("libro")
@RestController
public class LibroController {

	@Autowired
	private LibroService libroService;
	
	//Crear
	@PostMapping("/save")
	public Libro save(@RequestBody Libro libro) {
		return libroService.saveLibro(libro);
	}
	
	//Modificar
	@PutMapping("/update")
	public Libro update(@RequestBody Libro libro) {
		return libroService.updateLibro(libro);
	}
	
	//Listar todos
	@GetMapping("/all")
	public List<Libro> getAllLibros() {
		return libroService.getAllLibroList();
	}
	
	//Listar uno
	@GetMapping("/by/{id}")
	public Libro getLibro(@PathVariable(name="id") Long id) {
		return libroService.getLibro(id);
	}
	
	//Eliminar
	@DeleteMapping("/delete/{id}")
	public void deleteLibro(@PathVariable(name="id") Long id) {
		libroService.deleteLibro(id);
	}
}
