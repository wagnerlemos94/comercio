package com.lemos.comercio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lemos.comercio.dominio.Pedido;

@Repository
public interface PedidoDao extends JpaRepository<Pedido, Integer>{

}
