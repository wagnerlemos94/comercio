package com.lemos.comercio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lemos.comercio.dominio.Cliente;

@Repository
public interface ClienteDao extends JpaRepository<Cliente, Integer>{

}
