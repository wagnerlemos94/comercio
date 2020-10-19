package com.lemos.comercio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lemos.comercio.dominio.Endereco;

@Repository
public interface EnderecoDao extends JpaRepository<Endereco, Integer>{

}
