package br.edu.infnet.appvenda.model.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="TRoupa")
public class Roupa extends Produto {
	
	private String tecido;
	private String tamanho;
	private Boolean possuiEstampa;	
	
	
	@Override
	public String toString() {
		return String.format("%s - %s - %s - %s", super.toString(), tecido, tamanho, possuiEstampa);
	}
	
	public Roupa(int codigo, String descricao, float preco, boolean estoque, String tecido, String tamanho, Boolean possuiEstampa) {
		super(codigo, descricao, preco, estoque);
		this.tecido = tecido;
		this.tamanho = tamanho;
		this.possuiEstampa = possuiEstampa;
	}
	
	public Roupa() {
		// TODO Auto-generated constructor stub
	}

	public String getTecido() {
		return tecido;
	}
	public void setTecido(String tecido) {
		this.tecido = tecido;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	public boolean isPossuiEstampa() {
		return possuiEstampa;
	}
	public void setPossuiEstampa(Boolean possuiEstampa) {
		this.possuiEstampa = possuiEstampa;
	}
}
