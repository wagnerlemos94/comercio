package com.lemos.comercio.dominio;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Endereco implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotNull
	private String logadouro;
	
	@NotNull
	private String numero;
	
	@NotNull
	private String complemento;
	
	@NotNull
	private String bairro;
	
	@NotNull
	private String cep;
	
	@NotNull
	@OneToOne(fetch = FetchType.EAGER)
	private Cidade cidade;
	

}
