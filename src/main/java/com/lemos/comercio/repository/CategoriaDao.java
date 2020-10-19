package com.lemos.comercio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lemos.comercio.dominio.Categoria;

@Repository
public interface CategoriaDao extends JpaRepository<Categoria, Integer>{

}
