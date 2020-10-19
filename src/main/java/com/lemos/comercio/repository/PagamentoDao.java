package com.lemos.comercio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lemos.comercio.dominio.Pagamento;

@Repository
public interface PagamentoDao extends JpaRepository<Pagamento, Integer>{

}
