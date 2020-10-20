package com.lemos.comercio.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lemos.comercio.dominio.Categoria;
import com.lemos.comercio.repository.CategoriaDao;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaDao categoriaDao;
	
	public void insert(Categoria categoria) {
		categoriaDao.save(categoria);
	}
	
	public List<Categoria> findAll(){
		List<Categoria> categorias = categoriaDao.findAll();
		return categorias;
	}
	
	public Optional<Categoria> findById(Integer id){
		Optional<Categoria> categorias = categoriaDao.findById(id);
		return categorias;
	}
	
	public void delete(Integer id) {
		categoriaDao.deleteById(id);
	}

}
