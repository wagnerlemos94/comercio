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

import com.lemos.comercio.dominio.Cliente;
import com.lemos.comercio.service.ClienteService;

@RestController
public class ClienteController {

	@Autowired
	private ClienteService clienteService;
	
	
	@RequestMapping(value = "/cliente", method = RequestMethod.POST)
	public ResponseEntity<Void> save(@RequestBody Cliente cliente) {
		clienteService.insert(cliente);
		return ResponseEntity.ok().build();
	}
	
	@RequestMapping(value = "/clientes", method = RequestMethod.GET)
	public ResponseEntity<List<Cliente>> findAll(){
		List<Cliente> clientes = clienteService.findAll();
		return ResponseEntity.ok().body(clientes);
	}
	
	@RequestMapping(value = "/cliente/{id}", method = RequestMethod.GET)
	public ResponseEntity<Optional<Cliente>> findById(@PathVariable Integer id){
		Optional<Cliente> cliente = clienteService.findById(id);
		return ResponseEntity.ok().body(cliente);
		
	}
	
	@RequestMapping(value = "/cliente/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> delete(@PathVariable Integer id) {
		clienteService.delete(id);
		return ResponseEntity.ok().build();
	}
	
}
