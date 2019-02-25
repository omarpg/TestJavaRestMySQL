package com.prueba.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prueba.model.Libro;

public interface LibroDao extends JpaRepository<Libro, Long> {

}
