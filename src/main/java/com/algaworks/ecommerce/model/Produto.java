package com.algaworks.ecommerce.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Produto {

	@Id
	private Integer id;

	@Column
	private String nome;

	@Column
	private String descricao;

	@Column
	private BigDecimal preco;
}