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

import com.lemos.comercio.dominio.Produto;
import com.lemos.comercio.service.ProdutoService;

@RestController
public class ProdutoController {
	
	@Autowired
	private ProdutoService produtoService;
	
	@RequestMapping(value = "/produto", method = RequestMethod.POST)
	public ResponseEntity<Produto> save(@RequestBody Produto produto){
		produtoService.save(produto);
		return ResponseEntity.ok().body(produto);
	}
	
	@RequestMapping(value = "/produtos", method = RequestMethod.GET)
	public ResponseEntity<List<Produto>> findAll(){
		List<Produto> produtos = produtoService.findAll();
		return ResponseEntity.ok().body(produtos);
	}
	
	@RequestMapping(value = "/produto", method = RequestMethod.GET)
	public ResponseEntity<Optional<Produto>> findById(@PathVariable Integer id){
		Optional<Produto> produto = produtoService.findById(id);
		return ResponseEntity.ok().body(produto);
	}
	
	@RequestMapping(value = "/produto", method = RequestMethod.DELETE)
	public ResponseEntity<Void> delete(@PathVariable Integer id){
		produtoService.delete(id);
		return ResponseEntity.ok().build();
	}
	
	@RequestMapping(value = "/produto", method = RequestMethod.PUT)
	public ResponseEntity<Produto> update(@PathVariable Integer id, @RequestBody Produto produto){
		produto.setId(id);
		produtoService.save(produto);
		return ResponseEntity.ok().body(produto);
	}

}
