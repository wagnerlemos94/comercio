package com.lemos.comercio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lemos.comercio.dominio.Produto;

@Repository
public interface ProdutoDao extends JpaRepository<Produto, Integer>{

}
