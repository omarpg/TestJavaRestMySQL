package com.prueba.service;

import java.util.List;

import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.prueba.dao.LibroDao;
import com.prueba.model.Libro;

@Service
public class LibroServiceImpl implements LibroService{

	@Autowired
	private LibroDao libroDao;
	
	@Override
	public Libro saveLibro(Libro lb) {
		// TODO Auto-generated method stub
		return libroDao.save(lb);
	}

	@Override
	public Libro updateLibro(Libro lb) {
		// TODO Auto-generated method stub
		return libroDao.saveAndFlush(lb);
	}

	@Override
	public List<Libro> getAllLibroList() {
		// TODO Auto-generated method stub
		return libroDao.findAll();
	}

	@Override
	public Libro getLibro(Long id) {
		// TODO Auto-generated method stub
		return libroDao.getOne(id);
	}

	@Override
	public void deleteLibro(Long id) {
		// TODO Auto-generated method stub
		libroDao.deleteById(id);
	}

}
