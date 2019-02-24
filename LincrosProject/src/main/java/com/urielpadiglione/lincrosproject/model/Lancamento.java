package com.urielpadiglione.lincrosproject.model;

import java.util.Calendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.JoinColumn;

//@Entity
public class Lancamento {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	Long id;
	
	@Column(name="dt_inicial")
	Calendar dataInicial;
	
	@Column(name="dt_final")
	Calendar dataFinal;
	
	@Column(name="vl_total")
	float valorTotal;
	
	@Column(name="observacao")
	String observacao;
	
	@ManyToMany
	@JoinTable(name = "lancamento_item",
        joinColumns = { @JoinColumn(name = "oid_lancamento") }, 
        inverseJoinColumns = { @JoinColumn(name = "oid_item") })
	List<Item> item;

	public List<Item> getItem() {
		return item;
	}

	public void setItem(List<Item> item) {
		this.item = item;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Calendar getDataInicial() {
		return dataInicial;
	}

	public void setDataInicial(Calendar dataInicial) {
		this.dataInicial = dataInicial;
	}

	public Calendar getDataFinal() {
		return dataFinal;
	}

	public void setDataFinal(Calendar dataFinal) {
		this.dataFinal = dataFinal;
	}

	public float getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(float valorTotal) {
		this.valorTotal = valorTotal;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
}
