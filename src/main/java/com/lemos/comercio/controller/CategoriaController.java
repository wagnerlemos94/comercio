package com.lemos.comercio.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lemos.comercio.dominio.Categoria;
import com.lemos.comercio.service.CategoriaService;

@RestController
public class CategoriaController {
	
	@Autowired
	private CategoriaService categoriaService;
	
	@RequestMapping(value = "/categoria", method = RequestMethod.POST)
	public ResponseEntity<Void> save(@RequestBody Categoria categoria){
		categoriaService.insert(categoria);
		return ResponseEntity.ok().build();
	}
	
	@RequestMapping(value = "/categorias", method = RequestMethod.GET)
	public ResponseEntity<List<Categoria>> findAll(){
		List<Categoria> categorias = categoriaService.findAll();
		return ResponseEntity.ok().body(categorias);
	}
	
	@RequestMapping(value = "/categoria/{id}", method = RequestMethod.GET)
	public ResponseEntity<Optional<Categoria>> findById(@PathVariable Integer id){
		Optional<Categoria> categoria = categoriaService.findById(id);
		return ResponseEntity.ok().body(categoria);
	}
	
	@RequestMapping(value = "/categoria/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> deleteById(@PathVariable Integer id){
		categoriaService.delete(id);
		return ResponseEntity.ok().build();
	}
	
	@RequestMapping(value = "/categoria/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Void> update(@RequestBody Categoria categoria,@PathVariable Integer id){
		categoria.setId(id);
		categoriaService.insert(categoria);
		return ResponseEntity.ok().build();
	}

}
