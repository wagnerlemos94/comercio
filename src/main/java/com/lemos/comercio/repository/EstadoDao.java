package com.lemos.comercio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lemos.comercio.dominio.Estado;

@Repository
public interface EstadoDao extends JpaRepository<Estado, Integer>{

}
