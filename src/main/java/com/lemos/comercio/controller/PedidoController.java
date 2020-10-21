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

import com.lemos.comercio.dominio.Pedido;
import com.lemos.comercio.service.PedidoService;

@RestController
public class PedidoController {
	
	@Autowired
	private PedidoService pedidoService;
	
	
	@RequestMapping(value = "/pedido", method = RequestMethod.POST)
	public ResponseEntity<Pedido> save(@RequestBody Pedido pedido){
		pedidoService.save(pedido);
		return ResponseEntity.ok().body(pedido);
	}
	
	@RequestMapping(value = "/pedidos", method = RequestMethod.GET)
	public ResponseEntity<List<Pedido>> findAll(){
     List<Pedido> pedidos = pedidoService.findAll();
     return ResponseEntity.ok().body(pedidos);
	}
	
	@RequestMapping(value = "/pedido", method = RequestMethod.GET)
	public ResponseEntity<Optional<Pedido>> findById(@PathVariable Integer id){
		Optional<Pedido> pedido = pedidoService.findById(id);
		return ResponseEntity.ok().body(pedido);
	}
	
	@RequestMapping(value = "/pedido", method = RequestMethod.PUT)
	public ResponseEntity<Pedido> update(@PathVariable Integer id, @RequestBody Pedido pedido){
		pedido.setId(id);
		pedidoService.save(pedido);
		return ResponseEntity.ok().body(pedido);
	}
	
	@RequestMapping(value = "/pedido", method = RequestMethod.DELETE)
	public ResponseEntity<Void> delete(@PathVariable Integer id){
		pedidoService.delete(id);
		return ResponseEntity.ok().build();
	}

}
