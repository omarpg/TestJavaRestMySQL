package com.prueba.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="libros")
public class Libro implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id", unique=true, nullable=false, length=20)
	private long id;
	
	@Column(name="nombre", unique=true, nullable=false, length=255)
	private String nombre;
	
	@Column(name="autor", unique=true, nullable=false, length=255)
	private String autor;
	
	@Column(name="anio", unique=true, nullable=true, length=4)
	private int anio;
	
	@Column(name="editorial", unique=true, nullable=true, length=255)
	private String editorial;
	
	@Column(name="precio", unique=true, nullable=true, length=20)
	private long precio;
	
	public Libro() {
	}
	
	public Libro(String nombre, String autor, int anio, String editorial, long precio) {
		super();
		this.nombre = nombre;
		this.autor = autor;
		this.anio = anio;
		this.editorial = editorial;
		this.precio = precio;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public long getPrecio() {
		return precio;
	}
	public void setPrecio(long precio) {
		this.precio = precio;
	}

}
