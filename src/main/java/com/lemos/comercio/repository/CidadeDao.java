package com.lemos.comercio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lemos.comercio.dominio.Cidade;

@Repository
public interface CidadeDao extends JpaRepository<Cidade, Integer>{

}
