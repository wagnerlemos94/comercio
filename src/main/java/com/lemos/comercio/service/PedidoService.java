package com.lemos.comercio.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lemos.comercio.dominio.Pedido;
import com.lemos.comercio.repository.PedidoDao;

@Service
public class PedidoService {
		
	@Autowired
	private PedidoDao pedidoDao;
	
	public void save(Pedido pedido) {
		pedidoDao.save(pedido);
	}
	
	
	public List<Pedido> findAll(){
		List<Pedido> pedidos = pedidoDao.findAll();
		return pedidos;
	}
	
	public Optional<Pedido> findById(Integer id){
		Optional<Pedido> pedido = pedidoDao.findById(id);
		return pedido;
	}
	
	public void delete(Integer id) {
		pedidoDao.deleteById(id);
	}
	
}
