package br.edu.infnet.appvenda.model.domain;

import java.util.List;

public class Vendedor {
	private String nome;
	private String cpf;
	private String email;
	
	private List<Produto> produtos;
	
	@Override
	public String toString() {
		return String.format("%s - %s - %s", nome, cpf, email);
	}
	public Vendedor(String nome, String cpf, String email) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
	}
	public Vendedor() {
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<Produto> getProdutos() {
		return produtos;
	}
	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
}
