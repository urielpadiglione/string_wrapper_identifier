package com.urielpadiglione.lincrosproject.model;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

//@Entity
public class Item {
	 
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="oid")
	Long id;
	
	@Column(name="descricao")
	String descricao;
	
	@Column(name="valor")
	float valor;
	
	@ManyToMany(mappedBy = "lancamento")
	List<Lancamento> lancamento;

	public List<Lancamento> getLancamento() {
		return lancamento;
	}

	public void setLancamento(List<Lancamento> lancamento) {
		this.lancamento = lancamento;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	
}
