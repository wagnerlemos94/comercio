package com.lemos.comercio.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lemos.comercio.dominio.Produto;
import com.lemos.comercio.repository.ProdutoDao;

@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoDao produtoDao;
	
	public void save(Produto produto) {
		produtoDao.save(produto);
	}
	
	public List<Produto> findAll(){
		List<Produto> produtos = produtoDao.findAll();
		return produtos;
	}
	
	public Optional<Produto> findById(Integer id){
		Optional<Produto> produto = produtoDao.findById(id);
		return produto;
	}
	
	public void delete(Integer id) {
		produtoDao.deleteById(id);
	}

}
