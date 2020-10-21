package com.lemos.comercio.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lemos.comercio.dominio.Cliente;
import com.lemos.comercio.repository.ClienteDao;

@Service
public class ClienteService {

	@Autowired
	private ClienteDao clienteDao;
	
	public void save(Cliente cliente) {
		clienteDao.save(cliente);
	}
	
	public List<Cliente> findAll(){
		List<Cliente> clientes = clienteDao.findAll();
		return clientes;
	}
	
	public Optional<Cliente> findById(Integer id) {
		Optional<Cliente> cliente = clienteDao.findById(id);
		return cliente;
	}
	
	public void delete(Integer id) {
		clienteDao.deleteById(id);
	}
	
}
